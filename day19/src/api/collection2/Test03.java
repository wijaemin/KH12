package api.collection2;

import java.util.HashSet;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> loveList = new HashSet<Integer>();
		while (true) {
			System.out.println("누르고 싶은 글 번호를 입력해주세요.");
			int love = sc.nextInt();	
			if (loveList.contains(love)) {
				loveList.remove(love);	
				System.out.println(love + "번 글♡");
						
			} else {			
				loveList.add(love);	
				System.out.println(love + "번 글♥");
			}
			if (love < 0) {
				loveList.remove(love);
				System.out.println("오류");
				break;
			}

		}
		System.out.println("<지금까지의 기록>");
		System.out.println(loveList);
		sc.close();
	}
}
