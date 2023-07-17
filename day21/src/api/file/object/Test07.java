package api.file.object;

import java.io.IOException;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		player a = new player("황민하", 5, 2000);
		a.show();

		a.show2();
	}
}
