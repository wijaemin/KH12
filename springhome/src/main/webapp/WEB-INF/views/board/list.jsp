<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>게시글 목록</h2>
<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 30px;
}
</style>
<%--검색일 경우 검색어를 추가로 출력 --%><c:if test="${param.keyword !=null} && ${param.type == 'board_writer'}">
<h3>게시판 아이디 &quot;${param.keyword}&quot;에 대한 검색 결과</h3>
</c:if>
<c:if test="${param.keyword !=null}">
<h3>${param.type} &quot;${param.keyword}&quot;에 대한 검색 결과</h3>
</c:if>

<%--글쓰기는 로그인 상태일경우 출력 --%>
<c:if test="${sessionScope.name != null}"> 
<div align="right">
<button style="background-color: #778cb9" ><h3><a href="write" >게시글 등록</a></h3></button>

</div></c:if><br><br>
<div align="center">
<table border="1" style="background-color: black;" >
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
	<c:forEach var="boardDto" items="${list}"><tr>
		<td>${boardDto.board_no}</td>
	<%-- 방법1 Dto에서 만들어서 처리(효율적)--%>
	<td>${boardDto.getBoardWriterString()}</td>


<%--  방법2 sql구문에서 처리

	
		
		<c:choose>
		<c:when test="${boardDto.board_writer != null}">
		<td>${boardDto.board_writer}</td>
		</c:when>
		<c:otherwise>
		<td>탈퇴한 사용자</td>
		</c:otherwise>
		</c:choose>
		--%>
		
		<!-- 댓글이 있다면 개수를 표시 -->
		<c:if test="${boardDto.board_replycount > 0}">
				[${boardDto.board_replycount}]
				</c:if>
		<td><a href="detail?board_no=${boardDto.board_no}">${boardDto.board_title}</a></td>
		<td>${boardDto.board_readcount}</td>
		<td>${boardDto.board_likecount}</td>
		<td>${boardDto.board_replycount}</td>
		<td>${boardDto.boardCtimeString}</td>
		<td><fmt:formatDate value="${boardDto.board_utime}" pattern="yyyy/MM/dd hh:mm:ss" /></td>
	</tr>
	</c:forEach>
</table>

</div>
<br><br>
<div align="center">
<form style="background-color: #778ca3" action="list" method="get">

<c:choose>
<c:when test="${param.type == 'board_writer'}"> 
<select name="type" style="background-color: #578ca3" required="required">
<option value="board_title" >제목</option>
<option value="board_writer" selected="selected">작성자</option>
</select>
</c:when>
<c:otherwise>
<select name="type" style="background-color: #578ca3" required="required">
<option value="board_title" selected="selected" >제목</option>
<option value="board_writer">작성자</option>
</select>
</c:otherwise>
</c:choose>



<input type="search" name="keyword" required="required" style="background-color: #578ca3" placeholder="검색하실 이름을 입력해주세요" value="${param.keyword }"> <button style="color: #778ca3">검색</button>
</form></div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>