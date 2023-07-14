package api.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File target = new File("sample/target.kh");
		File copyTarget = new File("sample/copytarget.kh");
		FileInputStream stream = new FileInputStream(target);
		FileOutputStream copyStream = new FileOutputStream(copyTarget);

		int c = (int) target.length() / 10;
		if (c == 13) {
			System.out.println("\n");
		} else if (c <= 10) {
			c = (int) target.length();
		} else {
			c = (int) target.length() / 10;
		}
		byte[] buffer = new byte[c];

		while (true) {

			stream.read(buffer);
			if (stream.read(buffer) == -1) {
				break;
			}
			copyStream.write(buffer);
			System.out.println(Arrays.toString(buffer));
		}

		stream.close();
		copyStream.close();

	}
}
