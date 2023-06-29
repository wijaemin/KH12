package array2;

public class Test02_2 {
	public static void main(String[] args) {
		// 버블 정렬
		// 인접한 두항목을 비교하여 교체하며 정렬하는 방식
		// 큰데이터가 좌측에 있으면 교체 아니면 비교체
		int[] data = new int[] { 30, 50, 20, 10, 40 };
		// 0 1 2 3 4
		int max = 0;
		for (int i = 0; i < data.length; i++) {
		}
if(data[0] > data[1]) {
	int backup =data[0];
	data[0] = data[1];
	data[1] = backup;
}

if(data[1] > data[2]) {
	int backup =data[1];
	data[1] = data[2];
	data[2] = backup;
}

if(data[2] > data[3]) {
	int backup =data[2];
	data[2] = data[3];
	data[3] = backup;
}

if(data[3] > data[4]) {
	int backup =data[3];
	data[3] = data[4];
	data[4] = backup;
}

		
		
		
		
		
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
	}
}
