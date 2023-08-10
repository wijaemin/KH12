<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<h2>게시글 상세조회</h2>


<table border="1">
	<tr>
		<th>게시글 번호</th>
		<th>게시글 작성자</th>
		<th>게시글 이름</th>
		<th>게시글 내용</th>
		<th>게시글 조회수</th>
		<th>게시글 좋아요</th>
		<th>게시글 댓글수</th>
		<th>게시글 작성일</th>
		<th>게시글 수정일</th>
	</tr>

		<tr>
			<td>${boardDto.board_no}</td>
			<td>${boardDto.board_writer}</td>
			<td>${boardDto.board_title}</td>
			<td>${boardDto.board_content}</td>
			<td>${boardDto.board_readcount}</td>
			<td>${boardDto.board_likecount}</td>
			<td>${boardDto.board_replycount}</td>
			<td>${boardDto.board_ctime}</td>
			<td>${boardDto.board_utime}</td>
		</tr>

</table><br><br>
<a href="edit?board_no=${boardDto.board_no}">게시글 수정하기</a><br><br>
<a href="list">게시글 돌아가기</a><br><br>
<a href="delete">게시글 삭제하기</a><br><br>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>