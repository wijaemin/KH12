<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>게시글 목록</h2>
<style>
td{ background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 30px;
}
</style>
<%--검색일 경우 검색어를 추가로 출력 
(참고) 논리 반환값을 가지는 메소드는 getter 메소드가 아닌 is로 시작한다.
--%><c:if test="${vo.search}">
<h3>게시판 아이디 &quot;${vo.keyword}&quot;에 대한 검색 결과</h3>
</c:if>
<c:if test="${param.keyword !=null}">
<h3>${param.type} &quot;${param.keyword}&quot;에 대한 검색 결과</h3>
</c:if>

<%--글쓰기는 로그인 상태일경우 출력 --%>
<c:if test="${sessionScope.name != null}"> 
<div align="right">
<button style="background-color: #778cb9" ><h3><a href="write" >게시글 등록</a></h3></button>

</div></c:if><br><br>
<div align="center">
<table border="1" style="background-color: black;" >
	<tr>
		<th>게시글 번호</th>
		<th>게시글 작성자</th>
		<th>게시글 닉네임</th>
		<th>게시글 이름</th>
		<th>게시글 조회수</th>
		<th>게시글 좋아요</th>
		<th>게시글 댓글수</th>
		<th>게시글 작성일</th>
		<th>게시글 수정일</th>
		<th>그룹</th>
		<th>상위</th>
		<th>차수</th>
	</tr>				

	<c:forEach var="boardListDto" items="${list}"><tr>
		<td align="center">${boardListDto.board_no}</td>
	<%-- 방법1 Dto에서 만들어서 처리(효율적)--%>
	
	<td align="center">${boardListDto.getBoardWriterString()}</td>
	
<%-- 	<td>${boardListDto.getBoardWriterString()}</td> --%>
	<td align="center">${boardListDto.member_nickname}</td><%-- 둘다 같은 표현식 --%>

<%--  방법2 sql구문에서 처리

	
		
		<c:choose>
		<c:when test="${boardListDto.board_writer != null}">
		<td>${boardListDto.board_writer}</td>
		</c:when>
		<c:otherwise>
		<td>탈퇴한 사용자</td>
		</c:otherwise>
		</c:choose>
		--%>
				
					<!-- 제목을 누르면 상세페이지 이동 -->
		<td><a href="detail?board_no=${boardListDto.board_no}">
				<!-- 댓글이 있다면 개수를 표시 -->
		<c:if test="${boardListDto.board_replycount > 0}">
				[${boardListDto.board_replycount}]
				</c:if>
				<!-- for(int i =1; i<${boardListDto.board_depth}; i++ -->
				<c:forEach var="i" begin="1" end="${boardListDto.board_depth}" step="1">
&nbsp;&nbsp;
				</c:forEach>
					<%--띄어쓰기 뒤에 화살표 표시 --%>
				<%-- <c:if test="차수가 0보다 크면">→</c:if> --%>
				<c:if test="${boardListDto.board_depth >0}">
				<img src="/images/arrow.png" width="15" height="15">
				</c:if>${boardListDto.board_title}</a></td>

		
		<td align="center">${boardListDto.board_readcount}</td>
		<td align="center">${boardListDto.board_likecount}</td>
		<td align="center">${boardListDto.board_replycount}</td>
		<td align="center">${boardListDto.boardCtimeString}</td>
		<td align="center"><fmt:formatDate value="${boardListDto.board_utime}" pattern="yyyy/MM/dd hh:mm:ss" /></td>
	<td align="center">${boardListDto.board_group}</td>
	<td align="center">${boardListDto.board_parent}</td>
	<td align="center">${boardListDto.board_depth}</td>
	</tr>
	</c:forEach>
</table>
</div>
<!-- 페이지 네이게이터 출력 -->

<h3 align="center">

<c:if test="${vo.first ==false}">


<a href="list?${vo.prevQueryString}">&lt;&laquo;</a>

</c:if>

<c:forEach var="i" begin="${vo.begin}" end="${vo.end}" step="1">
	<c:choose>
		<c:when test="${vo.page == i}">
			${i}	
		</c:when>
		<c:otherwise>
					<a href="list?${vo.getQueryString(i)}">${i}</a>
					
		</c:otherwise>
	</c:choose>
</c:forEach>


<c:if test="${!vo.last}">

			<a href="list?${vo.nextQueryString}">&gt;&raquo;</a>
		
			
	
</c:if>


</h3>





<br><br>
<div align="center">
<form style="background-color: #778ca3" action="list" method="get">

<c:choose>
<c:when test="${param.type == 'board_writer'}"> 
<select name="type" style="background-color: #578ca3" required="required">
<option value="board_title" >제목</option>
<option value="board_writer" selected="selected">작성자</option>
</select>
</c:when>
<c:otherwise>
<select name="type" style="background-color: #578ca3" required="required">
<option value="board_title" selected="selected" >제목</option>
<option value="board_writer">작성자</option>
</select>
</c:otherwise>
</c:choose>



<input type="search" name="keyword" required="required" style="background-color: #578ca3" placeholder="검색하실 이름을 입력해주세요" value="${vo.keyword}"> <button style="color: #778ca3">검색</button>
</form></div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>