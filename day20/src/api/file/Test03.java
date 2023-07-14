package api.file;

import java.io.File;
import java.io.IOException;

public class Test03 {
public static void main(String [] ages) throws IOException, InterruptedException{
	//파일 또는 디렉터리 생성 / 삭제
	//(주의)디렉터리는 비어있는것만 삭제가 가능
	
	File target = new File("D:/dummy");
	
	//파일로 만들고 싶다면  createNewFile()
	//target.createNewFile();
	//디렉터리로 만들고 싶다면 mkdir 또는 mkdirs
//	target.mkdir(); //중간 경로가 없으면 생성 불가
	target.mkdirs(); //중간경로가 없어도 새로운 폴더를 생성하여 가는길을 만들어놈 
	
	Thread.sleep(5000L);
	//파일이나 디렉터리나 모두 삭제는 동일
	//(주의) 디렉터리는 비어있는것만 삭제가 가능
	target.delete();
	
}
}
