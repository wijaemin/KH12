<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td {
	text-align: center;
	background-color: silver;
}

th {
	text-align: center;
	background-color: graytext;
}

body {
	background-color: #778ca3;
	padding-left: 100px;
	padding-top: 30px;
}
</style>

<h2>게시글 상세조회</h2>
<div align="right">
	<%-- 회원일경우 글쓰기,수정,삭제이 나와야한다 --%>
	<c:if test="${sessionScope.name != null}">
		<button style="background-color: #7700c9">
			<a href="updateLike?board_no=${boardDto.board_no}"><font
				color="ffffff" size="18">Like</font></a>
		</button>
		<button style="background-color: #778cb9">
			<a href="list">게시글 목록</a>
		</button>
	
	<%-- 수정 삭제는 소유자일경우에만 나와야한다. --%>
	<c:if test="${sessionScope.name == boardDto.board_writer}">
		<button style="background-color: #778cb9">
			<a href="edit?board_no=${boardDto.board_no}">게시글 수정</a>
		</button>
		<button style="background-color: #778cb9">
			<a href="delete?board_no=${boardDto.board_no}">게시글 삭제</a>
		</button>
	</c:if></c:if>
</div>
<h3>게시글 정보</h3>
<br>
<table border="1" style="background-color: black;">
	<tr>
		<th>게시글 번호</th>
		<th>게시글 작성자</th>
		<th>게시글 이름</th>
	</tr>

	<tr>
		<td>${boardDto.board_no}</td>
		<td>${boardDto.getBoardWriterString()}
		<%-- 탈퇴한 사용자가 아닐경우 옆에 닉네임을 추가로 출력 --%>
		<c:if test="${writerDto !=null }">
		닉네임(${writerDto.memberNickname})</c:if>
		</td>
		<td>${boardDto.board_title}</td>

	</tr>


</table>
<br>
<h3>게시글 기타정보</h3>
<br>
<table border="1" style="background-color: black;" width="900">
	<tr>
		<th>게시글 조회수</th>
		<th>게시글 좋아요</th>
		<th>게시글 댓글수</th>
		<th>게시글 작성일</th>
		<th>게시글 수정일</th>
	</tr>
	<tr>
		<td>${boardDto.board_readcount}</td>
		<td>${boardDto.board_likecount}</td>
		<td>${boardDto.board_replycount}</td>
		<td><fmt:formatDate value="${boardDto.board_ctime}"
				pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
		<td><fmt:formatDate value="${boardDto.board_utime}"
				pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
	</tr>
</table>

<h3>내용</h3>
<table border="1" style="background-color: black;" width="700">
	<tr>
		<th>게시글 내용</th>
	</tr>
	<tr>
		<td>${boardDto.board_content}</td>
	</tr>

</table>
<br>

<form>
	<h3>댓글</h3>
	<textarea cols="100" rows="5" style="background-color: graytext"></textarea>
	<br>
	<button style="background-color: graytext">저장</button>
</form>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>