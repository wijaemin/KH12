<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 130px;
}
</style>
<c:choose>
<c:when test="${isReply}">
<h2>답글 작성</h2>
</c:when>
<c:otherwise><h2>게시글 작성</h2>
</c:otherwise></c:choose>


<form action="write"method="post" autocomplete="off">
<h1 align="right"><button style="background-color: graytext;">게시글 저장</button></h1><br>
<%--답글일떄만 추가적인 정보를 전송 --%>
<c:if test="${isReply}">
<input name="board_parent" type="hidden" value="${orginDto.board_no}">
</c:if>
<c:choose>
<c:when test="${isReply }">
게시글 제목 : <input style="background-color: graytext;" name="board_title" type="text" required value="RE : ${orginDto.board_title}"><br><br>
</c:when>
<c:otherwise>
게시글 제목 : <input style="background-color: graytext;" name="board_title" type="text" required ><br><br>
</c:otherwise>
</c:choose>
게시글 내용 : <br><br><textarea style="background-color: graytext;" name="board_content" cols="100" rows="30" required >
</textarea><br>

</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>