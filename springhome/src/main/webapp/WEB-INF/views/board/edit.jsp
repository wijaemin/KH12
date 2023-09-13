<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
td{text-align: center; background-color: silver;}
th{text-align: center; background-color: graytext;}
body {
	background-color: #778ca3;
}

.note-editable {

    line-height: 2;  !important}
</style>

<!-- jquery cdn -->
  <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

<!-- SummerNote cdn -->

  <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<script>
    $(function () {
      $('[name=board_content]').summernote({
        placeholder: '내용을 작성하세요.',
        tabsize: 2, //탭을 누르면
        height: 300,
        maxHeight : 300,
        minHeight :300,
      
        toolbar: [
          ['style', ['bold','italic','underline','style']],
          ['font', ['bold', 'underline', 'clear']],
          ['color', ['forecolor','backcolor']],
          ['para', ['ul', 'ol', 'paragraph']],
       
          ['table', ['table']],
          ['insert', ['link', 'picture']],
          ['view', ['fullscreen', 'codeview', 'help']]
        ]
      });
    });  
  </script>

<h2>게시글 수정</h2>

<form action="edit"method="post" autocomplete="off">

<h1 align="right"><button style="background-color: graytext">게시글 수정</button></h1><br><br>
<input type="hidden" name="board_no" value="${boardDto.board_no}">
게시글 제목 : <input style="background-color: graytext;" name="board_title" type="text" value ="${boardDto.board_title}" required ><br><br>
게시글 내용 : <br><textarea style="background-color: graytext;" name="board_content"  cols="100" rows="30" 
required  >${boardDto.board_content}</textarea><br>
</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>