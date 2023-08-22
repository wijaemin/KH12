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

<h1 align="center">회원 리스트</h1>
<div align="center">
<table border="2" style="text-align: center;" width ="1000">
<tr>
<th>회원 아이디</th>
<th>회원 닉네임</th>
<th>회원 전화번호</th>
<th>회원 생년월일</th>
<th>회원 이메일</th>
<th>회원 등급</th>
<th>차단 여부</th>
<th colspan="3">메 뉴</th>

 </tr>
 <c:forEach var="memberList" items="${list}">
 <tr>
 <td>${memberList.memberId}</td>
  <td>${memberList.memberNickname}</td>
   <td>${memberList.memberContact}</td>
    <td>${memberList.memberBirth}</td>
     <td>${memberList.memberEmail}</td>
      <td>${memberList.memberLevel}</td> 
         <td>  ${memberList.block}</td>
       <td><a href="memberDetail?memberId=${memberList.memberId}">상세</a></td>
      <td><a href="edit?memberId=${memberList.memberId}">수정</a></td>
      <c:choose>
      <c:when test="${memberList.block =='Y'}">
      <td><a href="cancel?memberId=${memberList.memberId}">해제</a></td></c:when>
      <c:otherwise> <td><a href="block?memberId=${memberList.memberId}">차단</a></td>
      </c:otherwise>
      </c:choose>
       
 </tr></c:forEach>
</table>
</div>
<br>
<div align="center">

<h3>
<c:if test="${!vo.first}">
	<a href="memberList?${vo.prevQueryString}">&lt;</a>
</c:if> 

<c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
	<a href="list?${vo.getQueryString(i)}">${i}</a>
</c:forEach>

<c:if test="${!vo.last}">
	<a href="memberList?${vo.nextQueryString}">&gt;</a>
</c:if>

</h3>

</div>

<br><br>
<div align="center">
<form style="background-color: #778ca3" action="list" method="get">
<c:choose>
<c:when test="${vo.type =='member_nickname'}">
<select name="type" style="background-color: #578ca3" required="required">
<option value="member_id">아이디</option>
<option value="member_nickname" selected="selected">닉네임</option>
<option value="member_contact">전화번호</option>
<option value="member_email">이메일</option>
<option value="member_birth">생년월일</option>
<option value="member_level">등급</option>
</select>
</c:when>
<c:when test="${vo.type =='member_contact'}">
<select name="type" style="background-color: #578ca3" required="required">
<option value="member_id" >아이디</option>
<option value="member_nickname">닉네임</option>
<option value="member_contact" selected="selected">전화번호</option>
<option value="member_email">이메일</option>
<option value="member_birth">생년월일</option>
<option value="member_level">등급</option>
</select>
</c:when>
<c:when test="${vo.type =='member_id'}">
<select name="type" style="background-color: #578ca3" required="required">
<option value="member_id" selected="selected" >아이디</option>
<option value="member_nickname">닉네임</option>
<option value="member_contact">전화번호</option>
<option value="member_email">이메일</option>
<option value="member_birth">생년월일</option>
<option value="member_level">등급</option>
</select>
</c:when>
<c:when test="${vo.type =='member_email'}">
<select name="type" style="background-color: #578ca3" required="required">
<option value="member_id"  >아이디</option>
<option value="member_nickname">닉네임</option>
<option value="member_contact">전화번호</option>
<option value="member_email" selected="selected">이메일</option>
<option value="member_birth">생년월일</option>
<option value="member_level">등급</option>
</select>
</c:when>
<c:when test="${vo.type =='member_birth'}">
<select name="type" style="background-color: #578ca3" required="required">
<option value="member_id"  >아이디</option>
<option value="member_nickname">닉네임</option>
<option value="member_contact">전화번호</option>
<option value="member_email" >이메일</option>
<option value="member_birth" selected="selected">생년월일</option>
<option value="member_level" >등급</option>
</select>
</c:when>
<c:when test="${vo.type =='member_level'}">
<select name="type" style="background-color: #578ca3" required="required">
<option value="member_id"  >아이디</option>
<option value="member_nickname">닉네임</option>
<option value="member_contact">전화번호</option>
<option value="member_email" >이메일</option>
<option value="member_birth" >생년월일</option>
<option value="member_level" selected="selected">등급</option>
</select>
</c:when>
<c:otherwise><select name="type" style="background-color: #578ca3" required="required">
<option value="member_id" selected="selected">아이디</option>
<option value="member_nickname">닉네임</option>
<option value="member_contact">전화번호</option>
<option value="member_email">이메일</option>
<option value="member_birth">생년월일</option>
<option value="member_level" >등급</option>
</select></c:otherwise>
</c:choose>





<input type="search" name="keyword" required="required" style="background-color: #578ca3" placeholder="검색하실 단어를 입력해주세요" value="${vo.keyword }"> <button style="color: #778ca3">검색</button>
</form></div>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>