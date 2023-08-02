<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.memberId}님 조회 </title>
</head>
<body>

<c:choose>
<c:when test="${dto.memberId != null}">
<h1>${dto.memberId}님 회원 정보 조회</h1>
<ul>
<li>아이디 : ${dto.memberId}</li>
<li>비밀번호 : ${dto.memberPw}</li>
<li>닉네임 : ${dto.memberId}</li>
<li>이메일 : ${dto.memberEmail}</li>
<li>생년월일 : ${dto.memberBirth}</li>
<li>전화번호 : ${dto.memberContact}</li>
<li>회원등급 : ${dto.memberLevel}</li>
<li>회원포인트 : ${dto.memberPoint}</li>
<li>회원가입일 : ${dto.memberJoin}</li>
</ul>
</c:when>
<c:otherwise>
<h1 align="center">없는 회원입니다.</h1>
<img align="middle"  src="">
<form action="http://localhost:8080/book/detail">
<button align="middle">돌아가기</button></form>
</c:otherwise>
</c:choose>
</body>
</html>