package com.kh1.springhome.vo;

import lombok.Data;

//VO(Value Object)
// - 내입맛대로 데이터를 모아서 저장하는 클래스(DB무관)
// - 등록하지 않고 필요할때 마다 만들어서 사용
@Data
public class PaginationVo {
 private String type, keyword;// 검색 분류 및 키워드
 private int page =1; //현재 페이지 번호(기본 : 1)
 private int size = 10;// 보여줄 게시판 글수(기본 : 10)
 
 private int count ; // 전체 글수 (다른 클래스에서 가져와야한다.)
 
 private int navigatorSize = 10; //하단 네이게이터 표시 갯수(기본 : 10)
 
 public boolean isSearch() {
	 return type != null && keyword != null;
 }
 
}
