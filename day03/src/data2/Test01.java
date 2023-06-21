package data2;

public class Test01 {
	public static void main(String[] args) {
	//실수가 필요한 경우
		//국어점수가 75점 영어점수가 80일떄 평균은?
		int korean =75;
		int english = 80;
		double average = (korean + english) / 2f;
		System.out.println(average);
		
//실수는 2가지
		
		float a = 3.14F;
		double b= 3.14;
		//표시가능한 자리수 차이가 존재
		//더블이 더많다
		//더블이 기본값으로 인식 , 풀릇은 F 표시해줘야함
		//자리수 제한으로 부정확하다.
		//(중요) 실수가 한개라도 있는 계산은 결과가 실수다.
		System.out.println(a);
 System.out.println(b);
		System.out.println(10 /3);
		System.out.println(10 /3.0);
		System.out.println(10.0 /3);
		System.out.println(10 /3f);
		System.out.println(10 /3d);
		

	}

}
