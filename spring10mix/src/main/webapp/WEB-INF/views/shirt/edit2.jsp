<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${shirtDto.shirt_no}상품수정</title>
</head>
<body>
	<h1>${shirtDto.shirt_no}번 상품수정</h1>

	<form action="edit2" method="post">
		상품 제목 : <input name="shirt_name" type="text" placeholder="300byte"
			value="${shirtDto.shirt_name}"><br> <br> 상품 색상 : <select
			name="shirt_color" required="required">
			<c:choose>
				<c:when test="${shirtDto.shirt_color=='블랙'}">
					<option selected="selected">블랙</option>
				</c:when>
				<c:otherwise>
					<option>블랙</option>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${shirtDto.shirt_color=='화이트'}">
					<option style="background-color: red" selected="selected">화이트</option>
				</c:when>
				<c:otherwise>
					<option style="background-color: red">화이트</option>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${shirtDto.shirt_color == '그레이'}">
					<option selected="selected">그레이</option>
				</c:when>
				<c:otherwise>
					<option>그레이</option>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${shirtDto.shirt_color == '레드'}">
					<option selected="selected">레드</option>
				</c:when>
				<c:otherwise>
					<option>레드</option>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${shirtDto.shirt_color == '블루'}">
					<option selected="selected">블루</option>
				</c:when>
				<c:otherwise>
					<option>블루</option>
				</c:otherwise>
			</c:choose>


		</select> <br> <br> 판매가 : <input name="shirt_price" type="number"
			placeholder=" 0 이상의 숫자" value="${shirtDto.shirt_price}"><br>
		<br> 상품 종류 : <select name="shirt_kind" required="required">
			<c:choose>
				<c:when test="${shirtDto.shirt_kind=='라운드'}">
					<option selected="selected">라운드</option>
				</c:when>
				<c:otherwise>
					<option>라운드</option>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${shirtDto.shirt_kind=='브이넥'}">
					<option selected="selected">브이넥</option>
				</c:when>
				<c:otherwise>
					<option>브이넥</option>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${shirtDto.shirt_kind=='정장'}">
					<option selected="selected">정장</option>
				</c:when>
				<c:otherwise>
					<option>정장</option>
				</c:otherwise>
			</c:choose>
		</select> <br> <br> 상품 유형 : <select name="shirt_type"
			required="required">
			<option value="">선택하세요</option>
			<option>민소매</option>
			<option>반팔</option>
			<option>긴팔</option>
		</select> <br> <br> 상품 재질 : <input name="shirt_material" type="text"
			placeholder="300byte" value="${shirtDto.shirt_material}"><br>
		<br> 상품 판매수량 : <input name="shirt_shock" type="number"
			placeholder="0 이상의 숫자"><br> <br>


<!-- 체크박스를 만들때 체크 처리 해야됨(Pass) -->
<hr>
사이즈 S<input type="checkbox" name="size" value="S"><br>
사이즈 M<input type="checkbox" name="size" value="M"><br>
사이즈 L<input type="checkbox" name="size" value="L"><br>
사이즈 XL<input type="checkbox" name="size" value="XL"><br>
사이즈 XXL<input type="checkbox" name="size" value="XXL"><br>
<hr>

		<button>
			<a>저장</a>
		</button>
	</form>
	<a href="list">목록으로 가기</a><br>
		<a href="detail2?shirt_no=${shirtDto.shirt_no}">상세정보 돌아가기</a>
</body>
</html>