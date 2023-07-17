package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.event.TreeExpansionEvent;

public class Test02 {

	public static void main(String[] args) throws IOException {
		Random r = new Random();
		
		List<Integer> rotto = List.of (5,20,30,45,2,4);
	Set<Integer> lotto = new TreeSet<Integer>();
	while(lotto.size()<6) {
		lotto.add(r.nextInt(45)+1);
	}
		

		File name = new File("sample/rotto.kh");
		FileOutputStream straem = new FileOutputStream(name);
		BufferedOutputStream buffer = new BufferedOutputStream(straem);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);

		obj.writeObject(rotto);
		obj.close();

	}
}
