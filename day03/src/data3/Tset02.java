package data3;


public class Tset02 {
public static void main(String[] args) {
	int legalAge =20;
	int Nowyear = 2023;
	int peopleYear = 2003;
	int koreaAge = 1;
	int yourYear = Nowyear  - peopleYear +koreaAge  ;
	boolean legal = yourYear >= legalAge; 
	System.out.println(legal);


	
	if (legal == true) { System.out.println( "구매가능합니다.");
		
	}
	else if(legal ==false) { System.out.println("구매 불가능 합니다.");
		
	}
	
}
}
