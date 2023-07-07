package api.lang.string;

import java.util.Properties;

public class Test01 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("hello", "world");
		prop.setProperty("good", "bye");
		System.out.println(prop.toString());
		System.out.println(prop.getOrDefault("hello", "world"));
	}
}
