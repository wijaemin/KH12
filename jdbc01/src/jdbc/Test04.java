package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04 {
public static void main(String[] args) {
	// 변수를 가지고 있는 데이터를 기반으로 명령을 생성하여 전송하는 방법
	
	int no = 50;
	String name ="테스트";
	String type = "무속성";
	
	// 정적 SQL 구문 방식
	// 구문을 만들기 매우 까다로움
	// 등록이 불가능한 글자가 있음
	// SQL 인젝션 공격의 대상이될수 있다
	
	//동적 SQL 구문방식
	// 구문과 값을 분리해서 처리한뒤 합성하는 방식
	// 데이터 자리를 홀더(?)로 표시
	// 구문과 합쳐져야 하는 데이터를 따로 준비
	// 자료형에 맞게 알아서 변환되어 처리(ex : 따음표 등)
	String sql= 
			"insert into pocketmon(no, name, type) values(? , ? , ?)";
	//Object[] data = new Object[] {no , name , type}; 
	Object [] data = {no, name, type}; // 배열의 약식 표현 c언어 방식 자바도 가능은하다
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	dataSource.setUsername("c##kh");
	dataSource.setPassword("kh");
	
	JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
	jdbcTemplate.update(sql, data);
	System.out.println("임무 완료");
	
}
}
