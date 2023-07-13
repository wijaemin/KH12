package api.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		// 다른 저장소를 이용하여 생성
		// 데이터가 정해져 있는 경우 불변리스트 생성(자바 8 이상)
		// List<Integer> list = Arrays.asList(10, 10 , 20, 30);

		// 자바 9이상
		List<Integer> list = List.of(10, 10, 20, 30);

		// 리스트에 들어있는 데이터를 중복제거 하고 나열
		Set<Integer> set = new TreeSet<>(list);
		System.out.println("set = " + set);

		// set을 이용한 집합 연산
		Set<Integer> a = Set.of(30, 50, 20);
		Set<Integer> b = Set.of(30, 20, 40, 10);

		// 합집합(Union)
		// =중복을 제거할건지 제거하지 않을건지
		// 중복을 제거할것이면 set, 중복을 제거하지 않을경우 list
		Set<Integer> union1 = new TreeSet<Integer>();
		union1.addAll(a);
		union1.addAll(b);
		System.out.println("합집합(중복제거) : " + union1);

		// 중복 허용
		List<Integer> union2 = new ArrayList<>();
		union2.addAll(a);
		union2.addAll(b);
		union2.sort(null);
		System.out.println("합집합(중복허용) : " + union2);

		// 교집합(Intersection)
		// 두집합이 모두가진 요소들만으로 이루어진 집합

		Set<Integer> inter = new TreeSet<Integer>();
		inter.addAll(a);
		inter.retainAll(b);
		System.out.println("교집합 : " + inter);

// 차집합(minus / except)
		Set<Integer> minus = new TreeSet<Integer>();
		minus.addAll(a);
		minus.removeAll(b); // 겹치는걸 지워라
		System.out.println("차집합 : " + minus);
		
		
		
	}
}
