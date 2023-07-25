package jdbc.app;

import jdbc.dao.memberDao;
import jdbc.dto.memberDto;

public class Test04 {
public static void main(String[] args) {
	memberDto dto = new memberDto();
	dto.setMember_birth(null);
	dto.setMember_contact(0);
	dto.setMember_email(null);
	dto.setMember_id(null);
	dto.setMember_join(null);
	dto.setMember_level(null);
	dto.setMember_nickname(null);
	dto.setMember_point(0);
	dto.setMember_pw(null);
	memberDao dao =new memberDao();
	dao.insert(dto);
}
}
