package com.kh1.springhome.conroller;

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
import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.error.NoTargetException;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardDao boardDao;

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
		boardDao.write(boardDto);
		return "redirect:detail?board_no="+board_no;
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = boardDao.list();
		model.addAttribute("list", boardDao.list());//검색기능 대비 변수줄이자!
		//model.addAttribute("list", list);//둘다 같다
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

		String memberId = (String) session.getAttribute("name");
		boolean logTolog = memberId.equals(boardDto.getBoard_writer());
		if (logTolog) {
			return "/WEB-INF/views/board/detail.jsp";
		} else {
			boardDao.updateDetail(board_no);
			return "/WEB-INF/views/board/detail.jsp";
		}
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


	@RequestMapping("/delete")
	public String delete(@RequestParam int board_no, 
			HttpSession session, @ModelAttribute BoardDto inputDto) {

		String board_writer = (String) session.getAttribute("name");
		BoardDto boardDto = boardDao.detail(board_no);
		if (board_writer.equals(boardDto.getBoard_writer())) {
			boardDao.delete(board_no);
			return "redirect:list";
		} else {
		//	return "redirect:에러페이지"; 잘못됨
		 throw new NoTargetException("없는 게시글 번호");
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
 
	@PostMapping("/search")
	public String search(@RequestParam String keyWord, @ModelAttribute Model model) {
	List<BoardDto>list =	boardDao.Search(keyWord);
	model.addAttribute("list",list);
		return "/WEB-INF/views/board/search.jsp";
	}
	
	
	}


