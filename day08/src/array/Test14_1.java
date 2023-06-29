package array;

public class Test14_1 {
	public static void main(String[] args) {
		int[] dataList = new int[] { 30, 50, 20, 10, 40 };
		int backUp = dataList[0];
		int backUp2 =dataList[1];
		dataList[0] = dataList[4]; // 마지막 자리 40은 첫번째자리 30으로 이동한다.
		System.out.println(dataList[0]);
		System.out.println(dataList[4]);
		dataList[4] = backUp; // 마지막자리의 숫자를 backUp안에 있는 30으로 바꾼다.

		dataList[1] = dataList[3];
		dataList[3] = backUp2;
		System.out.println("----------------------------");
		for (int i = 0; i < dataList.length; i++) {
			System.out.println(dataList[i]);
		}
	}
}
