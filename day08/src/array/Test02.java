package array;

public class Test02 {
	public static void main(String[] args) {
		// 배열(array)
		// -여러개의 같은 종류 데이터를 저장할 수 있는 공간

		// 생성
		// a(리모컨) ----------->[ 0 ] [ 0 ] [ 0 ] 3개를 만들라는 의미
		int[] a = new int[3];
		//a =10; 이것도 에러다(컴파일 에러)
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//a[3] = 40;// 이것도 에러다 (런타임 에러)
		
		System.out.println(a);// 리모컨 정보 출력 하는 느낌(이렇게 하지말것)
		System.out.println(a[0]); // a가 보는 +0 지점 데이터
		System.out.println(a[1]); // a가 보는 +1 지점 데이터
		System.out.println(a[2]); // a가 보는 +2 지점 데이터
		// System.out.println(a[3]);//없음 에러임
	}
}
