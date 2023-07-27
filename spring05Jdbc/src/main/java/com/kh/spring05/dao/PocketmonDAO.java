package com.kh.spring05.dao;

// DAO클래스
// =스프링에 등록해야함
// =JDBC Template 에 주세요 해야하기 떄문이다.
//@Repository로 등록해야한다(영원히 변하지 않는 것을 다루는 객체 = 영속성 제어 객체)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDTO;

@Repository
public class PocketmonDAO {
	@Autowired // (주의)등록을 하지 않으면 절대로 주지않음
	private JdbcTemplate jdbcTemplate;

	public void insert(PocketmonDTO dto) {
		String sql = "insert into pocketmon(no, name, type) values (?,?,?)";
		Object[] data = { dto.getType(), dto.getName(), dto.getType() };
		jdbcTemplate.update(sql, data);
	}

}
