<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<h1>포켓몬 수정</h1>
	<!-- 
	번호의 경우 전송은 하지만 수정은 불가능 해야한다.
	1.입력창에 readonly 속성 추가
	2.입력창을 숨김으로 설정
	 -->

	<form action="edit?no${dto.no}" method="post">
	<!-- 	번호 :<input type="text" name="no" value="${dto.no}" readonly><br>
		 -->	번호 :<input type="hidden" name="no" value="${dto.no}" readonly><br>
		<br> 이름 :<input type="text" name="name" value="${dto.name}"><br>
		<br> 타입 :<input type="text" name="type" value="${dto.type}"><br>
		<br>
		<button>수정</button>
	</form>
</body>
</html>