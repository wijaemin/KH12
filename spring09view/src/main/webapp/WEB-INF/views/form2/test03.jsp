<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<h1><font size="500">회원 탈퇴를 합니다.</font></h1>
	<form action="http://localhost:8080/member/exit">
		회원 이름 : <input name="memberId" type="text" required="required"
			placeholder="아이디"><br>
		<br> 회원 비밀번호 : <input name="memberPw" type="password" required
			placeholder="비밀번호"><br>
		<br> 회원 비밀번호 확인 : <input type="password" required="required"
			placeholder="비밀번호 확인"><br>
		<br>
<button><font size="150"> 회원 탈퇴 버튼</font></button>

	</form>

</body>
</html>