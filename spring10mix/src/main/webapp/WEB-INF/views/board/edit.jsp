<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
<h1 align="center"> ${dto.board_no}번  게시글 수정 </h1><br><br>

<form action="edit" method="post">
<input name="board_no"  type="text"value="${dto.board_no}" ><br><br>
게시글 이름 : <input name="board_title" value="${dto.board_title}"><br><br>
 <input name="board_writer" type="hidden" value="${dto.board_writer}"><br><br>
게시글 내용 : <textarea cols="50" rows="10" name="board_content" >${dto.board_content}</textarea><br><br>
 <input name="board_readcount"type="hidden"  value="${dto.board_readcount}"><br><br>
<button>수정</button>
</form>

</body>

</body>
</html>