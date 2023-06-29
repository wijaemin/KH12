package array;

public class Test11 {
	public static void main(String[] args) {
		double[] dataList = new double[] { 150.8, 180.2, 175.9, 162.7, 170.3 };
		int min = 0;
		int minIndex = 0;
		
		for (int i = 1; i < dataList.length; i++) {
			if (min > dataList[i]) {
				min = (int) dataList[i];
			}
		}
		System.out.println("제일 작은 사람은? " + dataList[min]);
		
		
		for (int i = 1; i < dataList.length; i++) {
			if (minIndex > dataList[i]) {
				minIndex = i;
			}
		}
		System.out.println("제일 작은 사람의 위치는 ? " + minIndex);
	}
}
