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
<form action="add2" method="post">
상품 제목 : <input name="shirt_name" type="text" placeholder="300byte"><br><br>
상품 색상 : <select name="shirt_color" required="required">
<!-- 옵션에 value를 주면표시되는 값과 다르게 전송을 한다  -->
<option value="">선택하세요</option>
<option style="color: #fff05f;background-color:#fff050" >블랙</option>
<option style="background-color:#0151f4">화이트</option>
<option style="background-color:#f1f124">그레이</option>
<option style="background-color:#0f1124">레드</option>
<option style="background-color:#f1f124">블루</option>
</select>
<br><br>
판매가 : <input name="shirt_price" type="number"placeholder=" 0 이상의 숫자" min="0"><br><br>
상품 종류 : <select name="shirt_kind" required="required" >
<option value="">선택하세요</option>
<option >라운드</option>
<option >브이넥</option>
<option >정장</option>
</select>
<br><br>


상품 유형 : <select name="shirt_type" required="required">
<option value="">선택하세요</option>
<option >민소매</option>
<option >반팔</option>
<option >긴팔</option>
</select>
<br><br>

상품 재질 : <input name="shirt_material" type="text"placeholder="300byte"><br><br>
상품 판매수량 : <input name="shirt_shock" type="number"placeholder="0 이상의 숫자" value="0" min="0"><br><br>


<hr>
사이즈 S<input type="checkbox" name="size" value="S"><br>
사이즈 M<input type="checkbox" name="size" value="M"><br>
사이즈 L<input type="checkbox" name="size" value="L"><br>
사이즈 XL<input type="checkbox" name="size" value="XL"><br>
사이즈 XXL<input type="checkbox" name="size" value="XXL"><br>
<hr>
<button>저장</button>
</form>
<a href="list">뒤로가기</a>
</body>
</html>