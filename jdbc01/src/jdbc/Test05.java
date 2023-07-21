package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String account_owner = sc.next();
		System.out.println("기간을 입력해주세요");
		int account_period = sc.nextInt();
		int account_count = account_period * 12 + 1;
		System.out.println("월납입금을 입력해주세요");
		int account_payment = sc.nextInt();
		int account_balance = account_period * account_payment;

		String sql = "insert into account(account_owner,account_period,account_count,account_payment,account_balance) values(?,?,?,?,?)";
		Object[] ob = { account_owner, account_period, account_balance, account_payment, account_balance };
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("kh");
		JdbcTemplate JdbcTemplate = new JdbcTemplate(dataSource);
		JdbcTemplate.update(sql, ob);
		System.out.println("임무 완료");
		sc.close();
	}
}
