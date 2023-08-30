<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td{ background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 30px;
}

</style>

<h1 align="center">회원 상세정보</h1>

<button style="background-color: #778cb9" ><h3><a href="list"> 목록</a></h3></button>
<table border="2" style="text-align: center;">
<tr>
<th>회원 아이디</th>
<th>회원 닉네임</th>
<th>회원 전화번호</th>
<th>회원 생년월일</th>
<th>회원 이메일</th>
<th>회원 등급</th>
 </tr>
 <tr>
 <td>${memberDto.memberId}</td>
  <td>${memberDto.memberNickname}</td>
   <td>${memberDto.memberContact}</td>
    <td>${memberDto.memberEmail}</td>
     <td>${memberDto.memberBirth}</td>
      <td>${memberDto.memberLevel}</td>
 </tr>
</table>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>