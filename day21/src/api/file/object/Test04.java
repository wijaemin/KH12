package api.file.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Random r = new Random();



		File name = new File("sample/rotto.kh");
		FileInputStream stream = new FileInputStream(name);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream obj = new ObjectInputStream(buffer);

		Set <Integer> a = (Set<Integer>) obj.readObject();
		System.out.println(a);
		obj.close();
	}
}
