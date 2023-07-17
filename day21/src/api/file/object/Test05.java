package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test05 {
	public static void main(String[] args) throws IOException {

// 슈튜던트의 객체를 파일에 출력
		Student st= new Student("테스트", 50);
		
		File name = new File("sample/student.kh");
		FileOutputStream straem = new FileOutputStream(name);
		BufferedOutputStream buffer = new BufferedOutputStream(straem);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
		
		obj.writeObject(st);
		obj.close();
		
	}
}
