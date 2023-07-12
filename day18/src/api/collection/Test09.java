package api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test09 {
public static void main(String [] args) {
	// ArraayList 말고 다른 List의 종류
	//-ArraayList는 데이터가 배열 형태로 존재하는 리스트
	//-ArraayList는 조회성능이 우수함 대신 데이터 구조변경에 취약함
	// 
	//-LinkedList는 데이터가 연결 형태로 존재하는 리스트
	//-LinkedList는 조회성능이 다소 떨어짐대신 데이터 구조변경에 강함
	
	
	List<String> a= new ArrayList<String>();
	List< String> b =new LinkedList<String>();
	
}
}
