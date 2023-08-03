<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 수정</title>
</head>
<body>
<h1>책 수정</h1>
	<form action="edit?bookID=${dto.bookID}" method="post">
<input required="required" name="bookID" min="0"
			value="${dto.bookID}" type="hidden"><br>
		<br> 책 이름 : <input required="required" name="bookTitle"
		 value="${dto.bookTitle}"><br>
		<br> 책 작가 : <input required="required" name="bookAuthor"
			 value="${dto.bookAuthor}"><br>
		<br> 책 출판일 : <input required="required" type="date"
			name="bookPublicationDate"  value="${dto.bookPublicationDate}"><br>
		<br> 책 가격 : <input required="required" type="number"
			name="bookPrice" min="0" placeholder="소수점입력 0.00까지 가능" 
			 value="${dto.bookPrice}"step="0.01"><br>
		<br> 책 출판사 : <input required="required" name="bookPublisher"
		 value="${dto.bookPublisher}"><br>
		<br> 책 장르 : <input required="required" name="bookGenre"
		 value="${dto.bookGenre}"><br>
		<br> 책 페이지 수 : <input required="required" type="number"
			name="bookPageCount" min="0"
			 value="${dto.bookPageCount}"><br>
		<br>
		<button>수정</button>
	</form>

</body>
</html>