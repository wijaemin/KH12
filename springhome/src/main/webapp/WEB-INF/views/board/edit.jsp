<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h2>게시글 수정</h2>

<form action="edit"method="post" autocomplete="off">
게시글 제목 : <input name="board_title" type="text" ><br><br>
게시글 내용 : <br><textarea name="board_content" cols="30" rows="30"  >
</textarea><br>
<button>게시글 수정</button>
</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>