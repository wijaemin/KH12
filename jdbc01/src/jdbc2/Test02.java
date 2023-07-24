package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		String name = sc.next();
		int num = sc.nextInt();
		String sql = "update book set book_title = ?, book_price= ? where book_id = ?";
		Object[] ob = { name, price, num };

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
