package data2;

public class Test02 {public static void main(String[] args) {
	
	double hight = 180;
	int wight = 80;
	
	double BMI =(wight/((hight/100)*(hight/100)));
	float BMIs =(float) (wight/((hight/100)*(hight/100)));
	System.out.println("당신의 BMI지수는 " +BMI + "입니다.");
	System.out.println("당신의 BMI지수는 " +BMIs + "입니다.");
}

}
