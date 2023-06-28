package array;

public class Test10_1 {
	public static void main(String[] args) {
		// 배열의 주요 계산방법 -최대/최소 찾기

		// 데이터의 가장 큰값이 얼마인가? 어디있는가?
		// 또는 데이터의 가장 작은 값이 얼마인가? 어디잇는가?
		int[] data = new int[] { 30, 50, 20, 10, 40 };

		// 최대값은 [0]위치가 가장크다고 가정하고
		// [1]부터 끝까지 비교하여 더큰 데이터가 나오면 덮어쓰기하여 구한다.
		int maxlndex = 0;// 0번위치가 가장 크다고 정하는 것
		for (int i = 1; i < data.length; i++) {
			if (data[maxlndex] < data[i]) {
				maxlndex = i;
			}
		}
		System.out.println("최대값 위치 = " + maxlndex);
	}
}
