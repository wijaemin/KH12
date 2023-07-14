package api.single;

import java.io.File;
import java.io.IOException;

public class test04 {
public static void main(String[] args) throws IOException {

	File readTarget = new File("D:/origin.txt");//절대경로(absolute path)
	File writeTarget = new File("./sample/copy.txt");//상대경로(relative path)
	
	Fileutil.copy(readTarget, writeTarget);
}
}
