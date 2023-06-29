package array3;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] dice = new int[5][6];
		int count = 0;
		int total= 0;
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i+1)+"회차 입니다. ");
			for (int j = 0; j < dice[i].length; j++) {
				int diceNum = r.nextInt(6) + 1;
				dice[i][j] = diceNum;
				total = dice[i][j]+total;
				System.out.print((j+1)+"번째 : "+dice[i][j]);
				System.out.print("    ");
				count++;			
				
			}

			System.out.println();
			//System.out.println((i+1)+"회차 입니다. ");

		}	System.out.println("전체 평균은 =" + (total/count)+" 입니다.");
			// int total = dice.length * dice[1].length;
			// System.out.println("");
			// System.out.println("평균은 ? " + (dice[i][j] / total));
	}
	}

