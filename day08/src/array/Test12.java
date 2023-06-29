package array;

public class Test12 {
	public static void main(String[] args) {
		// 배열의 위치조작(변경)
		int[] data = new int[] { 30, 50, 20, 10, 40 };
		// 0번위치와 3번위치의 값을 교체(Swap)
		//(중요) 자바는 두데이터의 맞교환이 불가능하다(변수를 추가하여 돌리기);
		
		//안되는 코드
		//data[0] = data[3];
		//data[3] = data[0];
		
		//가능한 코드 //오른쪽에서 왼쪽으로 계산을 생각한다. (대입법)
		int backup = data[0];
		data[0] = data[3];
		data[3] = backup;
		for (int i = 0; i < 5; i++) {
			System.out.println(data[i]);
		}
	}
}
