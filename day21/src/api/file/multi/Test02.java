package api.file.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// 준비물
		File target = new File("sample/muti.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		DataOutputStream data = new DataOutputStream(buffer);
		
		//구조 
		//[프로그램] -> data[분해] -> buffer[임시저장] -> stream[통로]
 // -> target[파일] -> [실행파일]		
		
		//data에게 각종 원시형 데이터를 전달한다.
		data.writeInt(100); //4바이트
		data.writeDouble(100);//8바이트
		data.writeChar(100);//2바이트
		data.writeFloat(100);//4바이트
		data.writeLong(100);//8바이트

		//정리(+버퍼 비우기 = flush)
		data.flush(); //앞으로도 전송할것이 있으면 플러쉬를 쓴다
		//data.close(); // 이제 앞으로 전송할것이 없으면 이걸 쓴다.
	}
}
