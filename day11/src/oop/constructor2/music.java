package oop.constructor2;

public class music {
	String name, singer, album;
	int up, play;

	music(String name, String singer, String album, int play, int up) {
		this.name = name;
		this.singer = singer;
		this.album = album;
		this.setUpAndPlay(play, up);
	}

	int rank() {
		return ((this.play * 2) + (this.up * 2))/2;
	}

	void getUp() {
		if (this.up > 100000) {
			System.out.println("(인기곡)");
			return;
		}
	}

	void getPlay() {
		if (this.play > 100000) {
			System.out.println("(베스트)");
		}
		return;
	}

	void show() {
		System.out.println("==============");
		
		System.out.println("");
		
		System.out.print("제목 : "+ this.name);
		getPlay();
		getUp();
		System.out.println("");
		System.out.println("가수 : " + this.singer);
		System.out.println("앨범 : " + this.album);
		System.out.println("재생수 : " + this.play+" 회");
		System.out.println("좋아요 수 : " + this.up);
		System.out.println("랭킹 점수 : "+rank()+" 점");
	}

	void setUpAndPlay(int play, int up) {
		if (up > 0 && play > 0)
			this.play = play;
		this.up = up;
		return;
	}
}
