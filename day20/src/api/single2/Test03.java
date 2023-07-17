package api.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File target = new File("sample/target.kh");
		File copyTarget = new File("sample/copytarget.kh");
		FileInputStream stream = new FileInputStream(target);
		FileOutputStream copyStream = new FileOutputStream(copyTarget);



		byte[] buffer = new byte[4096];
		long count = 0L;
		long total = target.length(); // 전체 옮길 글자수
		double percent = count * 100 / total;
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		long start = System.currentTimeMillis();
		while (true) {
			int a = stream.read(buffer);
			if (stream.read(buffer) == -1) {
				break;
			}
			copyStream.write(buffer, 0, a);
			count++;
			System.out.println(fmt.format(percent) + "%" + count);
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 " + (end - start) + "ms");
		stream.close();
		copyStream.close();

	}
}
