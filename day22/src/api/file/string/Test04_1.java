package api.file.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test04_1 {
	public static void main(String[] args) throws IOException {
		// 문자열 입력
		// 1. 일정 글자 수 만큼 지정해서 읽는 방법(File Reader)
		// 2. 줄 단위로 읽는 방법(Buffered Reader)

		File taget = new File("sample/string.kh");
		FileReader fr = new FileReader(taget);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());

		//반복문 
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}

	}
}
