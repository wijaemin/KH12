package api.single2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		// 한글자씩 처리하면 느리다는 것을 알았기 때문에 여러글자를 한번에 처리

		File target = new File("sample/single2.kh");
		FileOutputStream stream = new FileOutputStream(target);

		// 출력(파일)
		byte[] buffer = new byte[] { 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a' };
		stream.write(buffer);// 버퍼에 있는 글자 를 모두 출력
		stream.write('\n');
		stream.write(buffer);
		stream.write('\n');
		stream.write(buffer, 0 , 5);
		
		
		stream.close();

	}
}
