package jdbc.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.boardDto;
import jdbc.dto.memberDto;
import jdbc.mapper.memberMapper;
import jdbc.util.jdbcUtils;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 :");
		String id = sc.next();
		System.out.print("비밀번호를 입력해주세요 :");
		String pw = sc.next();
		memberMapper mapper = new memberMapper();
		String check = "select * from member where member_id =? ";
		Object[] ob = { id };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		List<memberDto> list = tem.query(check, mapper, ob);
		memberDto dto = list.isEmpty() ? null : list.get(0); // 3항연산자(if문 축소)
		if (list.isEmpty()) {
			dto = null;
		} else {
			dto = list.get(0);
		}
		System.out.println(dto);

		boolean isLogin = dto != null && dto.getMember_pw().equals(pw);
		if (isLogin) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
