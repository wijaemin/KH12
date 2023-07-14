package api.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileutil {

	//파일 복사 메소드
	public static void copy(File readTarget,File wirteTarget) throws IOException {

		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream wirteStream = new FileOutputStream(wirteTarget);
		
		while(true) {
		int a = readStream.read();
		if(a ==-1) {break;}
		wirteStream.write(a);
		}
		
		readStream.close();
		wirteStream.close();
	}
}
