package com.kh.spring08.DTO;

import java.sql.Date;

public class MemberDTO {
	String memberID, memberPW, memberNickname, memberContact, memberLevel, memberBrith, memberEmail;

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberID() {
		return memberID;
	}

	public MemberDTO() {
		super();
	}

	@Override
	public String toString() {
		return "memberDTO [memberID=" + memberID + ", memberPW=" + memberPW + ", memberNickname=" + memberNickname
				+ ", memberContact=" + memberContact + ", memberLevel=" + memberLevel + ", memberBrith=" + memberBrith
				+ ", memberEmail=" + memberEmail + ", memberPoint=" + memberPoint + ", memberJon=" + memberJon + "]";
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getMemberContact() {
		return memberContact;
	}

	public void setMemberContact(String memberContact) {
		this.memberContact = memberContact;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getMemberBrith() {
		return memberBrith;
	}

	public void setMemberBrith(String memberBrith) {
		this.memberBrith = memberBrith;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}

	public Date getMemberJon() {
		return memberJon;
	}

	public void setMemberJon(Date memberJon) {
		this.memberJon = memberJon;
	}

	int memberPoint;
	Date memberJon;

}
