<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h2>게시글 목록</h2>


<table border="1">
	<tr>
		<th>게시글 번호</th>
		<th>게시글 작성자</th>
		<th>게시글 이름</th>
		<th>게시글 조회수</th>
		<th>게시글 좋아요</th>
		<th>게시글 댓글수</th>
		<th>게시글 작성일</th>
		<th>게시글 수정일</th>
	</tr>
	<c:forEach var="boardDto" items="${list}">
	<tr>
		<td>${boardDto.board_no}</td>
		<td>${boardDto.board_writer}</td>
		<td><a href="detail?board_no=${boardDto.board_no}">${boardDto.board_title}</a></td>
		<td>${boardDto.board_readcount}</td>
		<td>${boardDto.board_likecount}</td>
		<td>${boardDto.board_replycount}</td>
		<td>${boardDto.board_ctime}</td>
		<td>${boardDto.board_utime}</td>
	</tr>
	</c:forEach>
</table>
<a href="write">게시글 등록하기</a>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>