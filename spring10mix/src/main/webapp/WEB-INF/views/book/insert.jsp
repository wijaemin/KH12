<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 등록</title>
</head>
<body>
<h1>책 등록</h1>
<form action="insert" method="post">
책 넘버 : <input required="required" name="bookID" min="0" placeholder="겹칠수 없음" ><br><br>
책 이름 : <input required="required"name="bookTitle"placeholder="책의 제목입력 바람"><br><br>
책 작가 : <input required="required"name="bookAuthor"placeholder="책의 작가입력바람"><br><br>
책 출판일 : <input required="required"type="date" name="bookPublicationDate"><br><br>
책 가격 : <input required="required"type="number" name="bookPrice" min="0"placeholder="소수점입력 0.00까지 가능" step="0.01"><br><br>
책 출판사 : <input required="required"name="bookPublisher"><br><br>
책 장르 : <input required="required" name="bookGenre"><br><br>
책 페이지 수 : <input required="required"type="number" name="bookPageCount" min="0"><br><br>
<button>등록</button>
</form>

</body>
</html>