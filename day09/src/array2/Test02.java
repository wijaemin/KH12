package array2;

public class Test02 {
	public static void main(String[] args) {
		// 버블 정렬
		// 인접한 두항목을 비교하여 교체하며 정렬하는 방식
		// 큰데이터가 좌측에 있으면 교체 아니면 비교체
		int[] data = new int[] { 30, 50, 20, 10, 40 };
		                                   // 0    1    2    3    4
		int max = 1;
		int backup = 0;
		for (int i = 0; i < data.length; i++) {
			int left = i- data.length;
			for (int k = i + 1; k < data.length; k++) {
				if (data[i] > data[k]) {
					backup = data[i]; 
					data[i] = data[k];
					data[k] = backup;
				}
			}
			System.out.print(data[i]);
			System.out.print("\t");

		}
	}
}
