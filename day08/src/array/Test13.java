package array;

public class Test13 {
	public static void main(String[] args) {
		int[] dataList = new int[] { 30, 50, 20, 10, 40 };

		// 몇칸이든 통하는 방법
		// 바꾸는 횟수는 데이터 갯수의 절반과 같다

		int left = 0;
		for (int i = 0; i < dataList.length / 2; i++) {

			left = i; // 왼쪽위치
			int right = dataList.length - 1-left; // 오른쪽위치

			int backup = dataList[left];
			dataList[left] = dataList[right];
			dataList[right] = backup;
		}
		for (int i = 0; i < dataList.length; i++) {
			System.out.println(dataList[i]);
		}
	}
}
