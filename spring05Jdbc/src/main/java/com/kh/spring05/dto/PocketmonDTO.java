package com.kh.spring05.dto;

//POJO 클래스
// Plain Old Java Object
// 스프링에 등록하지 않아도 됨
public class PocketmonDTO {
private 	int no;
private 	String name, type;
public PocketmonDTO() {
	super();
}
@Override
public String toString() {
	return "PocketmonDTO [no=" + no + ", name=" + name + ", type=" + type + "]";
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
