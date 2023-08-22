<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<style>
td{ background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 30px;
}

</style>
<h2>회원정보 변경</h2>

<form action="edit" method="post"><br><br>
<input type="hidden" name="memberId" value="${memberDto.memberId}"><br><br>
닉네임 : <input type="text" name="memberNickname" value="${memberDto.memberNickname}" required="required"><br><br>
연락처 : <input type="tel" name="memberContact" value="${memberDto.memberContact}"><br><br>
생년월일 : <input type="date" name="memberBirth" value="${memberDto.memberBirth}"><br><br>
이메일 : <input type="email" name="memberEmail" value="${memberDto.memberEmail}"><br><br>
우편주소 : <input type="text" name="memberPost" value="${memberDto.memberPost}" placeholder="우편주소"><br>
기본주소 : <input type="text" name="memberAddr1" value="${memberDto.memberAddr1}" placeholder="기본주소"><br>
상세주소 : <input type="text" name="memberAddr2" value="${memberDto.memberAddr2}" placeholder="상세주소"><br>
		
		
		<%-- radio button은 select box와 같은 역할을 한다 --%>
		등급 : 
		<c:choose>
		<c:when test="${memberDto.memberLevel=='VIP'}">
		<input type="radio" name="memberLevel" value="일반" >일반
		<input type="radio" name="memberLevel" value="VIP" checked="checked">VIP
		<input type="radio" name="memberLevel" value="관리자">관리자<br><br>
		</c:when>
		
		<c:when test="${memberDto.memberLevel=='관리자'}">
		<input type="radio" name="memberLevel" value="일반" >일반
		<input type="radio" name="memberLevel" value="VIP">VIP
		<input type="radio" name="memberLevel" value="관리자" checked="checked">관리자<br><br>
		</c:when>
		
		<c:otherwise>
		<input type="radio" name="memberLevel" value="일반" checked="checked">일반
		<input type="radio" name="memberLevel" value="VIP">VIP
		<input type="radio" name="memberLevel" value="관리자">관리자<br><br>
		</c:otherwise>
		</c:choose>
포인트 : <input type="text" name="memberPoint" value="${memberDto.memberPoint}"><br><br>
<button>저장</button>
</form>




<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>