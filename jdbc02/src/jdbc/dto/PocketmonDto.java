package jdbc.dto;

//DTO클래스
// Data Transfer Object. 데이터 변환용 객체(포장상자)
// 데이터베이스의 한줄을 그대로 옮겨닯기 위한 자바 Wraapper포장 클래스
public class PocketmonDto {
//필드는 데이터베이스의 컬럼과 동일하게 작성
	private int no;
	private String name;
	private String type;
	public PocketmonDto() {
	}
	public PocketmonDto(int no, String name, String type) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
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
	@Override
	public String toString() {
		return "PocketmonDto [no=" + no + ", name=" + name + ", type=" + type + "]";
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
	
	//기본생성자의 세터와 게터매소들르 추가,
	//toString()재정의
	
}
