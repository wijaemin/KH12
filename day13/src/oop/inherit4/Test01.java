package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		mp4 a = new mp4();
		mp3 b = new mp3();
		hwp c = new hwp();
		ppt d = new ppt();

		a.setFilename("엠피4");
		a.setFilesize(40);
		b.setFilename("엠피3");
		b.setFilesize(30);
		b.setDuration(50);
		c.setFilename("에이치");
		c.setPagesize(1);
		c.setPagesize(20);
		d.setFilename("피피티");
		d.setFilesize(50);
		d.setPagesize(1);
		
		
		System.out.println("이름 : "+a.getFilename());
		System.out.println("파일 크기 : "+a.getFilesize());
		a.execute();
		a.forward();
		a.rewind();
		System.out.println("이름 : "+b.getFilename());
		System.out.println("파일크기 : "+b.getFilesize());
		System.out.println("재생시간 : "+b.getDuration());
		b.execute();
		b.forward();
		b.rewind();
		System.out.println("이름 : "+c.getFilename());
		System.out.println("파일크기 : "+c.getFilesize());
		System.out.println("페이지수 : "+c.getPagesize());
		c.execute();
		c.preview();
		System.out.println("이름 : "+d.getFilename());
		System.out.println("파일크기 : "+d.getFilesize());
		System.out.println("페이지수 : "+d.getPagesize());
		d.execute();
		d.slideShow();
		
	}
}
