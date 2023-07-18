package api.file.string;

import java.awt.print.Printable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File a = new File("sample/test.kh");
		FileWriter s = new FileWriter(a);
		BufferedWriter w = new BufferedWriter(s);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("입력 : ");
			String in = sc.next();
			
	
			if (in.equals("종료")) {
				System.out.println("이 프로그램을 종료 합니다.");
				w.close();
				break;
			}
			w.write(in);
			w.write("\n");

		}
	}
}
