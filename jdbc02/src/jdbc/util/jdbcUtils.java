package jdbc.util;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// JDBC의 연결 작업을 좀 쉽게 처리할 수 있도록 도와주는 도우미 클래스
public class jdbcUtils {

	// 연결 정보를 상수로 저장
   public static final String driver = "oracle.jdbc.OracleDriver";
   public static final String url = "jdbc:oracle:thin@localhost:1521:xe";
   public static final String userName = "c##kh";
   public static final String passWord= "kh";
   
   //실행도구 생성 메소드 
   public static JdbcTemplate  getJdbcTemplate() {
	   DriverManagerDataSource dataSource = new DriverManagerDataSource();
	   dataSource.setDriverClassName(driver);
	   dataSource.setUrl(url);
	   dataSource.setUsername(userName);
	   dataSource.setPassword(passWord);
	   
	   JdbcTemplate Template = new JdbcTemplate(dataSource);
	return Template;
   }
   
   
   
}
