<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 130px;
}
</style>
<h2>게시글 작성</h2>

<form action="write"method="post" autocomplete="off">

<h1 align="right"><button style="background-color: graytext;">게시글 저장</button></h1><br>
게시글 제목 : <input style="background-color: graytext;" name="board_title" type="text" required ><br><br>
게시글 내용 : <br><br><textarea style="background-color: graytext;" name="board_content" cols="100" rows="30" required >
</textarea><br>

</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>