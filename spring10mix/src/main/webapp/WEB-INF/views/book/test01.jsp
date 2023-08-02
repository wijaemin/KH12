<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.bookID}번책책 상세조회</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1  align="center">${dto.bookID}번 책 상세조회</h1>
			<table align="center" border="2" width="800" >
				<tr>
					<th>제목</th>
					<th>작가</th>
					<th>출판사</th>
					<th>가격</th>
				</tr>
				<tr>
					<th>${dto.bookTitle}</th>
					<th>${dto.bookAuthor}</th>
					<th>${dto.bookPublisher}</th>
					<th>${dto.bookPrice}달러</th>

				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h1>없어요 다시해줘여</h1>
			<img src="http://www.naver.com">
		</c:otherwise>
	</c:choose>
</body>
</html>