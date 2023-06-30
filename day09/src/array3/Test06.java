package array3;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] bingoList = new int[5][5];
		int size = 5;
		System.out.println("<------------빙고 판------------->");
		for (int i = 1; i <= size * size; i++) {
			int x = r.nextInt(size);
			int y = r.nextInt(size);
			if (bingoList[x][y] == 0) {
				bingoList[x][y] = i;	
			} else {
				i--;
			}
			System.out.println(bingoList[x][y]);
			System.out.println('\t');
		
		}
		System.out.println();
	}
}

//		for (int i = 0; i < bingoList.length; i++) {
// for (int j = 0; j < bingoList[i].length; j++) {
// int size = r.nextInt(bingoList.length);
// int size1 = r.nextInt(bingoList.length);

// count++;
// bingoList[i][j] = count;
// System.out.print(bingoList[i][j]);
// System.out.print(" ");
