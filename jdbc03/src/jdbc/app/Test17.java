package jdbc.app;

import java.util.List;

import jdbc.dao.memberDao;
import jdbc.dto.memberDto;

public class Test17 {
public static void main(String[] args) {
	memberDao dao = new memberDao();
	List<memberDto> list = dao.selectList();
	for(memberDto dto : list)System.out.println(dto);
}
}
