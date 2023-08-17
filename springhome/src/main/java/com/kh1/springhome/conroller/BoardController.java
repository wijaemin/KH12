package com.kh1.springhome.conroller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.kh1.springhome.error.AuthorityException;
import com.kh1.springhome.error.NoTargetException;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardDao boardDao;
	@Autowired
	MemberDao memberDao;

	@GetMapping("/write")
	public String write(HttpSession session) {
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
			@RequestParam(required = false) String keyword) {
		boolean isSearch = type != null && keyword != null;
	if(isSearch) { //검색일 경우
		List<BoardDto> list  = boardDao.selectList(type, keyword);
		model.addAttribute("list",list);
	}
	else { //목록일 경우
		List<BoardDto> list = boardDao.list();
		//model.addAttribute("list", list);//둘다 같다
		model.addAttribute("list",boardDao.list());//검색기능 대비 변수줄이자!
		model.addAttribute("isSearch", false);
	}	
		return "/WEB-INF/views/board/list.jsp";
	}

	@RequestMapping("/detail")
	public String detail(@RequestParam int board_no, Model model, HttpSession session) {
		BoardDto boardDto = boardDao.detail(board_no); //조회
		
	//	if(조회수를 올릴만한 상황이면)
		//{				
			boardDao.updateDetail(board_no); //조회수 증가
	//}
		model.addAttribute("boardDto", boardDto);
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
			return "redirect:list";
	}
	@GetMapping("/search")
	public String search() {

		return "/WEB-INF/views/board/search.jsp";
	}
 

	
	
	
	
	}


