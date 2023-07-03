package oop.getter2;

public class score {
String name;
int sYear, korean, english, math;

void setup(String name, int sYear, int korean, int english, int math) {
	this.name =name;
	this.sYear =sYear;
	this.setNum(korean, english, math);
	}
int getSum () {return (this.english+this.korean+this.math);}
float getAver () {return(float) (this.english+this.korean+this.math)/3;}

void show () {
	System.out.println("==================");
	System.out.println("이름 : "+ this.name);
	System.out.println("학년 : "+ this.sYear);
	System.out.print("국어 : "+ this.korean+" 점");
if(this.korean>=90) {System.out.println(" 등급 : A");}
else if(this.korean>=80) {System.out.println(" 등급 : B");}
else if(this.korean>=70) {System.out.println(" 등급 : C");}
else {System.out.println(" 등급 : F");}
	System.out.print("영어 : "+ this.english+" 점");
	if(this.english>=90) {System.out.println(" 등급 : A");}
	else if(this.english>=80) {System.out.println(" 등급 : B");}
	else if(this.english>=70) {System.out.println(" 등급 : C");}
	else {System.out.println(" 등급 : F");}
	System.out.print("수학 : "+ this.math+" 점");
	if(this.math>=90) {System.out.println(" 등급 : A");}
	else if(this.math>=80) {System.out.println(" 등급 : B");}
	else if(this.math>=70) {System.out.println(" 등급 : C");}
	else {System.out.println(" 등급 : F");}
	System.out.println("총점 : "+getSum()+" 점");
	System.out.println("평균 : " +getAver()+" 점");
}
void setNum(int korean , int english, int math) {
	if(this.korean>=0 && this.korean<=100 &&
			this.english>=0 && this.english<=100 &&
			this.math>=0 && this.math<=100) {
		this.korean = korean;
		this.english=english;
		this.math=math;
	}
}
}
