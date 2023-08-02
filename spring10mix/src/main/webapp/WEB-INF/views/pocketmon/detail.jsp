<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--
    페이지 내에서 프로그래밍 처리를 할수 있는
    추가 도구를 사용하도록 설정
     --%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.getNo()}번 몬스터 정보 </title>
</head>
<body>
<c:choose>
<c:when test="${dto != null}">
<h1>${dto.getNo()}번 ${dto.getName()} 몬스터</h1><br><br>
<h2> 넘버 : ${dto.getNo()}번 </h2><br>
<h2> 이름 : ${dto.getName()} </h2><br>
<h2> 타입 : ${dto.getType()} </h2><br>
</c:when>

<c:otherwise>
<h1>해당하는 몬스터 번호가 없다.</h1>
</c:otherwise>
</c:choose>
<%--
EL / JSTL
스프링에서 JSP를 이용해서 화면을 보여줄 때
필요한 처리를 담당하는 도구 또는 언어를 말함

EL
표현 언어(Expression Language).
컨트롤러에서 처리한 뒤 모델에 담겨 오는 데이터를
JSP에 원하는 위치에 출력하려고 할 때 사용하는 언어

${ 이름 }


JSTL
JSP 표준 태그 라이브러리(Jsp Standard Tag Library).
JSP 페이지에서 필요한 프로그래밍 처리를 수행하는 태그.

변수 생성 - <c:set>
조건 - <c:if>, <c:choose>
반복 - <c:forEach>

사용하려면 JSP 페이지에 다음과 같은 설정을 해야 한다

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
조건
조건이 한 개일 때는 <c:if>를 사용한다

<c:if test="조건식">

</c:if>


 --%>

</body>
</html>