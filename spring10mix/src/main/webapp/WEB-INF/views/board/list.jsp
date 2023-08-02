<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 리스트</title>
</head>
<style>
td{text-align: center;}</style>
<body>
<h1 align="center">게시글 리스트</h1>

<table border="2">
<tr>
<th>게시글 번호</th>
<th>게시글 제목</th>
<th>게시글 작가</th>
<th>게시글 내용</th>
<th>읽은 횟수</th>
<th>게시글 상세보기</th>
</tr>
<c:forEach var="dto" items="${list}">
<tr>
<td>${dto.board_no}</td>
<td>${dto.board_title}</td>
<td>${dto.board_writer}</td>
<td>${dto.board_content}</td>
<td>${dto.board_readcount}</td>
<td><a href="detail?no=${dto.board_no}">상세 확인</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>