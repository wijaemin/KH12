package api.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> login = new TreeMap<>();
		login.put("admin", "admin1234");
		login.put("teacher", "teacher1234");
		login.put("student", "student1234");
		login.put("manager", "manager1234");
		System.out.println("사용자 ID를 입력헤주세요.");
		String ID = sc.next();
		System.out.println("사용자 패스워드를 입력헤주세요.");
		String passWord = sc.next();

		if (login.containsKey(ID) && login.equals(login.get(ID))) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}

	}
}
