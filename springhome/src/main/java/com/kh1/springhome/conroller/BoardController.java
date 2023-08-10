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

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardDao boardDao;

	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}

	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto,
			HttpSession session) {
		String board_writer =(String) session.getAttribute("name");
		int board_no = boardDao.sequence();
		boardDto.setBoard_no(board_no);
		boardDto.setBoard_writer(board_writer);
		boardDao.write(boardDto);
		return "redirect:list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = boardDao.list();
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
	}

	@RequestMapping("/detail")
	public String detail(@RequestParam int board_no, Model model) {
		BoardDto boardDto = boardDao.detail(board_no);
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
			boardDao.updateUtime(boardDto.getBoard_no());
			return "redirect:detail?board_no=" + boardDto.getBoard_no();
		} else {
			return "redirect:에러페이지";
		}
	}
	@RequestMapping("/delete")
	public String delete(HttpSession session,BoardDto inputDto, int board_no) {
		String board_writer = (String) session.getAttribute("name");
		BoardDto boardDto = boardDao.detail(board_no);
		if(boardDto.getBoard_writer().equals(inputDto.getBoard_writer())) {
		boardDao.delete(board_no);
		return "redirect:list";
		}
		else {
			return"redirect:에러페이지";
		}
	}
	
}
