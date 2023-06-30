package oop.test02;

public class Test01 {
public static void main(String[] args) {
	poketMon a = new poketMon();
	poketMon b = new poketMon();
	poketMon c = new poketMon();
	poketMon d = new poketMon();
	a.num = 1;
	a.name = "이상해씨";
	a.type ="풀";
	
	b.num = 4;
	b.name = "파이리";
	b.type ="불꽃";
	
	c.num = 7;
	c.name = "꼬부기";
	c.type ="물";
	
	d.num = 25;
	d.name = "피카츄";
	d.type ="전기";
	
	System.out.print(a.num+ "  ");
	System.out.print(a.name+ "  ");
	System.out.println(a.type);
	
	System.out.print(b.num+ "  ");
	System.out.print(b.name+ "  ");
	System.out.println(b.type);
	
	System.out.print(c.num+ "  ");
	System.out.print(c.name+ "  ");
	System.out.println(c.type);
	
	System.out.print(d.num+ "  ");
	System.out.print(d.name+ "  ");
	System.out.println(d.type);

}
}
