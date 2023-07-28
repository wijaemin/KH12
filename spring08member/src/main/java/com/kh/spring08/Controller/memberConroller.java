package com.kh.spring08.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring08.DAO.memberDAO;
import com.kh.spring08.DTO.memberDTO;

@RestController
@RequestMapping("/member") // 클래스 위에 만들면 공용주소 만들수있다.
public class memberConroller {
	@Autowired
	memberDAO dao;

	@RequestMapping("/join")
	public String join(@ModelAttribute memberDTO dto) {
		dao.join(dto);
		return "회원 등록에 성공했습니다.";
	}

	@RequestMapping("/list")
	public String list() {
		List<memberDTO> list = dao.list();
		StringBuffer buffer = new StringBuffer();
		for (memberDTO dto : list) {
			buffer.append(list);
		}
		return buffer.toString();
	}

	@RequestMapping("/password")
	public String password(@RequestParam String memberId, // 기존아이디
			@RequestParam String memberPw, // 기존비번
			@RequestParam String changePw) {
		// 일단 아이디로 DB의 회원정보를 불러온다
		memberDTO originDto = new memberDTO();
		if (originDto == null) {
			return "존재하지 않는 회원입니다";
		}
		if (originDto.getMemberPW().equals(memberPw)) {
			memberDTO changeDto = new memberDTO();
			changeDto.setMemberID(memberId);
			changeDto.setMemberPW(memberPw);
			dao.password(changeDto);
			return "비밀번호 변경 성공";
		} else
			return "존재하지 않음";

	}

	@RequestMapping("/exit")
	public String exit(@RequestParam String ID) {
		boolean a = dao.exit(ID);
		if (a)
			return "회원삭제 성공";
		else
			return "회원정보 삭제 실패";
	}

	// 비밀번호를 변경할때는 아이디 , 바꿀비밀번호만 있으면된다.
	// 하지만, 여러가지 확인을 위해 추가정보를 요구할 수도 있다.
	// Ex) 기존비밀번호(o), 비밀번호 확인(X)
	@RequestMapping("/password")
	public String password(memberDTO dto) {
		StringBuffer buffer = new StringBuffer();
		boolean a = dao.password(dto);
		if (a)
			return "회원 확인 되셧습니다. 비밀번호를 변경하겠습니다." + buffer.append("<br>") + buffer.append("변경하실 비밀번호를 입력해주세요 : ")
					+ buffer.append("<br>") + buffer.append("변경하실 비밀번호를 다시 입력해주세요 : ");
		else
			return "아이디와 비밀번호를 다시 입력해주세요 ";
	}

	@RequestMapping("/detail")
	public memberDTO detail(@RequestParam String ID) {
		return dao.detail(ID);

	}
}
