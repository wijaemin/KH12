<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 결과 조회</title>
</head>
<body>

<form>
<div>도서번호<input type="text" name="bookId" value="${vo.bookId}"></div>
<div>도서명<input type="text" name="bookTitle" value="${vo.bookTitle}"></div>
<div>저자<input type="text" name="bookAuthor" value="${vo.bookAuthor}"></div>
<div>출판사<input type="text" name="bookPubilsher" value="${vo.bookPublisher}"></div>
<div>
출간일
<input type="date" name="bookPublicationBegin" value="${vo.bookPublicationBegin}">
~ <input type="date" name="bookPublicationEnd" value="${vo.bookPublicationEnd}">
</div>
<div>
판매가
<input type="number" name="bookPriceMin" value="${vo.bookPriceMin}">
~ <input type="number" name="bookPriceMax" value="${vo.bookPriceMax}">
</div>
페이지
<input type="number" name="bookPageMin" value="${vo.bookPageMin}">
~ <input type="number" name="bookPageMax" value="${vo.bookPageMax}">
</div>
<div>
장르
<c:choose>
<c:when test="${vo.bookGenreList.contains('Fantasy')}">
<input type="checkbox" name="bookGenreList" value="Fantasy" checked>Fantasy
</c:when>
<c:otherwise>
<input type="checkbox" name="bookGenreList" value="Fantasy">Fantasy
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${vo.bookGenreList.contains('Classic')}">
<input type="checkbox" name="bookGenreList" value="Classic" checked>Classic
</c:when>
<c:otherwise>
<input type="checkbox" name="bookGenreList" value="Classic">Classic
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${vo.bookGenreList.contains('Dystopian')}">
<input type="checkbox" name="bookGenreList" value="Dystopian" checked>Dystopian
</c:when>
<c:otherwise>
<input type="checkbox" name="bookGenreList" value="Dystopian">Dystopian
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${vo.bookGenreList.contains('Romance')}">
<input type="checkbox" name="bookGenreList" value="Romance" checked>Romance	
</c:when>
<c:otherwise>
<input type="checkbox" name="bookGenreList" value="Romance">Romance	
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${vo.bookGenreList.contains('Modernist')}">
<input type="checkbox" name="bookGenreList" value="Modernist" checked>Modernist
</c:when>
<c:otherwise>
<input type="checkbox" name="bookGenreList" value="Modernist">Modernist
</c:otherwise>
</c:choose>

<c:choose>
<c:when test="${vo.bookGenreList.contains('Fiction')}">
<input type="checkbox" name="bookGenreList" value="Fiction" checked>Fiction	
</c:when>
<c:otherwise>
<input type="checkbox" name="bookGenreList" value="Fiction">Fiction
</c:otherwise>
</c:choose>	

</div>
<!-- 정렬 -->
<div>
1차 정렬
<select name="orderList" >
<option value="">선택하세요</option>
<option value="book_id asc">번호순</option>
<option value="book_price desc">가격 비싼 순</option>
<option value="book_price asc">가격 저렴한 순</option>
<option value="book_publication_date asc">최근 출간한 순</option>
</select>
</div>
<div>
2차 정렬
<select name="orderList" >
<option value="">선택하세요</option>
<option value="book_id asc">번호순</option>
<option value="book_price desc">가격 비싼 순</option>
<option value="book_price asc">가격 저렴한 순</option>
<option value="book_publication_date asc">최근 출간한 순</option>
</select>
</div>
<button type="submit">검색</button>
</form>
<hr>
<table border="1" style="text-align: center; width: 1000px" >
<thead>
<tr>
<th>번호</th>
<th>제목</th>
<th>작가</th>
<th>출판사</th>
<th>출판일</th>
<th>가격</th>
<th>장르</th>
<th>페이지수</th>
</tr>
</thead>
<tbody>
<c:forEach var="bookDto" items="${list}">
<tr>
<td>${bookDto.book_id}</td>
<td>${bookDto.book_title}</td>
<td>${bookDto.book_author}</td>
<td>${bookDto.book_publisher}</td>
<td>${bookDto.book_publication_date}</td>
<td>${bookDto.book_price}원</td>
<td>${bookDto.book_genre}</td>
<td>${bookDto.book_page_count}</td>

</tr>
</c:forEach>
</tbody>
</table>


</body>
</html>