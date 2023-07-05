package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		Chrome a = new Chrome();
		Edge b = new Edge();
		Whale c = new Whale();
		System.out.println("===크롬 기능===");
		a.setUrl("https://www.google.com/chrome");
		System.out.println(a.getUrl());
		a.refresh();
		a.move();
		a.develop();
		a.chromeStore();
		System.out.println("===엣지 기능===");
		b.setUrl("https://support.microsoft.com");
		System.out.println(b.getUrl());
		b.refresh();
		b.move();
		b.fullScreen();
		System.out.println("===웨일 기능===");
		c.setUrl("https://whale.naver.com");
		System.out.println(c.getUrl());
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
	}
}
