<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>
</head>
<body>
<div align="center">
<h1>헤더 기준 홈페이지 </h1>
<hr>
<%--이페이지는 조각일 뿐이므로 상대경로로하면 오류가 발생한다. 
그래서 절대 경로로 지정해야 한다. --%>
<a href="/">홈</a>
<a href="/member/join">회원가입</a>
<a href="/member/login">로그인</a>
<a href="/board/list">게시판</a>
<hr><br>