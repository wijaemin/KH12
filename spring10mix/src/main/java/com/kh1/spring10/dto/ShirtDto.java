package com.kh1.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShirtDto {

	private int shirt_no, shirt_price, shirt_stock;
	private String shirt_name, shirt_color, shirt_kind, shirt_type;
	private String shirt_material;
}
