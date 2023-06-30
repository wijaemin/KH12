package oop.method5;

public class test01 {
	public static void main(String[] args) {
		onlinePromotion cass = new onlinePromotion();
		onlinePromotion hite = new onlinePromotion();
		onlinePromotion nogsim = new onlinePromotion();
		onlinePromotion heate= new onlinePromotion();
		
	cass.setup("참이슬 후레쉬","주류",1200, true, true);
	hite.setup("클라우드 맥주","주류",3000, false, true);
	nogsim.setup("바나나킥","과자",1500, false, true);
	heate.setup("허니버터 칩 ","과자",2000, true, false);
	
	cass.show();
	hite.show();
	nogsim.show();
	heate.show();
	
	}
}
