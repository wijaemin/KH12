package api.lang.string3;

public class Test02 {
	public static void main(String[] ages) {

		long start = System.currentTimeMillis(); // 측정시작

		String star =  "";
		for(int i = 0; i<100000; i++) {
			star +="*";
		}
		
		
		
		
		long finish = System.currentTimeMillis(); // 측정 완료

		
		
		long time = finish -start;
		System.out.println("시간 : " + time);
	}
}
