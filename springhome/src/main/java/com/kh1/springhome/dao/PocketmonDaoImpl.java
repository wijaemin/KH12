package com.kh1.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.AttachDto;
import com.kh1.springhome.dto.PocketmonDto;
import com.kh1.springhome.mapper.AttachMapper;
import com.kh1.springhome.mapper.PocketmonMapper;

@Repository
public class PocketmonDaoImpl implements PocketmonDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	PocketmonMapper pocketmonMapper;
	@Autowired
	AttachMapper attachMapper;

	@Override
	public int sequence() {
		String sql = "select pocketmon_seq.nextval from dual";

		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
	public void insert(PocketmonDto pocketmonDto) {
		String sql = "insert into pocketmon(no,name,type) values(?,?,?)";
		Object[] data = { pocketmonDto.getNo(), pocketmonDto.getName(), pocketmonDto.getType() };
		jdbcTemplate.update(sql, data);
	}

	@Override
	public void connect(int pocketmonNo, int attachNo) {
		String sql = "insert into pocketmon_image values (? , ?)";
		Object[] data = { pocketmonNo, attachNo };
		jdbcTemplate.update(sql, data);

	}

	@Override
	public AttachDto findImage(int poketmonNo) {
		String sql = "select *from attach where attach_no = (" + " select attach_no from pocketmon_image "
				+ "where pocketmon_no = ?" + " )";
		Object[] data = { poketmonNo };
		List<AttachDto> list = jdbcTemplate.query(sql, attachMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public List<PocketmonDto> selectList() {
		String sql = "select p.*, pm.attach_no from pocketmon p"
				+ " left outer join pocketmon_image pm"
				+ " on p.no = pm.pocketmon_no"
				+ " order by p.no asc";
		return jdbcTemplate.query(sql, pocketmonMapper);

	}

	@Override
	public PocketmonDto selectOne(int no) {
		String sql = "SELECT p.*,pm.attach_no from "
				+ "POCKETMON  p "
				+ "left outer join POCKETMON_IMAGE pm "+
				"on p.no = pm.POCKETMON_NO "
				+ "where no = ?" ;
		Object[] data = { no };
		List<PocketmonDto> list = jdbcTemplate.query(sql, pocketmonMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public boolean delete(int no) {
		String sql = "delete pocketmon where no = ?";
		Object[] data = {no};
		return jdbcTemplate.update(sql, data)>0;
	}

}
