package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		int no = sc.nextInt();
		String content = sc.next();
		String writer = sc.next();
		int read = sc.nextInt();

		String sql = "update board set String board_title = ?, board_content =?,  board_writer = ?, board_readcount=? where  board_no = ?";

		Object[] ob = { title, content, writer, read, no };
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("oracle.jdbc.OracleDriver");
		data.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		data.setUsername("c##kh");
		data.setPassword("kh");
		JdbcTemplate template = new JdbcTemplate(data);
		template.update(sql, ob);
		int result = template.update(sql, ob);
		if (result > 0) {
			System.out.println("수정 완료");
		} else {
			System.out.println("수정 되지 않았습니다.");
		}

	}
}
