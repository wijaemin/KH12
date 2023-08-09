<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div align="center">

<h2>${memberDto.memberId}님 회원정보 변경</h2>

<form action="change" method="post">

닉네임 : <input type="text" name="memberNickname" value="${memberDto.memberNickname}" required="required"><br><br>
이메일 : <input type="email" name="memberEmail" placeholder="${memberDto.memberEmail}"><br><br>
연락처 : <input type="text" name="memberContact" placeholder="${memberDto.memberContact}"><br><br>
생년월일 : <input type="date" name="memberBirth" placeholder="${memberDto.memberBirth}"><br><br>
주소 : <input type="text" name="memberPost" maxlength="6" size="6" placeholder="우편번호"><br><br>
<input type="text" name="memberAddr1"size="30"  placeholder="기본주소"><br><br>
<input type="text" name="memberAddr2" size="30" placeholder="상세주소"><br><br>

비밀번호 확인 : <input name="memberPw" type="password"><br><br>


<button>회원정보 변경</button>
</form>
<c:if test="${param.erorr != null}">
<h3>비밀번호가 틀렸습니다. 다시 입력해주세요</h3></c:if>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>