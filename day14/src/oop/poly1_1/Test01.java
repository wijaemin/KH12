package oop.poly1_1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int type = sc.nextInt();
		int action = sc.nextInt();

		notebook notebook;
		if (type == 1) {
			notebook = new mac();
		} else {
			notebook = new galxy();
		}

		if (action == 1) {
			notebook.power();
		} else if (action == 2) {
			notebook.video();
		} else
			notebook.typing();
	}
}
