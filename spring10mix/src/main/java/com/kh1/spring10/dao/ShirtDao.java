package com.kh1.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.spring10.dto.ShirtDto;
import com.kh1.spring10.mapper.ShirtMapper;

@Repository
public class ShirtDao {
	@Autowired
	ShirtMapper mapper;
	@Autowired
	JdbcTemplate tem;

	public int sequence() {
		String sql = "select shirt_seq.nextval from dual";
		return tem.queryForObject(sql, int.class);
	}

	public void add(ShirtDto dto) {
		String sql = "insert into shirt(shirt_no,shirt_name,shirt_color,"
				+ "shirt_price,shirt_kind,shirt_type,shirt_material,shirt_stock) " + "values(?,?,?,?,?,?,?,?)";
		Object[] ob = { dto.getShirt_no(), dto.getShirt_name(), dto.getShirt_color(), dto.getShirt_price(),
				dto.getShirt_kind(), dto.getShirt_type(), dto.getShirt_material(), dto.getShirt_stock() };
		tem.update(sql, ob);
	}

	public List<ShirtDto> list() {
		String sql = "select * from shirt order by shirt_no asc";
		return tem.query(sql, mapper);
	}

	public ShirtDto detail(int shirt_no) {
		String sql = "select * from shirt where shirt_no= ?";
		Object[]ob = { shirt_no };
		List<ShirtDto> list = tem.query(sql, mapper, ob);
		return list.isEmpty() ? null : list.get(0);
	}

	public boolean edit(ShirtDto dto) {
		String sql = "update shirt set shirt_name = ?, shirt_color = ?,"
				+ "shirt_price = ?, shirt_kind = ?, shirt_type = ?, "
				+ "shirt_material = ? , shirt_stock = ? where shirt_no = ?";
		Object[] ob = { dto.getShirt_name(), dto.getShirt_color(), dto.getShirt_price(), dto.getShirt_kind(),
				dto.getShirt_type(), dto.getShirt_material(), dto.getShirt_stock(), dto.getShirt_no() };
		return tem.update(sql, ob) > 0;
	}

	public boolean delete(int shirt_no) {
		String sql = "delete shirt where shirt_no = ?";
		Object[] ob = {shirt_no};
		return tem.update(sql, ob) > 0;
	}
}
