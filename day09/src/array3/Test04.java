package array3;

public class Test04 {
	public static void main(String[] args) {
		String[][] map = new String[2][3];
		map[0][0] = "자바";
		map[0][1] = "스프링";
		map[0][2] = "안드로이드";
		map[1][0] = "파이썬";
		map[1][1] = "판다스";
		map[1][2] = "장고";
		
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < 3; k++) {
				System.out.println(map[i][k]);
			}
		}
	}
}
