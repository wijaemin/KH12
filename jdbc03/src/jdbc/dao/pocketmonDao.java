package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.PocketmonDto;
import jdbc.util.jdbcUtils;

// DAO 클래스
// Data Access Object. DB 담당 처리반
// 해당 테이블에 필요한 기능들을 매소드로 구현
// 기본적으로 C(등록), R(목록) , R(상세), U(수정), D(삭제)가 필요

public class pocketmonDao {

	// C(등록) 메소드
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon(no, name, type) values(?,?,?)";
		Object[] data = { dto.getNo(), dto.getName(), dto.getType() };

		JdbcTemplate template = jdbcUtils.getJdbcTemplate();
		template.update(sql, data);
	}

	// U(수정) 메소드
	// no를 이용해서 name과 type을 바꾼다.
	// 적용된 행이 있는지 없는지 알아야 한다.
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon set name = ? , type = ? where no = ? ";
		Object[] data = { dto.getName(), dto.getType(), dto.getNo() };
		JdbcTemplate template = jdbcUtils.getJdbcTemplate();
		int result = template.update(sql, data);
		//if ( result >0) return true;
		//else return false;
		return  result > 0;
	}
	
	//D(삭제) 메소드
	// 삭제 메소드는 Primary key(기본키)를 이용하여 하나씩 지운다.
	// 조건에 따라서 삭제가 안될 수 있기 때문에 결과를 반환해야 한다.
 public boolean delete(int no) {
	 String sql = "delete pocketmon where no =?";
	 Object[] data = {no};
	 JdbcTemplate template = jdbcUtils.getJdbcTemplate();
	 return template.update(sql,data) > 0 ;
 }
}
