<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>비밀번호 변경</h2>
<!-- 
아이디는 기존 세션에 있기 때문에 입력하거나 전송할 필요가 없다.
 -->
 <form action="password" method="post">
 기존 비밀번호 : <input type="password" name="originPw" required><br><br>
 변경 비밀번호 : <input type="password" name="changePw" required><br><br>
 <button>변경</button>
 </form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>