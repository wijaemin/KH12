package api.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		List<String> men = new ArrayList<>();
		List<String> women = new ArrayList<>();

		men.add("범죄도시3");
		men.add("늑대사냥");
		men.add("드림");
		men.add("퍼펙트게임");
		women.add("파수꾼");
		women.add("늑대사냥");
		women.add("리바운드");
		women.add("익스트렉션2");
		women.add("드림");

		Set<String> menSolo = new TreeSet<>();
		menSolo.addAll(men);
		menSolo.removeAll(women);
		System.out.println("철수만 본 영화" + menSolo);

		Set<String> womeSole = new TreeSet<>();
		womeSole.addAll(women);
		womeSole.removeAll(men);
		System.out.println("영희만 본 영화" + womeSole);

		Set<String> both = new TreeSet<>();
		both.addAll(men);
		both.retainAll(women);
		System.out.println("둘다 같이본 영화" + both);
		
		Set<String> one = new TreeSet<String>();
		one.addAll(menSolo);
		one.addAll(womeSole);
		System.out.println(one);
	}
}
