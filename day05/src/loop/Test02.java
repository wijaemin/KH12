package loop;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("누르고 싶은 숫자를 입력하세요 : ");
	int number = sc.nextInt();
	sc.close();
	for (int i = 0; i <5; i++) {
		System.out.println("출력" + number+" 되어있습니다.");
	}
}
}
