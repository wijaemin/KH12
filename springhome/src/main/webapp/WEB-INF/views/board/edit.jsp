<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;
}
</style>
<h2>게시글 수정</h2>

<form action="edit"method="post" autocomplete="off">
<<<<<<< HEAD
<h1 align="right"><button>게시글 수정</button></h1><br><br>
<input type="hidden" name="board_no" value="${boardDto.board_no}">
게시글 제목 : <input name="board_title" type="text" value =${boardDto.board_title} required><br><br>
게시글 내용 : <br><textarea name="board_content" cols="100" rows="30" required  >
=======
<input type="hidden" name="board_no" value="${boardDto.board_no}">
게시글 제목 : <input name="board_title" type="text" value =${boardDto.board_title}><br><br>
게시글 내용 : <br><textarea name="board_content" cols="30" rows="30"  >
>>>>>>> branch 'main' of https://github.com/tpfkalrrltk/KH12.git
${boardDto.board_content}
</textarea><br>
</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>