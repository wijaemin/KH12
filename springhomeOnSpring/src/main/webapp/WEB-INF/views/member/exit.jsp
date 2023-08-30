<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<div align="center">
<h1>회원탈퇴</h1><br><br>
<h4>기존의 회원 정보는 삭제 됩니다. 괜찮으십니까?</h4><br><br>
<form name="exit" method="post">
비밀번호 입력 : <input name="memberPw" type="password" required="required" placeholder="비밀번호를 입력해주세요"><br><br>
<c:if test="${param.erorr != null}">
<a>비밀번호가 틀렸습니다.</a></c:if><br><br>
<button>탈퇴</button>

</form>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>