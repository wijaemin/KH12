package api.lang.string2;

public  class  Member {
protected String memberld, memberName, memberlevel;
protected String memberPw;
protected int memberPoint;

Member(String memberld,String memberPw,
		String memberName ,String memberlevel,int memberPoint) {
	this.memberld =memberld;
	this.memberPw =memberPw;
	this.memberName =memberName;
	this.setMemberlevel(memberlevel);
	this.setMemberPoint(memberPoint);
}
public int getMemberPoint() {
	return memberPoint;
}
public void setMemberPoint(int memberPoint) {
	if(memberPoint >0) {
	this.memberPoint =memberPoint ;}
	else {this.memberPoint =100 ;}
}
public String getMemberlevel() {
	return memberlevel;
}
public void setMemberlevel(String memberlevel) {
	if(memberlevel.equals("관리자") || memberlevel.equals("우수회원")) {
	this.memberlevel = memberlevel;}
	else if( memberlevel !="관리자" || memberlevel !="우수회원") {
		this.memberlevel = "일반회원";
	}
}
String[] s= {"","*","**","***","****","*****"};
void show () {
	System.out.println("ID : "+memberld);
	for(int i =1; i<memberPw.length();i++) {
		memberPw.concat(memberName);
		System.out.println("비밀번호 :  "+memberPw);
	}
	System.out.println("회원이름  : "+memberName);
	System.out.println("회원레벨 :  "+memberlevel);
	System.out.println("회원 포인트 :  "+memberPoint);
}
}
