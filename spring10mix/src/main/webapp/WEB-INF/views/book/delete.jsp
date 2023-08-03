<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책의 삭제</title>
</head>
<body>
	<h1>책을 삭제 합니까 ?</h1>
	<form action="http://localhost:8080/book/delete" method="post">
		삭제할 책의 일련번호를 입력하세요 .<input name="no" type="number" min="0">
		<button>삭제 ㄱㄱ</button>
	</form>
</body>
</html>