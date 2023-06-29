package array2;

public class Test02_1 {
	public static void main(String[] args) {
		// 버블 정렬
		// 인접한 두항목을 비교하여 교체하며 정렬하는 방식
		// 큰데이터가 좌측에 있으면 교체 아니면 비교체
		int[] data = new int[] { 30, 50, 20, 10, 40 };
		// 0 1 2 3 4
		
		for (int k = data.length-2; k >= 0; k--) {
			for (int i = 0; i <= k; i++) {
				if (data[i] > data[i + 1]) {
					int backup = data[i];
					data[i] = data[i + 1];
					data[i + 1] = backup;
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
	}
}
