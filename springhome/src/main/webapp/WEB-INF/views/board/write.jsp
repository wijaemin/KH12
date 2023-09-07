<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;padding: 130px;
	 p {text-align: left; font-size: 24px;font-weight: bolder;}
}
input{background-color: #558ca3;
}
textarea {
	background-color: #558ca3;
}
</style>
<c:choose>
<c:when test="${isReply}">
<h2>답글 작성</h2>
</c:when>
<c:otherwise>
</c:otherwise></c:choose>

<!DOCTYPE html>
<html lang="ko">

<head>
   
    <!-- javascript 작성 공간 -->
    <script src="./js/boardWrite.js"></script>
    <script>
        function nameCheack() {
            var input = document.querySelector("[name=board_title]");
            input.classList.remove("success", "fail");
            if (input.value.length == 0) {
                input.classList.add("fail");
                return false;
            }
            else {
                input.classList.add("success");
                return true;
            }

        }
        function textCheack() {
            var input = document.querySelector("[name=board_content]");
            var div = document.querySelector("[name=div1]");
            div.textContent=input.value.length;
            input.classList.remove("success", "fail");
            if (input.value.length == 0) {
                input.classList.add("fail");
                return false;
            }
            else {
                input.classList.add("success");
                return true;
            }

        }
        function formCheack() {
            var check = nameCheack();
            var check2 = textCheack();
            return check && check2;
        }
    </script>
</head>

<body>
    <div class="container w-600">
        <div class="row">
            <h1>게시글 작성</h1>
        </div>
        <div class="row">
            <form action="write" autocomplete="off" onsubmit="return formCheack();"method="post">
                <p>제목</p><br>
                <input type="text" name="board_title" class="form-input w-100" oninput="nameCheack();">
                <div class="success-feedback"></div>
                <div class="fail-feedback left">제목은 반드시 작성해야 합니다</div>
                <p>내용</p><br>
                <textarea onInput="textCheack();" name="board_content" class="form-input w-100"
                    style="min-height: 300px;"></textarea>
                <div class="success-feedback"></div>
                <div class="fail-feedback left">내용은 반드시 작성해야 합니다</div>

             <div style="display:flex; margin-left: 30em;"><div name="div1" >0</div>/1000</div> 
                <button type="submit" class="btn btn-positive w-100">작성하기</button>
            </form>
        </div>

    </div>
</body>

</html>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>