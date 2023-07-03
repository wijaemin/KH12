package oop.constructor3;

public class game {
	private static final int String = 0;
	String id, job;
	int level;

	game(String id, String job, int level) {
		this.getId();
		this.setJob(job);
		this.setLevel(level);
	}

	game(String id, String job) {
		this.id = id;
		this.id = job;
	}
String getId() {return id;}
String getJob() {return job;}

	
	void show() {
		System.out.println("<<게임 케릭터 정보>>");
		System.out.println("아이디 : " + this.id);
		System.out.println("직업 : " + this.job);
		System.out.println("레벨 : " + this.level);
		System.out.println("");
	}

	void setLevel(int level) {
		if (level >= 1) {
			this.level = level;
		} else if (level == 0) {
			this.level = 1;
		}
	}

	void setJob(String job) {
		switch (job) {
		case "전사":
		case "마법사":
		case "궁수":
			this.job = job;
		}
	}
}
