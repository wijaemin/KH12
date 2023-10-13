<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원의 조회 검색</title>
</head>
<body>
<h1>회원 조회</h1>
${vo}
<form >
<div>회원아이디 : <input type="text" name="memberId" value="${vo.memberId}"></div>
<div>회원비밀번호 : <input type="text" name="memberPw" value="${vo.memberPw}"></div>
<div>회원닉네임 : <input type="text" name="memberNickname" value="${vo.memberNickname}"></div>
<div>회원이메일 : <input type="text" name="memberEmail" value="${vo.memberEmail}"></div>
<div>회원전화번호 : <input type="tel" name="memberContact" value="${vo.memberContact}"></div>
<div>회원생일 : <input type="date" name="memberBirth" value="${vo.memberBirth}"></div>
<div>회원우편주소 : <input type="text" name="memberPost" value="${vo.memberPost}"></div>
<div>회원기본주소 : <input type="text" name="memberAddr1" value="${vo.memberAddr1}"></div>
<div>회원상세주소 : <input type="text" name="memberAddr2" value="${vo.memberAddr2}"></div>


<div>회원 가입일: <input type="date" name="memberJoinStart" value="${vo.memberJoinStart}">
~ <input type="date" name="memberJoinEnd" value="${vo.memberJoinEnd}"></div>
<div>회원 로그인시간: <input type="date" name="memberLoginStart" value="${vo.memberLoginStart}">
~ <input type="date" name="memberLoginEnd" value="${vo.memberLoginEnd}"></div>
<div>회원 비밀번호시간: <input type="date" name="memberChangeStart" value="${vo.memberChangeStart}">
~ <input type="date" name="memberChangeEnd" value="${vo.memberChangeEnd}"></div>
<div> 회원 등급 : <select>
<option name="memberLevelList" value="일반">일반</option>
<option name="memberLevelList" value="VIP">VIP</option>
<option name="memberLevelList" value="운영자">운영자</option>

</select></div>
<button type="submit">검색</button>
</form>

<hr>
<table border="1" style="text-align: center;">
<tr>
<th>아이디</th>
<th>비밀번호</th>
<th>닉네임</th>
<th>이메일</th>
<th>전화번호</th>
<th>생일</th>
<th>우편주소</th>
<th>기본주소</th>
<th>상세주소</th>
<th>등급</th>


</tr>
<c:forEach var="memberDto" items="${list}">
<tr>
<td>${memberDto.memberId}</td>
<td>${memberDto.memberPw}</td>
<td>${memberDto.memberNickname}</td>
<td>${memberDto.memberEmail}</td>
<td>${memberDto.memberContact}</td>
<td>${memberDto.memberBirth}</td>
<td>${memberDto.memberPost}</td>
<td>${memberDto.memberAddr1}</td>
<td>${memberDto.memberAddr2}</td>
<td>${memberDto.memberLevel}</td>
</tr>
</c:forEach>
</table>

</body>
</html>