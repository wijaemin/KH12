<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 상품 리스트</title>
<style >
th{background-color: #f5f200}
td{text-align: center;}
</style>
</head>
<body style="background-color: #ff42ff">


<h1 align="center">셔츠 상품 리스트</h1>
<h2 align="right"><a href="add" ><font>상품 등록</font></a></h2>
<h2 align="right"><a href="add2" ><font>상품 등록2</font></a></h2>
<table border="1" >
<tr>
<th>고유번호</th>
<th>상품제목</th>
<th>상품색상</th>
<th>판매가</th>
<th>상품종류</th>
<th>상품유형</th>
<th>재질</th>
<th>판매수량</th>
</tr>
<c:forEach var="dto" items="${list}">
<tr>
<td>${dto.shirt_no}</td>
<td><a href="detail?shirt_no=${dto.shirt_no}" title="누르면 클릭됩니다.">${dto.shirt_name}</a></td>
<td>${dto.shirt_color}</td>
<td>${dto.shirt_price}원</td>
<td>${dto.shirt_kind}</td>
<td>${dto.shirt_type}</td>
<td>${dto.shirt_material}</td>
<td>${dto.shirt_stock}</td>
</tr>
</c:forEach>
</table>

</body>
</html>