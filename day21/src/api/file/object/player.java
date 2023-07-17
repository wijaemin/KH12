package api.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class player implements Serializable {
	private String ID;
	private int level, gold;

	public player(String iD, int level, int gold) {
		this.setID(iD);
		this.setLevel(level);
		this.setGold(gold);
	}

	public player(String iD) {
		this.setID(iD);
		this.setLevel(level);
		this.setGold(gold);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level == 0) {
			this.level = 1;
		} else if (level < 0) {
			return;
		} else {
			this.level = level;
		}

	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		if (gold < 0) {
			return;
		} else {
			this.gold = gold;
		}
	}

	public void show() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임시작");
		System.out.println("아이디를 입력해주세요 : ");
		String name = sc.next();
		while (true) {
			System.out.println("========");
			System.out.println("입력1(정보)");
			System.out.println("입력2(레벨업)");
			System.out.println("입력3(종료)");
			int num = sc.nextInt();
			if (num == 1) {
				this.ID = name;
				System.out.println("아이디 : " + this.ID);
				System.out.println("레벨 : " + this.level);
				System.out.println("소지금 : " + this.gold);
			} else if (num == 2) {
				System.out.println("레벨이 1증가 하였습니다.");
				this.level++;
			} else {
				List<Object> game = List.of(this.ID, this.level, this.gold);
				File target = new File("sample/player.kh");
				FileOutputStream stream = new FileOutputStream(target);
				BufferedOutputStream buffer = new BufferedOutputStream(stream);
				ObjectOutputStream obj = new ObjectOutputStream(buffer);
				obj.writeObject(game);
				obj.close();

				System.out.println("정보를 저장하였습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public void show2() throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		File target = new File("sample/player.kh");
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream obj = new ObjectInputStream(buffer);
		List<Object> a = (List<Object>) obj.readObject();
		System.out.println("정보");
		System.out.println("아이디를 입력해주세요 : ");
		String name = sc.next();
		this.ID = name;
	//	System.out.println("아이디 : " + this.ID);
	//	System.out.println("레벨 : " + a.get(level));
	//	System.out.println("소지금 : " + a.get(gold));
		while (true) {
			System.out.println("========");
			System.out.println("입력1(정보)");
			System.out.println("입력2(레벨업)");
			System.out.println("입력3(종료)");
			int num = sc.nextInt();
			if (num == 1) {
				this.ID = name;
				System.out.println("아이디 : " + this.ID);
				System.out.println("레벨 : " + this.level);
				System.out.println("소지금 : " + this.gold);
			} else if (num == 2) {
				System.out.println("레벨이 1증가 하였습니다.");
				this.level++;
			} else {
				List<Object> game = List.of(this.ID, this.level, this.gold);
				File target1 = new File("sample/player.kh");
				FileOutputStream stream1 = new FileOutputStream(target1);
				BufferedOutputStream buffer1 = new BufferedOutputStream(stream1);
				ObjectOutputStream obj1 = new ObjectOutputStream(buffer1);
				obj1.writeObject(game);
				obj1.close();

				System.out.println("정보를 저장하였습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;

			}
		}
	}
}
