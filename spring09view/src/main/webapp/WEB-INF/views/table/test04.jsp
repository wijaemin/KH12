<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KH대학 시간표</title>
</head>
<style>
th {
	background-color: #ff5200;
	border-bottom-color: #f05080;
	border-left-color: #f05080;
	border-right-color: #f05080;
	border-top-color: #f05080;
}

td {
	text-align: center;
}
</style>
<body>
	<h1 align="center">KH대학 시간표</h1>
	<table align="center" border="3" width="550">
		<tr>
			<th></th>
			<th>월</th>
			<th>화</th>
			<th>수</th>
			<th>목</th>
			<th>금</th>
		</tr>
		<tr>
			<th>1교시</th>
			<td rowspan="3">자바기초</td>
			<td rowspan="6">공강</td>
			<td colspan="2">파이썬기초</td>
			<td rowspan="6">공강</td>
		</tr>
		<tr>
			<th>2교시</th>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<th>3교시</th>
			<td rowspan="3">웹개발 기초</td>
			<td></td>
		</tr>
		<tr>
			<th>4교시</th>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<th>5교시</th>
			<td rowspan="2">데이터베이스</td>
			<td></td>
		</tr>
		<tr>
			<th>6교시</th>
			<td></td>
			<td>인공지능 심화</td>
		</tr>

	</table>

</body>
</html>