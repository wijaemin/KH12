package oop.method;

public class Test01 {
public static void main(String[] args) {
	goalRanking oneSt=new goalRanking();
	goalRanking twoSt=new goalRanking();
	goalRanking threeSt=new goalRanking();
	goalRanking fourSt=new goalRanking();
	
	oneSt.setup(1,"킬리안 음바페","프랑스", 8);
	twoSt.setup(2,"리오넬 메시","아르헨티나", 7);
	threeSt.setup(3,"올리비에 지루","프랑스", 4);
	fourSt.setup(4,"훌리안 알바레스","아르헨티나", 4);
	
	System.out.println("순위     이름     	국가       골");
	oneSt.show();
	twoSt.show();
	threeSt.show();
	fourSt.show();

}
}
