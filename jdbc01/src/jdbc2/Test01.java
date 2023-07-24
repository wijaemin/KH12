package jdbc2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {
	public static void main(String[] args) {
		// 포켓몬스터 정보 수정(update)
		// = 포멧몬스터 항목은 총 3가지(no, name, type)
		// 개별항목만 변경할 수 있고 다 바꿀 수도 있다.
		// 반드시 한개의 항목은 바꾸지 말아야 하며 일반적으로 프라이머리 키가 불변

		// 데이터 준비
		int no = 50;
		String name = "오이름";
		String type = "테스트";

		// 생성될 구문은 다음과 같다.
		String sql = "update pocketmon set name =?, type = ? where no =?";
		Object[] data = { name, type, no };
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("kh");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,data);
		
		//진짜 완료가 됫는지 아닌지 알수 없다.
		// 업데이트는 실행이 되었다고 반드시 바뀌엇다고 볼수 없다.
		// 실제로 적용된 행의 개수를 알아야한다.
// 업데이트의 결과를 젖아하여 확인후 판정한다.
		int result = jdbcTemplate.update(sql,data);
		System.out.println("result =" +result);
		//System.out.println("임무 완료");

		if(result>0) {
			System.out.println("임무완료");
		}
		else {System.out.println("수정안됨 없는 번호다");}
	}
}
