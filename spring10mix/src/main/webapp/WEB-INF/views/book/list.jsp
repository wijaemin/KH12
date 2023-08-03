<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 리스트</title>
</head>
<style>
th{background-color: #058f50}
td{text-align: center;}</style>
<body>
<h1 align="center">책 리스트</h1><br>
<h2 align="right"><a href="insert" ><font size="250">신규등록</font></a></h2><br>
<table border="2" align="center">
<tr>
<th>책 번호</th>
<th>책 페이지수</th>
<th>책 이름</th>
<th>책 작가</th>
<th>책 출판일</th>
<th>책 장르</th>
<th>책 출판사</th>
<th>책 가격</th>
<th>삭제</th>
</tr>
<c:forEach var="dto" items="${list}">
<tr>
<td>No.${dto.bookID}</td>
<td>${dto.bookPageCount} Page</td>
<td><a href="detail?no=${dto.bookID}" title="누르면 클릭됩니다.">${dto.bookTitle}</a></td>
<td>${dto.bookAuthor}</td>
<td>${dto.bookPublicationDate}</td>
<td>${dto.bookGenre}</td>
<td>${dto.bookPublisher}</td>
<td>${dto.bookPrice} 달러</td>
<td><a href="delete?bookID=${dto.bookID}">삭제</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>