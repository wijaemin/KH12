package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("아이디를 입력하세요 regexp_like(member_id, '^[a-z][a-z0-9]{7,24}$");
		String member_id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String member_pw = sc.next();
		System.out.println("닉네임를 입력하세요 member_nickname, '^[A-Za-z0-9가-힣]{2,10}");
		String member_nickname = sc.next();
		System.out.println("생일를 입력하세요");
		String member_brith = sc.next();
		System.out.println("이메일를 입력하세요");
		String member_email = sc.next();
		System.out.println("전화번호를 입력하세요");
		String member_contact = sc.next();
		System.out.println("레벨를 입력하세요 member_level in ('일반', 'VIP', '관리자')");
		String member_level = sc.next();
		System.out.println("포인트를 입력하세요");
		int member_point = sc.nextInt();
		System.out.println("들어온날을 입력하세요");
		String member_join = sc.next();

		String sql = "insert into member(member_id ,member_pw,member_nickname,"+
				"member_brith,member_email,member_contact,member_level,member_point"+
				",member_join) values(?,?,?,?,?,?,?,?,?)";
		
		Object[] ob = {member_id ,member_pw,member_nickname,
				member_brith,member_email,member_contact,member_level,member_point
				,member_join}; 
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");	
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("kh");
	
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update(sql,ob);
		System.out.println("임무 완료");
		sc.close();
		
	}
}
