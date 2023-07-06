package api.lang.test1;

public class Test01 {
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer(10);
		StringBuffer b = new StringBuffer("hello");

		System.out.println(a.append("KH정보교육원"));
		System.out.println(a.toString());
		System.out.println(a.length());
		System.out.println(a.capacity());
		System.out.println("");
		System.out.println(b.append("hello"));
		System.out.println(b.capacity());
		System.out.println(b.reverse());
	}

}
