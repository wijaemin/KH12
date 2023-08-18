package com.kh1.springhome.conroller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.springhome.dao.BoardDao;
import com.kh1.springhome.dao.MemberDao;
import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.dto.BoardListDto;
import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.error.AuthorityException;
import com.kh1.springhome.error.NoTargetException;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardDao boardDao;
	@Autowired
	MemberDao memberDao;
	
	//등록(새글 or 답글)
	//-board_parent라는 항목에 유무에 따라 새글과 답글을 구분하여 처리
	@GetMapping("/write")
	public String write(HttpSession session, Model model, @RequestParam(required = false) Integer board_parent) {
		
		//답글이라면 원본글정보를 화면에 전달
		if(board_parent != null) {
			BoardDto orginDto = boardDao.detail(board_parent);
			model.addAttribute("orginDto",orginDto);
			model.addAttribute("isReply",true);
		}
		else {
			model.addAttribute("isReply",false);
		} 
		String memberId = (String) session.getAttribute("name");

		boolean isLogin = memberId != null;
		if (isLogin) {
			return "/WEB-INF/views/board/write.jsp";
		} else {
			return "/WEB-INF/views/member/login.jsp";
		}
	}

	@PostMapping("/write")

	public String write(@ModelAttribute BoardDto boardDto,
			HttpSession session) {
		String board_writer =(String) session.getAttribute("name");

		int board_no = boardDao.sequence();
		boardDto.setBoard_no(board_no);
		boardDto.setBoard_writer(board_writer);
		
		//글을 등록하기 전에 새글/답글에 따른 그룹,상위글,차수를 계산
//		if(새글) {그룹번호는 글번호
//			상위글번호는 null
//			차수는 0
//		}
//		else {
//			그룹번호 는 원본글 그룹번호
//			상위글번호는 원본글 번호
//			차수는 원본글 차수 +1
//		}
		
		if(boardDto.getBoard_parent() ==null) { //새글일경우
			boardDto.setBoard_group(board_no);//그룹번호는 글번호로 설정
			//boardDto.setBoard_parent(null)//상위글 번호는 null로 설정
			//boardDto.setBoard_depth(0)// 차수 0으로 설정
		}
		else { //답글일 경우
			BoardDto originDto =boardDao.detail(boardDto.getBoard_parent());//그룹번호 는 원본글 그룹번호
			boardDto.setBoard_group(originDto.getBoard_group()); //상위글번호는 원본글 번호
			//boardDto.setBoard_parent(originDto.getBoard_no());//	상위글번호는 원본글 번호
			boardDto.setBoard_depth(originDto.getBoard_depth()+1);//	차수 원본글 차수 +1
		}
		//이사용자의 마지막 글번호 조회
		Integer lastNo = boardDao.selectMax(board_writer);
		 //글을 등록하고
		boardDao.write(boardDto);
		
		//포인트 계산작업
		//lastNo가 null이라는 것은 처음 글을 작성했다는 의미
		//lastNo가 null이 아니면 조회한다음 시간차 비교
		if(lastNo == null) {	//처음이라면 
			memberDao.increaseMeberPoint(board_writer, 50); }//포인트 50점 부여
		else {//처음이 아니라면 시간차이를 계산
			BoardDto lastDto = boardDao.detail(lastNo);
			Timestamp stamp = new Timestamp(lastDto.getBoard_ctime().getTime());
			LocalDateTime lastTime = stamp.toLocalDateTime();
			LocalDateTime currentTime = LocalDateTime.now();
			
			Duration duration =Duration.between(lastTime, currentTime); //두시간의 차이 구하기
			long seconds = duration.getSeconds(); // 차이를 초로 변환
			if(seconds>300) { //시간차가 5분(300초)보다 크다면
				memberDao.increaseMeberPoint(board_writer, 10); }//포인트 10점 부여}
		}
		return "redirect:detail?board_no="+board_no;
	}

	
	// 목록+검색
	// 검색일경우 type과 keyword라는 파라미터가 존재
	// 목록일경우 type과 keyword라는 파라미터가 없음
	// 만약 불완전한 상태( type이나 keyword만 있는경우)목록으로 처리
	
	@RequestMapping("/list")
	public String list(Model model, HttpSession session, BoardDto boardDto,
			@RequestParam(required = false) String type,
			@RequestParam(required = false) String keyword,
			@RequestParam(required = false, defaultValue = "1") int page) {
		boolean isSearch = type != null && keyword != null;
		
		
		//페이징과 관련된 값들을 계산하여 JSP로 전달
		int begin =(page -1)/10 *10 +1;  
		int end = begin +9 ;
		//int count = 지금 상황에 해당하는 전체 데이터 갯수 ((참고) count는 전체갯수 인지 목록갯수인지 모른다)
		//int count = isSearch ? 검색결과수 : 목록개수;
		int count = isSearch ? boardDao.countList(type, keyword) : boardDao.countList();
		int pageCount = (count-1) / 10 +1;
		model.addAttribute("page",page);
		model.addAttribute("begin",begin);
		//Math.min으로 둘중 작은값을 비교하여 출력한다
		model.addAttribute("end",Math.min(pageCount, end)); 
		model.addAttribute("pageCount",pageCount);
	if(isSearch) { //검색일 경우
		//List<BoardListDto> list  = boardDao.search(type, keyword);
		List<BoardListDto> list  = boardDao.selectListByPage(type, keyword, page);
		model.addAttribute("list",list);		
		model.addAttribute("isSearch", true);
	}
	else { //목록일 경우
		//List<BoardListDto> list = boardDao.list();
		List<BoardListDto> list = boardDao.selectListByPage(page);
		//model.addAttribute("list", list);//둘다 같다
		model.addAttribute("list",boardDao.selectListByPage(page));//검색기능 대비 변수줄이자!
		model.addAttribute("isSearch", false);
	}	
		return "/WEB-INF/views/board/list.jsp";
	}

	//컨트롤러에서 조회수 중복방지 구현
