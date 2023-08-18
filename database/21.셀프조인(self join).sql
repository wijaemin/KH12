--------------------------------------------------------------------------------------
--셀프조인(self join)을 이용한 멘션 형태의 게시글 출력
--------------------------------------------------------------------------------------

select a.*, b.BOARD_NO 상위글번호 , b.BOARD_TITLE 상위글제목 from board a left outer join board b on a.BOARD_PARENT = b.BOARD_NO  order by a.board_no asc;
