package api.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// Test01에서 저장한 파일 내용을 불러오도록 구현

		// 준비물
		File target = new File("sample/single.kh");
		FileInputStream stream = new FileInputStream(target);

		// [프로그램] <--- [입력통로(stream)] <---[파일객체(target)]

		while (true) {
			int a = stream.read();
			if (a == -1) {//EOF처리 end of file.
				break;
			}
			System.out.println(a);

		}
		stream.close();
	}
}
