<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>
<!-- 스타일시트 로딩 코드 -->
<link rel="stylesheet" type="text/css" href="/css/commons.css">
<link rel="stylesheet" type="text/css" href="/css/test.css">
</head>
<body>
<div align="center" ></div>
<h1>헤더 기준 홈페이지 </h1>
<hr>
<%--
JSP에서 세션에 저장된 값을 확인하려면 EL의 내장객체를 사용
sessionScope 내장객체를 사용하면 HttpSession 의 값을 조회할수 있다.
 --%>
 세션ID = ${pageContext.session.id}
 세션값 = ${sessionScope.name}
 세션레벨= ${sessionScope.level}
<br>
<%--이페이지는 조각일 뿐이므로 상대경로로하면 오류가 발생한다. 
그래서 절대 경로로 지정해야 한다. --%>
<%-- 세션에 저장된 name 의 이름값으로 회원/비회원 구분--%>
<h4 align="right">로그인 아이디: ${sessionScope.name}</h4>
<h4 align="right">(테스트용) 로그인 비밀번호: ${sessionScope.password}</h4>
<c:choose>
<c:when test="${sessionScope.name != null}">

<button style="background-color: #778cb9" ><h3><a href="/">홈</a></h3></button>
<button style="background-color: #778cb9" ><h3><a href="/member/mypage">마이페이지</a></h3></button>
<button style="background-color: #778cb9" ><h3><a href="/board/list">게시판</a></h3></button>
<button style="background-color: #778cb9" ><h3><a href="/member/logout">로그아웃</a></h3></button>

<%-- 관리자의 경우 추가 메뉴 출력--%>
<c:if test="${sessionScope.level=='관리자'}">
<button  style="background-color: #778cb9" ><h3><a href="/admin/home">관리자 메뉴</a></h3></button>
</c:if>
</c:when>
<c:otherwise>
<button style="background-color: #778cb9" ><h3><a href="/">홈</a></h3></button>
<button style="background-color: #778cb9" ><h3><a href="/member/join">회원가입</a></h3></button>
<button style="background-color: #778cb9" ><h3><a href="/board/list">게시판</a></h3></button>
<button style="background-color: #778cb9" ><h3><a href="/member/login">로그인</a></h3></button>
</c:otherwise>
</c:choose>

<hr>


<hr><br>