<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--
    매번 페이지 코드를 복사할수 없으니 미리 만든것을 불러오도록 설정
    -템플릿 페이지(template page)라고 부름
     --%>
     <jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<hr><br>
<h2>환영합니다.</h2>
<img alt="테스트 이미지"  align="right" width="150" src="https://avatars.githubusercontent.com/u/137031458?v=4">
<br>
<br>

 <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
