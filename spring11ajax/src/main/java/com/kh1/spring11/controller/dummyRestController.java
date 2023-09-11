package com.kh1.spring11.controller;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh1.spring11.dao.MemberDao;
import com.kh1.spring11.dao.PocketmonDAO;
import com.kh1.spring11.dto.MemberDto;
import com.kh1.spring11.dto.PocketmonDTO;

//CORS를 헤제하기 위한설정(Annotation)
//@@CrossOrigin//전부다 허용(보안상 위험!)
@CrossOrigin(origins = { "http://192.168.30.63:5500" })
@RestController // @Controller + @Repository
public class dummyRestController {

	@Autowired
	private MemberDao memberDao;

	@RequestMapping("/hello")
	public String hello() {
		return "hello spring ajax";
	}

	// RestController 에서는 내가 전해줄 데이터가 반환형이 된다.
	// 자동으로 Spring에서 JSON형태로 변환하여 반환
	// 변환을 담당하는 라이브러리는 jackson-databind
	@RequestMapping("/lotto")
	public Set<Integer> lotto() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		return set;
	}

	@PostMapping("/idCheck")
	public String idCheck(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if (memberDto != null) {//아이디가 있으면
			return "Y";
		} else { //아이디가 없으면
			return "N";
		}
	}
	
	
	@PostMapping("/nicknameCheck")
	public String nicknameCheck(@RequestParam String memberNickname) {
		MemberDto memberDto = memberDao.selectNick(memberNickname);
		if (memberDto != null) {//닉네임이 있으면
			return "Y";
		} else { //닉네임이 없으면
			return "N";
		}
	}
	
	@Autowired
	private PocketmonDAO pocketmonDao;
	
	//프론트 엔드에 포켓몬 목록을 반환하는 매핑
	@RequestMapping("/pocketmon")
	public List<PocketmonDTO > pocketmon(){
		return pocketmonDao.selectList();
	}

}
