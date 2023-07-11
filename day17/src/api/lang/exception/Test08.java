package api.lang.exception;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
// 예외를 처리하다보니 발생하는 문제점을 추가적으로 해결
		// 1. 예외 처리하기전 메세지를 보고싶어요
		// 해결방법) e.printStackTrace();
		// -> 개발 완료후 삭제하거나 다른 코드로 치환

		// 2. 예외 처리중 발생하는 경고를 없애고 싶어요
		//->finally 구문으로 해결 가능
		// -> 반드시 정리해야하는 자원에 대한 코드를 작성
		// 너무 복잡하고 Scanner를 try에서만 쓰는데 try 밖에서 만들어야 함
		// try ~resource 구문 사용
		// -> try종료 시 내부에서 만든 도구는 자동으로 close 됨
	try(	Scanner sc = new Scanner(System.in);)
	 {

			System.out.println("금액 : ");
			int money = sc.nextInt();
			if (money < 0) { // 자바가 인지하지 못하는 문제 상황
				Exception ex = new Exception("금액이 음수 일수 없습니다.");
				throw ex; // 쓰로우를 이용하면 실행을 중지하고 캐치 블록으로 이동한다.
			}
			System.out.println("인원 : ");
			int people = sc.nextInt();
			if (people < 0) {// 자바가 인지하지 못하는 문제 상황
				throw new Exception("인원은 음수일수 없습니다.");
			}


			int price = money / people; // 1인당 금액
			int remain = money % people; // 자투리 금액

			System.out.println("1인당 내야할 금액은 ?" + price + "원 입니다.");
			System.out.println(remain + "원은 저희가 지원해 드려요");
		} catch (Exception e) {
			e.printStackTrace();// 예외 처리 안한것처럼 스택 추적 결과를 출력

			if (e.getMessage() == null) {
				System.err.println("오류 발생");
			} else {
				System.err.println(e);
			}
		}
		finally { //플랜 A/B 중 어느것이 실행되더라도 마지막에 반드시 실행되는 구문(선택)
		}

	}
}
