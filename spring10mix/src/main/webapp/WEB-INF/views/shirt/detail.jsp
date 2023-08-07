<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirt_no}번 내용</title>
</head>
<body>
<h1 >No.${dto.shirt_no} ${dto.shirt_name} 조회</h1>
<h4 align="right" ><a href="list" >뒤로 가기</a></h4>
<c:choose>
<c:when test="${dto != null}">
<ul>
<li><font size="5">상품 번호 : ${dto.shirt_no}</font></li>
<li><font size="5">상품 제목 : ${dto.shirt_name}</font></li>
<li><font size="5">상품 색상 : ${dto.shirt_color}</font></li>
<li><font size="5">판매가 : ${dto.shirt_price}</font></li>
<li><font size="5">상품 종류 : ${dto.shirt_kind}</font></li>
<li><font size="5">상품 유형 : ${dto.shirt_type}</font></li>
<li><font size="5">상품 재질 : ${dto.shirt_material}</font></li>
<li><font size="5">상품 판매수량 : ${dto.shirt_stock}</font></li>
</ul>
<img  align="right"  id="shirt_no=3"   alt="뭐지" src="https://tistory1.daumcdn.net/tistory/2826541/attach/f3c51d35915945aba94d36eda4c78264">
<h4><a href="edit?shirt_no=${dto.shirt_no}">상품 수정</a></h4>
<h4><a href="edit2?shirt_no=${dto.shirt_no}">상품 수정2</a></h4>
<h4><a href="detail2?shirt_no=${dto.shirt_no}">상품 디테일2</a></h4>
<h4><a href="delete?shirt_no=${dto.shirt_no}">상품삭제하기</a></h4>
</c:when>
<c:otherwise>
<h1>오류</h1>
</c:otherwise>
</c:choose>
</body>
</html>