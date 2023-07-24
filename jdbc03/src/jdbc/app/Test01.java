package jdbc.app;

import jdbc.dao.pocketmonDao;

public class Test01 {
public static void main(String[] args) {
	//포켓몬스터 등록
	
	//데이터
	int no =55;
	String name = "어쩌고";
	String type = "저쩌고";

//처리
	pocketmonDao dao = new pocketmonDao();
	dao.insert(no, name, type);
	
	System.out.println("등록 완료");

}
}
