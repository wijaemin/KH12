

package com.kh1.spring10.Controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.spring10.dto.PocketmonDto;

@Controller
@RequestMapping("/pocketmon")
//포켓몬스터 시스템을 처리하는 컨트롤러
public class PocketmonController {

//	@Autowired
//	PocketmonDao dao;

//	@RequestMapping("/detail")
//	public String detail(@RequestParam int no, Model model) {
//		PocketmonDto dto = dao.selectOne(no);
//		model.addAttribute("dto", dto);
//		return "/WEB-INF/views/pocketmon/detail.jsp";

	// 목록
//	@RequestMapping("/list")
//	public String list(Model model) {
//		List<PocketmonDto> list = dao.selectList();
//		model.addAttribute("list", list);
//		return "/WEB-INF/views/pocketmon/list.jsp";
//	}
//	}

	// 등록
	// 등록은 주소를 둘로 나눠서 쓴다.
	// Get 방식에서는 입력, Post방식에선 처리
	//@GetMapping or @PostMapping 이라는 어노테이션 사용가능
	//@RequestMapping("/insert")
	//@RequestMapping(value = "/insert",method = RequestMethod.GET)
//	@GetMapping("/insert")
//	public String insert() {
//		return "/WEB-INF/views/pocketmon/insert.jsp";
//	}
	//@RequestMapping(value = "/insert",method = RequestMethod.Post)
	//	@PostMapping("/insert")
//		public String insert(@ModelAttribute PocketmonDto dto) {
//			dao.insert(dto);
			//더이상 할 일이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
			//반환하는 문자열이 redirect:로 시작하면 스프링이 리다이텍트 처리
	//		return "redirect:list";//상대경로
//			return "redirect:/poketmon/list";//절대경로
//		}
		
		//수정
		//- 수정 역시 등록처럼 두 개의 매핑이 필요(작성,처리)
		//- 전송방식으로 구분하여 구현
		//- 화면에 기존 정보를 표시할수 있도록 조회하여 전달
//		@GetMapping("/edit")
//		public String edit(@RequestParam int no, Model model) {
//			PoketmonDto dto= dao.selectOne(no);
//			model.addAttribute("dto",dto);
//			return "/WEB-INF/views/pocketmon/edit.jsp";
//		}
	//	@PostMapping("/edit")
	//	public String edit(@ModelAttribute PocketmonDto dto) {
	//		boolean result =dao.update(dto);
	//		if(result) {return "redirect:detail?no="+dto.getNo();}
	//		else {
	//			return "redirect:에러페이지 주소";
	//		}
		
		//삭제
//		@RequestMapping("/delete")
//		public String delete(@RequestParam int no) {
//			boolean result = dao.delete(no);
//			return "redirect:list";
		}
		
	

