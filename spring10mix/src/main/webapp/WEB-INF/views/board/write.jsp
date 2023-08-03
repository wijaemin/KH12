<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
<h1>게시글 작성</h1>
<form action="write" method="post">
게시글 제목 :<input name="board_title"><br><br>
글쓴이 :<input name="board_writer"><br><br>

내용 :<textarea name="board_content" rows="20" cols="50"></textarea><br><br>
<button>등록</button>
</form>
</body>
</html>