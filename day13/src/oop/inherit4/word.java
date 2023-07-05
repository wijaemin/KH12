package oop.inherit4;

public class word extends exe {
	private int pagesize;

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public void execute() {
		System.out.println("실행 기능");
	}
}
