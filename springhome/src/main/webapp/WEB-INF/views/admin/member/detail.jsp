<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #7f8fa6;padding: 30px;
}
</style>
<div align="center">

<h2>${memberDto.memberId}님 회원정보</h2><br>
<button style="background-color: #778cb9"><h2><a href="list">관리자목록 전환</a></h2></button>
<button style="background-color: #778cb9"><h2><a href="change">회원정보 변경</a></h2></button>
<button style="background-color: #778cb9"><h2><a href="exit">회원 탈퇴</a></h2></button>
<br>
<br>
<table border="1" width="550">
<tr>
		<th>아이디</th>
		<td>${memberDto.memberId}</td>
	</tr>
	<tr>
		<th>닉네임</th>
		<td>${memberDto.memberNickname}</td>
	</tr>
	<tr>
		<th>이메일</th>
		<td>${memberDto.memberEmail}</td>
	</tr>
	<tr>
		<th>연락처</th>
		<td>${memberDto.memberContact}</td>
	</tr>
	<tr>
		<th>생년월일</th>
		<td>${memberDto.memberBirth}</td>
	</tr>
	<tr>
		<th>주소</th>
		<td>[${memberDto.memberPost}] ${memeberDto.memeberAddr1}
			${memeberDto.memeberAddr2}</td>
	</tr>
	<tr>
		<th>등급</th>
		<td>${memberDto.memberLevel}</td>
	</tr>
	<tr>
		<th>포인트</th>
		<%-- 		<td>${memberDto.memberPoint}pt</td> --%>
		<td><fmt:formatNumber value="${memberDto.memberPoint}"
				pattern="#,##0.00"></fmt:formatNumber> PT</td>
	</tr>
	<tr>
		<th>가입일</th>
		<%-- 		<td>${memberDto.memberJoin}</td> --%>
		<td><fmt:formatDate value="${memberDto.memberJoin}"
				pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
	</tr>
	<tr>
		<th>마지막 로그인</th>
<%-- 		<td>${memberDto.memberLogin}</td> --%>
		<td><fmt:formatDate value="${memberDto.memberLogin}"
				pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
	</tr>
	<tr>
		<th>마지막 비밀번호 변경일</th>

		<%-- 		<td>${memberDto.memberChange}</td> --%>
		<td><fmt:formatDate value="${memberDto.memberChange}"
				pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
	</tr>

</table>
<br>

<h2>활동 내역</h2>
<table border="1" width="500">
<tr>
<th width="75%">제목</th>
<th>작성일</th>
</tr>
<c:forEach var="boardListDto" items="${boardList}">
<tr>
<td><a href="/board/detail?board_no=${boardListDto.board_no}">${boardListDto.board_title}</a></td>
<td>${boardListDto.board_ctime}</td>
</tr>
</c:forEach>
</table>

</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>