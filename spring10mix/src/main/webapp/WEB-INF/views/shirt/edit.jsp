<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 정보 수정</title>
</head>
<body>
	
	<h1>셔츠 정보 수정</h1>
	
	<form action="edit" method="post">
		<input type="hidden" name="shirt_no" value="${dto.shirt_no}">
	
		이름 <input type="text" name="shirt_name" value="${dto.shirt_name}" required><br><br>
		색상 
		<!-- 
			option에 value를 주면 표시되는 값과 다르게 전송을 한다
		 -->
		<select name="shirt_color" required>
			<option value="">선택하세요</option>
			<%--
				EL의 특징
				- 외따옴표, 쌍따옴표 모두 문자열로 취급
				- 문자열도 비교연산이 가능
			 --%>
			<c:choose>
				<c:when test="${dto.shirt_color == '블랙'}">
					<option selected>블랙</option>
				</c:when>
				<c:otherwise>
					<option>블랙</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${dto.shirt_color == '화이트'}">
					<option selected>화이트</option>
				</c:when>
				<c:otherwise>
					<option>화이트</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${dto.shirt_color == '그레이'}">
					<option selected>그레이</option>
				</c:when>
				<c:otherwise>
					<option>그레이</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${dto.shirt_color == '레드'}">
					<option selected>레드</option>
				</c:when>
				<c:otherwise>
					<option>레드</option>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${dto.shirt_color == '블루'}">
					<option selected>블루</option>
				</c:when>
				<c:otherwise>
					<option>블루</option>
				</c:otherwise>
			</c:choose>
		</select>
		<br><br>
		판매가 <input type="number" name="shirt_price" 
							value="${dto.shirt_price}" required><br><br>
		
		상품종류
		<select name="shirt_kind" required>
			<option value="">선택하세요</option>
			<option <c:if test="${dto.shirt_kind == '라운드'}">selected</c:if>>라운드</option>
			<option <c:if test="${dto.shirt_kind == '브이넥'}">selected</c:if>>브이넥</option>
			<option <c:if test="${dto.shirt_kind == '정장'}">selected</c:if>>정장</option>
		</select>	
		<br><br>
		상품유형
		<select name="shirt_type" required>
			<option value="">선택하세요</option>
			
			<c:choose>
				<c:when test="${dto.shirt_type == '민소매'}">
					<option selected>민소매</option>
				</c:when>
				<c:otherwise>
					<option>민소매</option>
				</c:otherwise>	
			</c:choose>
			
			<c:choose>
				<c:when test="${dto.shirt_type == '반팔'}">
					<option selected>반팔</option>
				</c:when>
				<c:otherwise>
					<option>반팔</option>
				</c:otherwise>	
			</c:choose>
			
			<c:choose>
				<c:when test="${dto.shirt_type == '긴팔'}">
					<option selected>긴팔</option>
				</c:when>
				<c:otherwise>
					<option>긴팔</option>
				</c:otherwise>	
			</c:choose>
			
		</select>
		<br><br>
		재질 <input type="text" name="shirt_material"
					value="${dto.shirt_material}"><br><br>
		재고 <input type="number" name="shirt_stock" 
					value="${dto.shirt_stock}" required><br><br>
		<button>수정하기</button>
	</form>
	
	<h2><a href="list">목록으로</a></h2>
	<h2><a href="detail?shirt_no=${dto.shirt_no}">상세보기</a></h2>
	
</body>
</html>