//	@RequestMapping("/detail")
//	public String detail(@RequestParam int board_no, Model model, HttpSession session) {
//		BoardDto boardDto = boardDao.detail(board_no); //조회
//		
//		// 조회수 중복 방지를 위한 마스터 플랜
//		// 1.세션에 history라는 이름의 저장소가 있는지 확인한다.
//		// 2. 없으면 생성, 있으면 추출한다.
//		// 3. 지금있는 글 번호가 history에 존재하는지 확인한다.
//		// 4. 없으면 추가하고 다시 세션에 저장
//		
//		//1
//		Set<Integer> history;
//		if(session.getAttribute("history") !=null) {//있으면(1번)
//			history = (Set<Integer>) session.getAttribute("history");//(2번)
//		}
//		else { //없으면(1번)
//		history = new HashSet<>(); //(2번)
//		}
//		
//		boolean isRead = history.contains(board_no); //(3번)
//		
//		if(isRead == false) { //읽은적이 없다면(4번)
//			history.add(board_no); //글번호를 추가하고
//			session.setAttribute("history", history); //session 갱신

//		}
//		log.debug("history={}",history);//확인용 검사 코드
//		
//	//	if(조회수를 올릴만한 상황이면)
//	//	if(isRead == false)
//	//	{				
//		//	boardDao.updateDetail(board_no); //조회수 증가
//	//}
//		model.addAttribute("boardDto", boardDto);
//		
//		//작성자의 회원정보 추가
//		String board_writer = boardDto.getBoard_writer();
//		if(board_writer !=null) {
//			MemberDto memberDto = memberDao.selectOne(board_writer);
//			model.addAttribute("writerDto",memberDto);
//		}
//			return "/WEB-INF/views/board/detail.jsp";
//		}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int board_no, Model model, HttpSession session) {
		BoardDto boardDto = boardDao.detail(board_no); //조회
		
		model.addAttribute("boardDto", boardDto);
		
		//작성자의 회원정보 추가
		String board_writer = boardDto.getBoard_writer();
		if(board_writer !=null) {
			MemberDto memberDto = memberDao.selectOne(board_writer);
			model.addAttribute("writerDto",memberDto);
		}
			return "/WEB-INF/views/board/detail.jsp";
		}

	@GetMapping("/edit")
	public String edit(@RequestParam int board_no, Model model) {
		BoardDto boardDto = boardDao.detail(board_no);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}

	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		boolean result = boardDao.edit(boardDto);
		if (result) {
			return "redirect:detail?board_no=" + boardDto.getBoard_no();
		} else {
			throw new NoTargetException("없는 게시글 번호");
		}
	}

//삭제
	//만약소유자 검사를 추가한다면
	// 현재 로그인한 사용자와 게시글 작성자가 같다면 소유자로 판정
	@RequestMapping("/delete")
	public String delete(@RequestParam int board_no, 
			HttpSession session, @ModelAttribute BoardDto inputDto) {
		BoardDto boardDto = boardDao.detail(board_no);
		
		String board_writer = (String) session.getAttribute("name");	
		if (board_writer.equals(boardDto.getBoard_writer())) {
			boardDao.delete(board_no);
			return "redirect:list";
		} else {
		//	return "redirect:에러페이지"; 잘못됨
		 throw new AuthorityException("글 작성자가 아닙니다.");
		}
	}
	@RequestMapping("/updateLike")
	public String updateLike(@RequestParam int board_no 
			) {

			boardDao.updateLike(board_no);
			return "redirect:detail?board_no="+board_no;
	}
	@GetMapping("/search")
	public String search() {

		return "/WEB-INF/views/board/search.jsp";
	}
 

	
	}


