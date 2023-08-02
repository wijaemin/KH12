package com.kh1.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDTO {
	private int bookID,bookPageCount;
	private String bookTitle,bookAuthor,bookPublicationDate, bookGenre,bookPublisher;
	private double bookPrice;
}
