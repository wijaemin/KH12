package com.kh.spring05.dao;

import java.util.List;

// DAO클래스
// =스프링에 등록해야함
// =JDBC Template 에 주세요 해야하기 떄문이다.
//@Repository로 등록해야한다(영원히 변하지 않는 것을 다루는 객체 = 영속성 제어 객체)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDTO;
import com.kh.spring05.mapper.PocketmonMapper;

@Repository
public class PocketmonDAO {
	@Autowired // (주의)등록을 하지 않으면 절대로 주지않음
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PocketmonMapper mapper;

	public void insert(PocketmonDTO dto) {
		String sql = "insert into pocketmon(no, name, type) values (?,?,?)";
		Object[] data = { dto.getType(), dto.getName(), dto.getType() };
		jdbcTemplate.update(sql, data);
	}
	public boolean update(PocketmonDTO dto) {
		String sql = "update pocketmon set name = ? , type = ? where no = ?";
		Object[] data = {dto.getName(), dto.getType(), dto.getNo()};
				return jdbcTemplate.update(sql, data) >0; //수정안되면 0이기 때문이다.
	}
	public boolean delete(int no) {
		String sql = "delete pocketmon where no = ?";
		Object[] data = {no};
		return jdbcTemplate.update(sql, data) >0;
	}
	
	public List<PocketmonDTO> selectList (){
		String sql= "select * from pocketmon order by no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public  PocketmonDTO selectOne(int no) {
		String sql ="select * from pocketmon where no = ?";
		Object[] data = {no};
		List< PocketmonDTO> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
		}
	
}
