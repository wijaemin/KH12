<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 상품 등록</title>
</head>
<body>
<h1>셔츠 상품 등록</h1>
<form action="add" method="post">
상품 제목 : <input name="shirt_name" type="text" placeholder="300byte"><br><br>
상품 색상 : <select name="shirt_color" >
<option style="color: #fff05f;background-color:#fff050" >블랙</option>
<option style="background-color:#0151f4">화이트</option>
<option style="background-color:#f1f124">그레이</option>
<option style="background-color:#0f1124">레드</option>
<option style="background-color:#f1f124">블루</option>
</select>
<br><br>
판매가 : <input name="shirt_price" type="number"placeholder=" 0 이상의 숫자"><br><br>
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

상품 재질 : <input name="shirt_material" type="text"placeholder="300byte"><br><br>
상품 판매수량 : <input name="shirt_shock" type="number"placeholder="0 이상의 숫자"><br><br>

<button>저장</button>
</form>
</body>
</html>