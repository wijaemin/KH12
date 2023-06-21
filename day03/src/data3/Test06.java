package data3;

public class Test06 {
public static void main(String[] args) {
	int number = 95;
	
	boolean game = number <100;
	
	boolean game1 =(int) (number%10) ==3 || (number%10) ==6 || (number%10) ==9;
	
	//boolean game2= number <100 && game1 == true;
	
	boolean game3 =(int) (number/10) ==3 || (number/10) ==6 || (number/10) ==9;
	
	boolean game4= game && game1 == true || game3 == true;
	
    	System.out.println(game4);
	
}
}
