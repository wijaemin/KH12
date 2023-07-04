package oop.keyword4;

public class Test01 {
public static void main(String[] args) {
	System.out.println("제곱은 ? "+Robot.square(11));
	System.out.println("삼각형의 넓이는? "+Robot.triangle(3, 7));
	System.out.println("원의 넓이는 ? "+ Robot.circle(5));
    int[] data = new int[] { 10, 5, 16, 15 };
	
				Robot.sort1(data);
}
}
