package api.file.single2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	//파일 복사 메소드
	//파일일 경우는 버퍼를 이용하여 대량복사를 진행한다
	//디렉터리 일경우 다음과 같은 절차를 가진다.
	// 1. 대상위치 안에 원본 디렉터리 이름과 같은 디렉터리를 생성
//2. 원본 디렉터리 안에 있는 파일or 디렉터리를 1번에서 만든 위치로 복사
	public static void copy(File origin, File target) throws IOException {
		if(origin.isFile()) {
			//읽기
			FileInputStream readStream = new FileInputStream(origin);
			BufferedInputStream readBuffer = new BufferedInputStream(readStream);
			
			//쓰기
			FileOutputStream  writeStream = new FileOutputStream(target);
			BufferedOutputStream writeBuffer = new BufferedOutputStream(writeStream);
			
			byte[] data = readBuffer.readAllBytes();
			writeBuffer.write(data);
			
			//정리
			readBuffer.close();
			writeBuffer.close();
		}
		else if(origin.isDirectory()) {
			//만약에 타겟이 없으면 생성
			if(target.exists()) {
				target.mkdirs(); // D:/test
			}
			//같은 이름으로 타겟 아래에 생성
			File dir = new File(target, origin.getName());
			dir.mkdirs();
			
			//내용물은 dir 내부에 복사
			File [] list = origin.listFiles();
			for(File file : list) {
				//파일이면 대상 폴더에 같은 이름으로 복사
				if(file.isFile()) {
					copy(file, new File(dir, file.getName())); //재귀호출
				}
				else if (file.isDirectory()) {
					copy(file,dir);//재귀호출
				}
				//디렉터리면 대상폴더에 하위이름으로 생성
			}
		}
	}
	
	
	
	//파일(디렉터리) 삭제 메소드
	//파일 일 경우 그냥 삭제 하면된다.
	//디렉터리 일경우 내부에 있는 모든 요소를 삭제한뒤 삭제해야 한다.
	// 내부에 있는 요소는 파일인지 디렉터리인지 알수 없다.
	// 다시 검사해서 삭제하도록 요청해야 한다(제귀 recursive)
public static void delete(File taget) {
	if(taget.isFile()) {
		taget.delete();
	}
	else if (taget.isDirectory()) {
		File [] list = taget.listFiles();
		//확장 반복문(찾아보기)	정말정말정말정말정말정말정말정말정말정말정말정말정말정말
		for ( File file : list) {
			delete(file);//재귀 호출(같은 기능을 재호출)
		}
		taget.delete();
		
	}
}
}
