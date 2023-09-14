<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<a href="/pocketmon/image?no=${pocketmonDto.no}">다운로드</a>
<a href="/pocketmon/edit?no=${pocketmonDto.no}">수정</a>
<h1>no=${pocketmonDto.no}</h1>
<h1>name=${pocketmonDto.name}</h1>
<h1>type=${pocketmonDto.type}</h1>
<c:choose>
<c:when test="${pocketmonDto.image}">
 <img src="image?no=${pocketmonDto.no}" width="200" height="200">
 </c:when>
	<c:otherwise>
		<img src="http://dummyimage.com/200x200/000/fff" width="200"
			height="200">
	</c:otherwise>
</c:choose>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>