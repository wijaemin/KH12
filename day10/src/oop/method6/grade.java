package oop.method6;

public class grade {
	int schoolYear, schoolClass, korean, engilsh, math;
	String name;

	void setup(int schoolYear, int schoolClass, String name, int korean, int engilsh, int math) {
		this.schoolYear = schoolYear;
		this.schoolClass = schoolClass;
		this.name = name;
		this.korean = korean;
		this.engilsh = engilsh;
		this.math = math;
	}

	int getTotal() {
		return this.math + this.korean + this.engilsh;
	}

	float getAver() {
		return (this.math + this.korean + this.engilsh) / 3;
	}

	Boolean getPass() {
		return this.korean >= 40 && this.engilsh >= 40 && 
				this.math >= 40 && this.getAver() >= 60;
	}

	void show() {
		System.out.print(this.schoolYear + " 학년 ");
		System.out.println(this.schoolClass + " 반");
		System.out.println("이름 : " + this.name);
		System.out.print("국어 : " + this.korean + "점	");
		System.out.print("영어 : " + this.engilsh + "점	");
		System.out.println("수학 : " + this.math + "점");
		System.out.println("총점 : " + this.getTotal() + "점");
		System.out.println("평균 : " + this.getAver() + "점");
		if (this.getPass()) {
			System.out.println("통과 입니다.");
		} else {
			System.out.println("재평가입니다.");
		}
		System.out.println("---------------------------------");
	}

}
