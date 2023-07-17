package api.file.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File readTarget = new File("sample/muti.kh");
		FileInputStream readStream = new FileInputStream(readTarget);
		BufferedInputStream buffer = new BufferedInputStream(readStream);
		DataInputStream data = new DataInputStream(buffer);

		// 구조
		// [프로그램] -> data[조합] -> buffer[임시저장] -> stream[통로]
		// -> target[파일] -> [실제파일]
		int a = data.readInt();
		double b = data.readDouble();
		char c = data.readChar();
		float d = data.readFloat();
		long e = data.readLong();
// 같은 형식의 변수여야 재대로 출력된다.
	//	순서가 틀리면 다른 형태로 바뀜
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		data.close();
	}
}
