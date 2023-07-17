package api.file.single2;

import java.io.File;
import java.io.IOException;

public class Test05 {
public static void main(String[] args) throws IOException {
	//파일 복사는 가능하지만 디렉터리는 생성/삭제만 가능
	
	
	//File a =new File("파일1");
//	File b =new File("파일2");
	File a =new File("D:/황민하");
	File b =new File("D:/copy");
	
	
	FileUtil.copy(a,b);
}

}

