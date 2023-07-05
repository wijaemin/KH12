package oop.inherit4;

public class exe {
	private String filename;
	private long filesize;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public 	void execute() {
		System.out.println("실행 기능");
	}

	public 	void forward() {
		System.out.println("빨리감기");
	}

}
