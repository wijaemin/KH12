<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
td{ background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 30px;
}
</style>

<h1 align="center">관리자 페이지</h1>

<button style="background-color: #778cb9" ><h3><a href="member/list?size=20">회원 관리</a></h3></button><br><br>
<button style="background-color: #778cb9" ><h3><a href="#">회원 통계</a></h3></button><br><br>
<button style="background-color: #778cb9" ><h3><a href="#">게시글 통계</a></h3></button><br><br>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>