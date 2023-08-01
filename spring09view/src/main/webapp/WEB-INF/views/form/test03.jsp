<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
<h1>회원 가입 신청서</h1>
<form action="http://localhost:8080/member/join" method="post">
<!--  autocomplete="off" 자동완성 기능을 제거 할수 있다. 
입력창에 설명을 적는 placeholder 속성이 있다.
(중요) 폼에 전송방식을 지정하여 데이터를 다르게 보낼수 있다.
-method= "get" : 기본값이며, 주소에 데이터를 첨부하여 전송
-method= "post" : HTTP Body에 데이터를 첨부하여 전송
-->
회원 아이디 : <input type="text" name="memberID" 
required="required" autocomplete="off" placeholder="영문 소문자+숫자 8~25자"><br><br>
회원 비밀번호 : <input type="password" name="memberPW" required="required"><br><br>
<!--  만약 비밀번호 확인을 만든다면
전송할 계획이 없으므로 name를 만들지 않는다(FE처리)
 -->
비밀번호 확인 : <input type="password"  required="required"><br><br>
회원 닉네임 : <input type="text" name="memberNickname"
placeholder="한글 + 숫자 2~10자"><br><br>
회원 생년월일 : <input type="date" name="memberBrith"><br><br>
회원 이메일 : <input type="email" name= "memberEmail"><br><br>
회원 전화번호 : <input type="tel" name="memberContact"><br><br>
<!--  전화번호 입력창은 타입 tel로 만들면..
모바일에서 숫자 키패드가 뜬다.
 -->
<button>회원가입 신청</button>
</form>
</body>
</html>