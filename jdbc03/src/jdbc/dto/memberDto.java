package jdbc.dto;

import java.sql.Date;

public class memberDto {
private int  member_contact, member_point;
private String member_pw, member_id, member_nickname, member_email,member_level;
private Date member_join, member_brith;
public int getMember_contact() {
	return member_contact;
}
public void setMember_contact(int member_contact) {
	this.member_contact = member_contact;
}
public int getMember_point() {
	return member_point;
}
public void setMember_point(int member_point) {
	this.member_point = member_point;
}
public String getMember_pw() {
	return member_pw;
}
public void setMember_pw(String member_pw) {
	this.member_pw = member_pw;
}
public String getMember_id() {
	return member_id;
}
public void setMember_id(String member_id) {
	this.member_id = member_id;
}
public String getMember_nickname() {
	return member_nickname;
}
public void setMember_nickname(String member_nickname) {
	this.member_nickname = member_nickname;
}
public String getMember_email() {
	return member_email;
}
public void setMember_email(String member_email) {
	this.member_email = member_email;
}
public String getMember_level() {
	return member_level;
}
public void setMember_level(String member_level) {
	this.member_level = member_level;
}
public Date getMember_join() {
	return member_join;
}
public void setMember_join(Date member_join) {
	this.member_join = member_join;
}
public Date getMember_brith() {
	return member_brith;
}
public void setMember_brith(Date member_brith) {
	this.member_brith = member_brith;
}
@Override
public String toString() {
	return "memberDto [member_contact=" + member_contact + ", member_point=" + member_point + ", member_pw=" + member_pw
			+ ", member_id=" + member_id + ", member_nickname=" + member_nickname + ", member_email=" + member_email
			+ ", member_level=" + member_level + ", member_join=" + member_join + ", member_brith=" + member_brith
			+ "]";
}
public memberDto() {
	super();
}
}
