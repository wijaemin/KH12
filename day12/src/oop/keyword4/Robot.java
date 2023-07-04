package oop.keyword4;

public class Robot {
	private int num;
	private int num1;
	private int num2;
	private int num3;


	public static int square(int num) {
		return num * num;
	}

	public static double triangle(int num, int num1) {
		return (num * num1) / 2f;
	}

	public static double circle(int num) {
		return square(num) * 3.14d;
	}

	public static void sort(int[] sort1) {
		int backUp = 0;
		for (int i = 0; i < sort1.length - 1; i++) {
			while (sort1[i] >= sort1[i + 1]) {
				backUp = sort1[i];
				sort1[i] = sort1[i + 1];
				sort1[i + 1] = backUp;
				if (sort1[i] == sort1.length) {

					break;
				}

			}
		}
	}
	public static void sort1(int[] dataList) {
		int left = 0;
		for (int i = 0; i < dataList.length / 2; i++) {

			left = i; // 왼쪽위치
			int right = dataList.length - 1-left; // 오른쪽위치

			int backup = dataList[left];
			dataList[left] = dataList[right];
			dataList[right] = backup;
		}
			}
	
	
	
}