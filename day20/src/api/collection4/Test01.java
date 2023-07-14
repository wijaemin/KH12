package api.collection4;

import java.util.Stack;

public class Test01 {
public static void main(String []ages) {
	// 이용방법이 정해져 있는 저장소
	
	Stack<String> stack = new Stack<String>();
	
	
	//추가
	stack.push("구글");
	stack.push("네이버");
	stack.push("카카오");
	stack.push("KH정보교육원");
	//확인
	System.out.println(stack.peek());//지금 가장 최신데이터가 뭐냐?
	System.out.println(stack.pop()); //가장 최신 데이터 삭제
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
	System.out.println(stack);
	
	
}
}
