package com.kh.spring15.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

	String book_title,book_author,book_publication_date,book_publisher,book_genre;
	int book_id, book_price, book_page_count;
}
