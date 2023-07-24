package jdbc.dto;

import java.sql.Date;

public class ProductDto {
	// 필드는 조회결과와 동일하게 구현
	private int no, price;
	private String name, type;
	private Date made;
	private Date expire;
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	public ProductDto() {
		super();
	}
	@Override
	public String toString() {
		return "ProductDto [no=" + no + ", price=" + price + ", name=" + name + ", type=" + type + ", made=" + made
				+ ", expire=" + expire + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public Date getMade() {
		return made;
	}
	public void setMade(Date made) {
		this.made = made;
	}


}
