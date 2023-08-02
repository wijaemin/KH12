package com.kh1.spring10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh1.spring10.dao.boardDAO;
import com.kh1.spring10.dto.boardDTO;

@RestController
public class boardController {
	@Autowired
	private boardDAO dao;

	@RequestMapping("/insert")
	public String insert(@ModelAttribute boardDTO dto) {
		dao.insert(dto);
		return "보드 등록 완료";
	}

	@RequestMapping("/update")
	public String update(@ModelAttribute boardDTO dto) {
		boolean a = dao.update(dto);
		if (a)
			return "보드 업데이트 완료";
		else
			return "보드의 고유번호를 다시 입력해주세요";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int no) {
		boolean a = dao.delete(no);
		if (a)
			return "해당 넘버 삭제 완료";
		else
			return "해당 넘버가 없습니다. 다시 해주세요";
	}

	@RequestMapping("/list")
	public String list() {
		StringBuffer buffer = new StringBuffer();
		List<boardDTO> list = dao.selectList();
		for (boardDTO dto : list) {
			buffer.append("[");
			buffer.append(dto.getBoard_no());
			buffer.append("]");
			buffer.append("<ba>");
			buffer.append("[");
			buffer.append(dto.getBoard_title());
			buffer.append("]");
			buffer.append("<ba>");
			buffer.append("[");
			buffer.append(dto.getBoard_writer());
			buffer.append("]");
			buffer.append("<ba>");
			buffer.append("[");
			buffer.append(dto.getBoard_readcount());
			buffer.append("]");
			buffer.append("<ba>");

		}
		return buffer.toString();
	}

	@RequestMapping("/detail")
	public String detail(int no) {
	boardDTO dto = dao.selectOne(no);
		if (dto == null) {
			return "존재 하지 않는 보드의 번호입니다.";
		} else {
			StringBuffer buffer = new StringBuffer();
			
			buffer.append("[제목 ]"+dto.getBoard_title());
			buffer.append("<br>");
			buffer.append("[작가 ]"+dto.getBoard_writer());
			buffer.append("<br>");
			buffer.append("===========");
			buffer.append("<br>");
			buffer.append("[내용 ]"+dto.getBoard_content());
			buffer.append("<br>");
			return buffer.toString();
		}
	}

}