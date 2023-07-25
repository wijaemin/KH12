package jdbc.app;

import jdbc.dao.pocketmonDao;

public class Test12 {
public static void main(String[] args) {
	int no = 50;
	pocketmonDao dao =new pocketmonDao();
	boolean result = dao.delete(no);
	
	if (result)System.out.println("포켓몬스터 정보 삭제");
	else System.out.println("존재하지 않는 포켓몬스터 번호");
}
}
