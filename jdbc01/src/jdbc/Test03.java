package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
public static void main(String[] args) {
	// 변수를 가지고 있는 데이터를 기반으로 명령을 생성하여 전송하는 방법
	
	int no = 50;
	String name ="테스트";
	String type = "무속성";
	
	// 정적 SQL 구문 방식
	// 구문을 만들기 매우 까다로움
	// 등록이 불가능한 글자가 있음
	// SQL 인젝션 공격의 대상이될수 있다
	String sql= "insert into pocketmon(no, name, type)"+
	"values("+no+",'"+name+"','"+type+"')";
	
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	dataSource.setUsername("c##kh");
	dataSource.setPassword("kh");
	
	JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
	jdbcTemplate.update(sql);
	System.out.println("임무 완료");
	
}
}
