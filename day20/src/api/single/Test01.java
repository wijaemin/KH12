package api.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		// 싱글 바이트 입출력
		// 입출력 규격 1byte에 맞는 데이터(자바로 치면 byte)

//준비물
		// 1. 출력할 파일(파일 객체) 프로젝트내에 sample 폴더만의 single.kh파일)
		// 2. 출력을 위한 통로 객체
		// [프로그램] -->[출력통로(stream)] --> [파일객체(target)] --> [실제 파일]

		File target = new File("sample/single.kh");
		target.createNewFile(); // 파일 생성(출력시에만 하며 생략가능)
		FileOutputStream stream = new FileOutputStream(target);

		// stream 에게 데이터를 전달
		// byte의 유효범위는 -128부터 127까지 이다 (아스키코드)
		stream.write(65);
		stream.write(66);
		stream.write(65);
		stream.write(9);
		stream.write('h');
		stream.write('e');
		stream.write('l');
		stream.write('l');
		stream.write('o');
		stream.write('\n');
		stream.write('K');
		stream.write('H');
		stream.write('a');
		stream.write('c');
		stream.write('a');
		stream.write('d');
		stream.write('e');
		stream.write('m');
		stream.write('y');
		
		stream.close();

	}
}
