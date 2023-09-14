<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="pocketmonDto" items="${list}">
	<div>
		<a href="/pocketmon/detail?no=${pocketmonDto.no}">${pocketmonDto.no}/${pocketmonDto.name}/${pocketmonDto.type}
	
		<c:choose>
			<c:when test="${pocketmonDto.image}">
				<img src="image?no=${pocketmonDto.no}" width="50" height="50">
			</c:when>
			<c:otherwise>
				<img src="http://dummyimage.com/50x50/000/fff" width="50"
					height="50">
			</c:otherwise>
		</c:choose>
		</a><a href="delete?no=${pocketmonDto.no}">삭제</a>
		<hr>
		
	</div>
</c:forEach>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>