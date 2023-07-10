package api.lang.string3;

public class Test01 {
	public static void main(String[] ages) {
// 문자열 합성
		// 원하는 문자열을 만들기 위해 지속적인 결을 하는 작업
//문자열 덧셈은 성능이 매우 안좋으면 이유는 문자열이 불변이기 때문이다.
		// 해결방법 덧셈용 도구를 사용하면된다(String buffer)
		String line = "이런 신발끈 개나리 진달래같은!!!";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("(").append("신발끈").append("|").append("개나리").append(")");
		String regex1 = buffer.toString();
		System.out.println(line.replaceAll(regex1, "***"));


		line.replaceAll("(신발끈|개나리)", "***");
		System.out.println(line.replaceAll("(신발끈|개나리)", "***"));
		System.out.println(line);

		String regex = "";
		regex += "(";
		regex += "신발끈";
		regex += "|";
		regex += "개나리";
		regex += ")";
		System.out.println(line.replaceAll(regex, "***"));

	}
}
