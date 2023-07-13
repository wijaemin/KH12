package api.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
// 비선형 구조

		//Set
		// 중복이 발생할수 없는 구조
		// 트리구조면 TreeSet, 해시 구조면 HashSet
		Set<Integer> a= new TreeSet<Integer>();
		HashSet<Integer> b =new HashSet<Integer>();
		
		// 추가
		a.add(30); b.add(30);
		a.add(50); b.add(50);
		a.add(20); b.add(20);
		a.add(10); b.add(10);
		a.add(40); b.add(40);
		System.out.println(		a.contains(40)); //찾기
		System.out.println(		b.contains(40));
		b.remove(50); //삭제
		//get()은 없다. set에는 인덱스의 개념이 없다
		System.out.println("a = " +a);
		System.out.println(a.size());
		System.out.println("b = " +b);
		System.out.println(b.size());
		
		
	}
}
