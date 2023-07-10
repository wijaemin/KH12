package api.lang.string3;

public class Test2_1 {
	public static void main(String[] ages) {

		long start = System.currentTimeMillis(); // 측정시작
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < 100000000; i++) {
			buffer.append("*");
		}

		String star = buffer.toString();

		long finish = System.currentTimeMillis(); // 측정 완료

		long time = finish - start;
		System.out.println("시간 : " + time);
	}
}
