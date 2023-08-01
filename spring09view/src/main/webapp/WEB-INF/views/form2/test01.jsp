<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬스터 수정</title>
</head>
<body>
<h1>포켓몬스터 수정</h1>
<form action="http://localhost:8080/update" method="post">
포켓몬 넘버 : <input name="no" required="required"><br><br>
포켓몬 이름 : <input name="name" required="required"><br><br>
포켓몬 속성 : <input name="type" required="required"><br><br>
<button>수정</button>
</form>
</body>
</html>