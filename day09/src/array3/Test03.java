package array3;

public class Test03 {
	public static void main(String[] args) {
		float[][] num1 = new float[2][3];
		num1[0][0] = 1.5f;
		num1[0][1] = 2.5f;
		num1[0][2] = 3.6f;
		num1[1][0] = 10.2f;
		num1[1][1] = 5.3f;
		num1[1][2] = 6.5f;
float[][] num2 = {
		{1.5f, 2.5f, 3.6f,},
		{10.2f, 5.3f, 6.5f}
		};
		for (int i = 0; i < num1.length; i++) {
			for (int k = 0; k < num1[i].length; k++) {
				System.out.println(num1[i][k]);
			}
		}
	}
}
