package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> card = new ArrayList<String>();
		ArrayList<String> num = new ArrayList<String>();
		card.add("하트");
		card.add("다이아");
		card.add("스페이스");
		card.add("클로버");

		num.add("2");
		num.add("3");
		num.add("4");
		num.add("5");
		num.add("6");
		num.add("7");
		num.add("8");
		num.add("9");
		num.add("10");

		num.add("A");
		num.add("J");
		num.add("Q");
		num.add("K");
		
		

	 System.out.println("몇명이서 플레이 하실겁니까 ? ");
	 int people = sc.nextInt();
	 System.out.println("명");
	 for(int i = 0; i<people; i++) {	 
		 Collections.shuffle(card);
	 Collections.shuffle(num);
		 List <String> total = card.subList(0, i);
		 List <String> total2 = num.subList(0, i);
		 Boolean one = card.get(i) ==card.get(i+1) ||card.get(i) ==card.get(i+2) || card.get(i+1) ==card.get(i+2);
		 Boolean one1 = num.get(i) ==num.get(i+1) ||num.get(i) ==num.get(i+2) || num.get(i+1) ==num.get(i+2);
		 System.out.println(i+1+"번 플레이어     " + card.get(i)+"/"+num.get(i)+"			"+ card.get(i+1)+"/"+num.get(i+1)+"			"+ card.get(i+2)+"/"+num.get(i+2));
	if (one || one1) {
		System.out.println(i+1+"번 플레이어   원페어 입니다.");
	}
	if (one && one1) {
		System.out.println(i+1+"번 플레이어   투페어 입니다.");
	}
	 }
	 
	 
	}

}
