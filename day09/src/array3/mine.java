package array3;

import java.util.Random;

public class mine {
	public static void main(String[] args) {
		int mapSize = 9;
		int[][] mine = new int[mapSize][mapSize];
		Random r = new Random();
		int bome = 9;
		int count = 1;
		int notMineCount = 1;
		for (int i = 1; i <= 10; i++) {
			int x = r.nextInt(9);
			int y = r.nextInt(9);
			// mine[x][y] = bome; 이렇게 하면 랜덤으로 폭탄의 위치가 배정된다.
			if (x != 0 && y != 0 && x != 8 && y != 8) {
				mine[x][y] = bome;
				count++;
				for (int j = -1; j <= 1; j++) {
					for (int m = -1; m <= 1; m++) {
						mine[x + j][y + m] = notMineCount;
						mine[x][y] = bome;
					}
				}
			} else {
				i--;
			}
		}
		for (int i1 = 0; i1 < mine.length; i1++) {
			for (int k = 0; k < mine[i1].length; k++) {
				System.out.print(mine[i1][k]);
				System.out.print("\t");
			}
			System.out.println("");
		}
		System.out.println("폭탄이 되지않은 칸수는 : " + (mine.length * mine.length - count) + "칸 입니다.");
	}
}

//지뢰찾기 만들기
//
//지뢰찾기를 다음 요구사항에 맞게 구현
//
//9x9 배열을 준비(초급자난이도)
//랜덤으로 10개의 폭탄을 지도에 배치(폭탄은 숫자 9로 설정)
//지도 출력
//폭탄이 아닌 칸의 숫자를 계산(선택)
//폭탄이 배치되지 않은 칸들을 반복하며 계산
//기준 칸 주변 8칸을 조사하여 폭탄의 개수를 카운트
//카운트된 숫자를 현재 위치에 대입
//최종 지도 출력(선택)