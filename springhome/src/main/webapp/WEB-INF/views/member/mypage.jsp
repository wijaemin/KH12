<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<style>
td {
	text-align: center;
	background-color: silver;
}

th {
	text-align: center;
	background-color: graytext;
}

body {
	background-color: #7f8fa6;
	padding: 30px;
}
</style>
<script>
	$(function() {
		//파일이 변경되면 프로필을 업로드하고 이미지 교체
		$(".profile-chooser").change(
				function() {
					//선택된 파일이 있는지 확인하고 없으면 중단
					// var input = document.querySelector(".profile-chooser");
					//var input = $(".profile-chooser")[0];
					var input = this;
					if (input.files.length == 0) {
						return;
					}

					// ajax로 multipart 업로드
					var form = new FormData();
					form.append("attach", input.files[0]);

					$.ajax({
						url : window.contextPath+"/rest/member/upload",
						method : "post",
						processData : false,
						contentType : false,
						data : form,
						success : function(response) {
							// 응답 형태 - {"attachNo" : 7}

							//프로필 이미지 교체
							$(".profile-image").attr(
									"src",
									"/rest/member/download?attachNo="
											+ response.attachNo);

						},
						error : function() {
							window.alert("통신오류 발생 \n 잠시후 다시 시도 해주세요.");
						},
					});
				});

		//삭제아이콘을 누르면 프로필이 제거되도록 구현
		$(".profile-delete").click(function() {
			//확인창
			var choice = window.confirm("정말 삭제하시겠습니까?");
			if (choice == false)
				return;

			//삭제요청
			$.ajax({
				url : window.contextPath+"/rest/member/delete",
				method : "post",
				success : function(response) {
					$(".profile-image").attr("src", "/images/user.jpg");
				},
			});
		});
	});
</script>


<div align="center">

	<h2>${memberDto.memberId}님회원정보</h2>

	<div class="row mv-30">
		<c:choose>
			<c:when test="${profile ==null }">
				<img src="/images/user.jpg" width="150" height="150"
					class="image image-circle image-border profile-image">
			</c:when>
			<c:otherwise>
				<img src="/rest/member/download?attachNo=${profile}" width="150"
					height="150" class="image image-circle image-border profile-image">
			</c:otherwise>
		</c:choose>

		<!-- 라벨을 만들고 파일 선택창을 숨김 -->
		<label> <input type="file" class="profile-chooser"
			accept="image/*" style="display: none"> <i
			class="fa-solid fa-camera blue fa-5x"></i>
		</label> <i class="fa-solid fa-trash-can red fa-5x profile-delete"></i>
	</div>

	<table border="1" width="550">
		<tr>
			<th>닉네임</th>
			<td>${memberDto.memberNickname}</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${memberDto.memberEmail}</td>
		</tr>
		<tr>
			<th>연락처</th>
			<td>${memberDto.memberContact}</td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td>${memberDto.memberBirth}</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>[${memberDto.memberPost}] ${memeberDto.memeberAddr1}
				${memeberDto.memeberAddr2}</td>
		</tr>
		<tr>
			<th>등급</th>
			<td>${memberDto.memberLevel}</td>
		</tr>
		<tr>
			<th>포인트</th>
			<%-- 		<td>${memberDto.memberPoint}pt</td> --%>
			<td><fmt:formatNumber value="${memberDto.memberPoint}"
					pattern="#,##0.00"></fmt:formatNumber> PT</td>
		</tr>
		<tr>
			<th>가입일</th>
			<%-- 		<td>${memberDto.memberJoin}</td> --%>
			<td><fmt:formatDate value="${memberDto.memberJoin}"
					pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
		</tr>
		<tr>
			<th>마지막 로그인</th>
			<%-- 		<td>${memberDto.memberLogin}</td> --%>
			<td><fmt:formatDate value="${memberDto.memberLogin}"
					pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
		</tr>
		<tr>
			<th>마지막 비밀번호 변경일</th>

			<%-- 		<td>${memberDto.memberChange}</td> --%>
			<td><fmt:formatDate value="${memberDto.memberChange}"
					pattern="y년 M월 d일 E요일 a h시 m분 s초" /></td>
		</tr>

	</table>

	<div class="row mt-40">
		<h2>내가 좋아요 한 게시글</h2>
	</div>

	<div class="row">
		<table class="table  table-border table-stripe">
			<c:forEach var="boardDto" items="${boardLikeList}">
				<tr>
					<td class="w-75 left"><a
						href="/board/detail?board_no=${boardDto.board_no}" class="link">
							${boardDto.board_title} </a></td>
					<td class="w-25">${boardDto.board_writer}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</div>
<h2>
	<a href="change">회원정보 변경</a>
</h2>
<h2>
	<a href="password">비밀번호 변경</a>
</h2>
<h2>
	<a href="exit">회원 탈퇴</a>
</h2>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>