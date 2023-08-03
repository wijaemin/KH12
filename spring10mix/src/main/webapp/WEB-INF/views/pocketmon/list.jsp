<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--

for(Pocketmon dto dto : list){
system.out.println(dto.getName());}


<c:forEach var="dto" items="${list}">
<h2>${dto}</h2>
</c:forEach>

 --%>

<h1>포켓몬스터 목록</h1>
<h2><a href="insert">신규등록</a></h2>
<table border="2">
<thead>
<tr>
<th>번호</th>
<th>이름</th>
<th>타입</th>
<th>이동</th>
</tr>
</thead>

<tbody>
<c:forEach var="dto" items="${list}">
<tr>
<td>${dto.no}</td>
<td>${dto.name}</td>
<td>${dto.type}</td>
<td><a href="/pocketmon/detail?no=${dto.no}">GO</a></td>
</tr>
</c:forEach>
</tbody>

</table>

