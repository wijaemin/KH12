package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String book_id ;
	System.out.println("책 제목을 입력해주세요");
	String book_title = sc.next();
	System.out.println("작가를 입력해주세요");
	String book_author = sc.next();
	System.out.println("날짜을 입력해주세요");
	String book_publication_date= sc.next();
	System.out.println("책 가격을 입력해주세요");
	double book_price = sc.nextDouble();
	System.out.println("책 출판사를 입력해주세요");
	String book_publisher = sc.next();
	System.out.println("책 페이지수를  입력해주세요");
	int book_page_count= sc.nextInt();
	System.out.println("책 장르를 입력해주세요");
	String book_genre = sc.next();
	
	String sql = "insert into book(book_id ,book_title,book_author,book_publication_date"+
			",book_price ,book_publisher,book_page_count,book_genre) values(book_sep.nextval,?,?,?,?,?,?,?)";
	
	Object[] ob = {book_title,book_author,book_publication_date
			,book_price ,book_publisher,book_page_count,book_genre};
	
	DriverManagerDataSource dataSource= new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setUsername("c##kh");
			dataSource.setPassword("kh");
	JdbcTemplate  template = new JdbcTemplate(dataSource);
	template.update(sql,ob);
	System.out.println("임무 완료");
	sc.close();
}
}
