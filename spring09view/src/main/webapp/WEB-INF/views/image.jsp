<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 다루기</title>
</head>
<body>
	<h1>이미지 다루기</h1>
	<!-- 
화면에 이미지 띄우기
-원하는곳에 원하는 크기로 이미지띄우기 위한 태그
-종료태그가 없음(일회성 태그)
-크기를폭(width)와 높이(height)로 부여할수있다.
-크기의 단위는 픽셀이다.
-비율도 지정 가능하다
 -->
 <a href="/hello">돌아가기</a>
 <img width="50%" height="200" src="https://images.velog.io/images/shlee327/post/9aba0bcf-fd4c-4e67-8b02-0a79bc07792b/%E1%84%83%E1%85%A1%E1%84%8B%E1%85%AE%E1%86%AB%E1%84%85%E1%85%A9%E1%84%83%E1%85%B3.png">

	<!-- 
	만약 내가 가진 이미지를 추가할경우 /static에 저장한뒤 호출
	-http://localhost:8080/이름 으로 호출가능
	-->
<img  width="200" src="http://localhost:8080/background.jpg">
<img  width="80%" src="background.jpg">
</body>
</html>