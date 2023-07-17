package api.file.single2;

import java.io.File;

public class Test01 {
public static void main(String[] args) {
	
	File taget = new File("D:/dummy");
	
	//파일 삭제는 간으하지만 디렉터리는 비어있는 것만 삭제가 가능
FileUtil.delete(taget);
	
}
}
