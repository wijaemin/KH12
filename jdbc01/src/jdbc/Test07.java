package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String board_no;
		System.out.println("이름을 입력해주세요");
		String board_title = sc.next();
		System.out.println("ㅇㅁㄴㅇ를 입력해주세요");
		String board_content = sc.next();
		System.out.println("작가를 입력해주세요");
		String board_writer = sc.next();	
		System.out.println("읽은 횟수를 입력해주세요");
		int board_readcount = sc.nextInt();

		String jql = "insert into board (board_no, board_title,board_content,board_writer,board_readcount) values(board_sep.nextval,?,?,?,?)";
		Object[] ob = {board_title, board_content, board_writer, board_readcount};
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("kh");
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.update(jql,ob);
		System.out.println("임무 완료");
		sc.close();
	}
}
