package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.memberDto;
import jdbc.mapper.memberMapper;
import jdbc.util.jdbcUtils;

public class memberDao {

	public void insert(memberDto dto) {
		String sql = "insert into member(member_id,member_pw, member_nickname,member_brith,member_email,member_contact,member_level"
				+ ",member_point,member_join)" + " values(?,?,?,?,?,?,?,?,?)";
		Object[] ob = { dto.getMember_id(), dto.getMember_pw(), dto.getMember_nickname(), dto.getMember_brith(),
				dto.getMember_email(), dto.getMember_contact(), dto.getMember_level(), dto.getMember_point(),
				dto.getMember_join() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		tem.update(sql, ob);
	}

	public boolean updateMemberPassword(memberDto dto) {
		String sql = "update member set member_pw = ?  where member_id = ? ";
		Object[] ob = { dto.getMember_pw(), dto.getMember_id() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, ob);
		if (result > 0)
			return true;
		else
			return false;
	}

	public boolean updateMemberInfo(memberDto dto) {
		String sql = "update member set member_nickname  = ? ,member_contact = ? , member_email= ?, member_brith = ? where member_id = ?";
		Object[] ob = { dto.getMember_nickname(), dto.getMember_contact(), dto.getMember_email(), dto.getMember_brith(),
				dto.getMember_id() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, ob);
		if (result > 0)
			return true;
		else
			return false;
	}

	public boolean delete(String memberId) {
		String sql = "delete  from member where member_id = ?";
		Object[] ob = { memberId };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, ob);
		return result > 0;
	}

	private memberMapper mapper = new memberMapper();

	public List<memberDto> selectList() {
		String sql = "select * from member ";
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		return tem.query(sql, mapper);
	}

	public List<memberDto> selectTen(int page) {
		int end = page * 10;
		int start = end - 9;
		String sql = "select * from( select rownum rn, TMP. * from(select * from  member  order by member_id desc) TMP) where rn between ? and ?";
		Object[] ob = { start, end };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		return tem.query(sql, mapper, ob);
	}
	public memberDto selectOne(String ID) {
		String sql = "select * from member where member_id =?";
		Object[] ob = {ID};
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		List<memberDto> list = tem.query(sql,mapper,ob);
		if(list.isEmpty()) return null;
		else return list.get(0);
	}

}
