package api.file.string;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// 문자열 출력
		// 문자열 출력은 필연적으로 인코딩이 필요
		// Writer 계열의 클래스를 사용하여 처리
		File directory = new File("sample");
		directory.mkdirs();
		File target = new File(directory, "string.kh");
	//	FileOutputStream fw = new FileOutputStream(target); 문자열은 이거 안씀
		FileWriter fw = new FileWriter(target);
	//	BufferedOutputStream bw = new BufferedOutputStream(fw); 문자열은 이거 안씀
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.write("\t");
		bw.write("안녕하세요");
		bw.write("\n");
		bw.write("자바가 종료됩니다.");
	//	bw.flush(); // 클로즈 플러쉬 둘다 사용가능
		bw.close();

	}
}
