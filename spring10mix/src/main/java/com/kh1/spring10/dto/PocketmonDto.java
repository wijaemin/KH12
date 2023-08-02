package com.kh1.spring10.dto;

import lombok.Data;

import lombok.NoArgsConstructor;


@Data//@Setter+@Getter+ @EqualsAndHashCode+ @ToString
//@Setter @Getter @NoArgsConstructor @ToString
@NoArgsConstructor 
public class PocketmonDto {
private int no;
private String name;
private String type;
}
