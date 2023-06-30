package oop.method2;

public class Test04 {
public static void main(String[] args) {
	olmpic one =new olmpic();
	olmpic two =new olmpic();
	olmpic three =new olmpic();
	
	one.setup("진종오", "사격", "하계", 4, 2, 0);
	two.setup("김수녕", "양궁", "하계", 4, 1, 1);
	three.setup("전이경","쇼트트랙","동계", 4, 0, 1);
	
	System.out.println("역대 한국인 올림픽 메달 보유 선수");
	System.out.println("이름      종목    구분     금메달    은메달    동메달");
	one.show();
	two.show();
	three.show();
}
}
