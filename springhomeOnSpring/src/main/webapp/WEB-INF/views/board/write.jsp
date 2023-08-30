<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 130px;
}
</style>
<c:choose>
<c:when test="${isReply}">
<h2>답글 작성</h2>
</c:when>
<c:otherwise><h2>게시글 작성</h2>
</c:otherwise></c:choose>


<form action="write"method="post" autocomplete="off">
<div class="container w-600">
        <div class="row">
            <h1>게시글 작성</h1>
        </div>
        <div class="row left">
            <label>제목</label>
            <input type="text" name="boardTitle" class="form-input w-100">
        </div>
        <div class="row left">
            <label>내용</label>
            <textarea name="boardContent" class="form-input fixed w-100"></textarea>
        </div>
        <div class="row right">
            <button class="btn btn-positive">글쓰기</button>
            <a href="#" class="btn">목록보기</a>
        </div>
    </div>

</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>