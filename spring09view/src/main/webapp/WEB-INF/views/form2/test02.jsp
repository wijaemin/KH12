<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 비밀번호 변경</title>
</head>
<body>
	<h1>회원 비밀번호 변경</h1>
	<form action="http://localhost:8080/member/password" method="post">
		<br>
		<br> 회원 아이디 : <input name="memberId"  type="text" required="required"
			placeholder="asdasd"><br>
		<br> 회원 기존 비밀번호 : <input name="memberPw"  type="password" required="required"
			placeholder="asdasd"><br>
		<br> 회원 변경 비밀번호 : <input name="changePw"  type="password"  required="required"
			placeholder="asdasd"><br>
		<br> 회원 변경 재확인 비밀번호 : <input required="required"
			placeholder="확인용"><br>
		<br>
		<button>비밀번호 변경</button>
	</form>
</body>
</html>