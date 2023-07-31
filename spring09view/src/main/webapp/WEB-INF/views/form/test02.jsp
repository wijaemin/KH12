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
	<form action="http://localhost:8080/insert">
		게시글 넘버 : <input type="number" name="board_no"><br> <br> 
		게시글 제목 : <input type="text"
			name="board_title"><br> <br> 
			게시글 작가 : <input type="text"
			name="board_writer"><br> <br> 
			게시글 내용 : <textarea type="text" cols="100" rows="10"
			name="board_content"> </textarea><br> <br> 
			게시글 읽은횟수 : <input type="number" min="0"
			name="board_readcount"><br> <br>

		<button>저장</button>
	</form>
</body>
</html>