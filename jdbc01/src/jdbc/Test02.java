package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
//JDBC(Java DataBase Connectivity) 
		// =자바를 이용해서 데이터 베이스 작업을 하는 것
		// - 데이터 베이스 구분을 프로그램에 작성하여 처리하도록 중계

		// (ex) 포켓몬스터 테이블에 데이터를 등록하는 작업

		// 1. 구문을 세미클론 제외하고 준비
		String sql = "insert into pocketmon(no, name, type)" + " values(43, '뚜벅초', '풀')";

		// 2. 연결도구 생성 및 연결에 필요한 정보를 설정
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("c##kh");
		dataSource.setPassword("kh");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

		// dataSource.setUrl("jdbc:oracle:thin:@khds-c.iptime.org:15215:xe");
		// 다른 컴퓨터로 할거면 주석처리한것으로 시도 해야한다.
//집은 개인아이피를 넣는다 @뒤에
		// 3. 구문전송도구를 생성 및 전송
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql);

		System.out.println("임무 완료");
	}
}
