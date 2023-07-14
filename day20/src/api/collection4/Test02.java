package api.collection4;

import java.util.LinkedList;
import java.util.Queue;

public class Test02 {
	public static void main(String[] ages) {
	//큐(Queue)
		//대기열을 구현할떄 사용하는 저장소
		//List<String> list = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		
		// 추가 -> offer
		queue.offer("홍길동");
		queue.offer("임꺽정");
		queue.offer("허준");
		queue.offer("장보고");
				//확인
		System.out.println(queue.peek());
		
		//추출 -poll
		queue.poll();

		
		//결과
		System.out.println(queue);
		
		
	}
	
}
