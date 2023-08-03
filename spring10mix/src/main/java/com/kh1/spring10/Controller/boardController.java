package com.kh1.spring10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.spring10.dao.boardDAO;
import com.kh1.spring10.dto.boardDTO;

@Controller
@RequestMapping("/board")
public class boardController {
	@Autowired
	boardDAO dao;

	@RequestMapping("/detail")
	public String test04(Model model, int no) {

		boardDTO dto = dao.selectOne(no);

		model.addAttribute("dto", dto);

		return "/WEB-INF/views/board/detail.jsp";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<boardDTO> list = dao.List();
		model.addAttribute("list",list);
		return  "/WEB-INF/views/board/list.jsp";
		
	}
	@GetMapping("/write")
	public String write() {

		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write")
	public String write(@ModelAttribute boardDTO dto) {
		int board_no= dao.sequence(); //번호를 구해서
		dto.setBoard_no(board_no); //dto에 추가하고
		dao.insert(dto);//등록!
		
		//방금 등록한 번호의 게시글 상세페이지로 강제이동(redirect)
		return "redirect:detail?no="+board_no;
		
	}
	@GetMapping("/edit")
	public String edit(Model model, int no) {
		boardDTO dto= dao.selectOne(no);
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute boardDTO dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "redirect:detail?no="+dto.getBoard_no();
		}
		else {
			return "redirect:에러페이지";
		}
	}
	
	// 경로변수(Path Variable)매핑 처리
	// 경로 중간에 변수로 사용할 영역을 지정하는 방식
	// 주소를 간단하게 만들기위해 사용
	// 전달할 값이 많으면 안쓰는게 좋다
	// @PathVariable로 처리하며 [경로의 끝지점(endpoint)이 달라진다
	@RequestMapping("/delete")
	public String delete(@RequestParam int board_no) {
		boolean result = dao.delete(board_no);
		if(result) {
			return "redirect:list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
	@RequestMapping("/delete/{board_no}")
	public String delete2(@PathVariable int board_no) {
		boolean result = dao.delete(board_no);
		if(result) {
		//	return "redirect:../list"; 상대경로
			return "redirect:/board/list"; //절대경로
		}
		else {
			return "redirect:에러페이지";
		}
	}
	}

