<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirt_no}상품 수정</title>
</head>
<body>
<h1>${dto.shirt_no}번 상품 수정</h1>

<form action="add" method="post">
상품 제목 : <input name="shirt_name" type="text" placeholder="300byte" value="${dto.shirt_name}"><br><br>
상품 색상 : <select name="shirt_color"  >
<option selected="selected">블랙</option>
<option style="background-color:red" >화이트</option>
<option >그레이</option>
<option >레드</option>
<option >블루</option>
</select>
<br><br>
판매가 : <input name="shirt_price" type="number"placeholder=" 0 이상의 숫자" value="${dto.shirt_price}"><br><br>
상품 종류 : <select name="shirt_kind" >
<option >라운드</option>
<option >브이넥</option>
<option >정장</option>
</select>
<br><br>


상품 유형 : <select name="shirt_type" >
<option >민소매</option>
<option >반팔</option>
<option >긴팔</option>
</select>
<br><br>

상품 재질 : <input name="shirt_material" type="text"placeholder="300byte" value="${dto.shirt_material}"><br><br>
상품 판매수량 : <input name="shirt_shock" type="number"placeholder="0 이상의 숫자" ><br><br>

<button><a>저장</a></button>
</form>
</body>
</html>