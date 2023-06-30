package oop.test03;

public class Test01 {
public static void main(String[] args) {
	goalRanking oneSt=new goalRanking();
	goalRanking twoSt=new goalRanking();
	goalRanking threeSt=new goalRanking();
	goalRanking fourSt=new goalRanking();
	
	oneSt.ranking = 1;
	oneSt.name="킬리안 음바페";
	oneSt.nation="프랑스";
	oneSt.goal=8;
	
	twoSt.ranking = 2;
	twoSt.name="리오넬 메시";
	twoSt.nation="아르헨티나";
	twoSt.goal=7;
	
	threeSt.ranking = 3;
	threeSt.name="올리비에 지루";
	threeSt.nation="프랑스";
	threeSt.goal=4;
	
	fourSt.ranking = 4;
	fourSt.name="훌리안 알바레스";
	fourSt.nation="아르헨티나";
	fourSt.goal=4;
	System.out.println("순위     이름     	국가       골");
	System.out.print(oneSt.ranking+ "   ");
	System.out.print(oneSt.name+ "      ");
	System.out.print(oneSt.nation+ "   ");
	System.out.println(oneSt.goal);
	
	System.out.print(twoSt.ranking+ "   ");
	System.out.print(twoSt.name+ "      ");
	System.out.print(twoSt.nation+ "   ");
	System.out.println(twoSt.goal);
	
	System.out.print(threeSt.ranking+ "   ");
	System.out.print(threeSt.name+ "      ");
	System.out.print(threeSt.nation+ "   ");
	System.out.println(threeSt.goal);
	
	System.out.print(fourSt.ranking+ "   ");
	System.out.print(fourSt.name+ "   ");
	System.out.print(fourSt.nation+ "   ");
	System.out.println(fourSt.goal);
}
}
