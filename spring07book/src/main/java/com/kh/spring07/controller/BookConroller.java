package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.BookDAO;
import com.kh.spring07.dto.BookDTO;

@RestController
public class BookConroller {
	@Autowired
	private BookDAO dao;

	@RequestMapping("/save")
	public String save(@ModelAttribute BookDTO dto) {
		dao.save(dto);
		return "등록 완료";
	}

	@RequestMapping("/list")
	public String list() {
		List<BookDTO> list = dao.list();
		StringBuffer buffer = new StringBuffer();
		for (BookDTO dto : list) {

			buffer.append(" <책 넘버> :  NO." + dto.getBookID());
			buffer.append("<ba>");
			buffer.append(" <책 제목> : " + dto.getBookTitle());
			buffer.append("<ba>");
			buffer.append(" <책 작가> :" + dto.getBookAuthor());
			buffer.append("<ba>");
			buffer.append(" <책 출판일> : " + dto.getBookPublicationDate());
			buffer.append("<ba>");
			buffer.append(" <책 가격> : " + dto.getBookPrice() + " 달러 ");
			buffer.append("<br>");
			buffer.append(" <책 출판사> : " + dto.getBookPublisher());
			buffer.append("<br>");
			buffer.append(" <책 장르> : " + dto.getBookGenre());
			buffer.append("<br>");
			buffer.append("=================================================================================");
			buffer.append("<br>");
		}
		return buffer.toString();
	}

	@RequestMapping("/edit")
	public String edit(@ModelAttribute BookDTO dto) {
		boolean a = dao.edit(dto);
		if (a == false)
			return "존재하지 않는 번호 입니다.";
		else
			return " 수정되었습니다.";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean a = dao.delete(no);
		if (a)
			return "삭제 되었습니다.";
		else
			return "해당하는 번호가 없어 삭제가 불가능합니다.";
	}

	@RequestMapping("/detail")
	public String detail(@RequestParam int no) {
		BookDTO dto = dao.detail(no);
		if (dto == null) {
			return "존재하지않음";
		} else {
			return dto.toString();
		}
	}
}
