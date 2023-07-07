package api.lang.string2;

public class Test01 {
	public static void main(String[] ages) {
//문자열의 구체적인 검사

		String name = "홍길동";

		// (Q) 올바른 이름 형식인가요?
		// 1.모든 글자는 한글로 한다.
		// 2. 이름은 2~7글자로 이루어져 있어야 한다.
		int count = 0;
		boolean a = (name.length() >= 2 && name.length() <= 7);

		for (int i = 0; i < name.length(); i++) {
			char nick = name.charAt(i);
			if (nick >= '가' && nick <= '힣') {
				count++;
			}
		}
		boolean b=name.length() ==count;
		System.out.println(a);

	}
}
