<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.board_no}번 게시글 조회</title>
</head>
<style>td{text-align: center;}</style>
<body>
<c:choose>
<c:when test="${dto != null }">
<h1 align="center"> ${dto.board_no}번  게시글 조회 결과 </h1><br><br>
<h2>읽은 횟수 : ${dto.board_readcount}회</h2>
<h2><a href="edit?no=${dto.board_no}">게시글 수정</a></h2>
<h2><a href="delete?board_no=${dto.board_no}">게시글 삭제</a></h2>
<h2><a href="delete/${dto.board_no}">게시글 삭제2</a></h2>
<table border="2" align="center" width="800" >
<tr>
<th> 게시글 넘버</th>
<th> 게시글 제목</th>
<th> 게시글 내용</th>
<th> 게시글 글쓴이</th>
</tr>
<tr>
<td>
No.${dto.board_no}
</td>
<td>
${dto.board_title}
</td>
<td width="200" height="200">
 ${dto.board_content}
</td>
<td>
${dto.board_writer}
</td>
</tr>
</table>
<a href="/board/list">목록 전환</a>
</c:when>
<c:otherwise>
<h1>없는 번호 입니다.</h1>
<img src="http://www.naver.com">
</c:otherwise>
</c:choose>

</body>
</html>