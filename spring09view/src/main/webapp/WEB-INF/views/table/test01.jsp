<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 만들기</title>
</head>
<body>
	<h1>
		<font size="220" color="f150ff">테이블 만들기</font>
	</h1>

	<!-- 
홈페이지 에서 목록을 보여주기위해서 사용 가능한 태그
1. table 태그 -> 넓은 화면을 위한 목록
2. list 태그 -> 좁은 화면을 위한 목록
 -->

	<!-- 
 tr - 줄
 th - 제목용 칸
 td - 내용 칸
 (주의) 글자는 반드시 th나 td안에 써야 한다.
 (참고) 폭과 높이를 부여하지 않으면 내용에 기반하여 자동 생성
  -->
	<table border="20" width="350"  height="350">
		<tr>
			<th ><font color="ff01000">1-1</font></th>
			<th>1-2</th>
		</tr>

		<tr>
			<td>2-1</td>
			<td>2-2</td>
		</tr>
	</table>

</body>
</html>