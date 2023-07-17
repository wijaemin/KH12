package api.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test06 {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	//Test05에서 저장한 슈트던트 객체를 입력하여 정보 출력
	File st = new File("sample/student.kh");
	FileInputStream straem = new FileInputStream(st);
	BufferedInputStream buffer = new BufferedInputStream(straem);
	ObjectInputStream obj = new ObjectInputStream(buffer);
	
	Student a =(Student) obj.readObject();
	obj.close();
	
	System.out.println(a.getName());
	System.out.println(a.getScore());
}
}
