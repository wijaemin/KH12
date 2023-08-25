<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h2>회원가입</h2>

<div class="container w-400 ">
<form action="join"method="post" autocomplete="off">

<font >회원 아이디 : <input type="text" required="required" name="memberId" ><br><br></font>

회원 비밀번호 : <input type="password" required="required" name="memberPw" ><br><br>
회원 닉네임 : <input type="text" name="memberNickname" required="required"><br><br>
회원 이메일 : <input type="email" name="memberEmail"><br><br>
회원 연락처 : <input type="tel" name="memberContact" size="11"><br><br>
회원 생년월일 : <input type="date" name="memberBirth"><br><br>
회원 주소 : <input type="text" name="memberPost" placeholder="우편번호" size="6" maxlength="6"><br><br>
<input type="text" name="memberAddr1" placeholder="기본주소"  size="30"><br><br>
<input type="text" name="memberAddr2" placeholder="상세주소" size="30"><br><br>

<button>회원가입 저장</button>
</form></div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>