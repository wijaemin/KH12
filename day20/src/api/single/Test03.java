package api.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		File readTarget =new File("D:/orign.txt");
		File wirteTarget =new File("./sample/copy.txt");
		
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
