--------------------------------------------------------------------------------------
--계층형 게시판
--------------------------------------------------------------------------------------

-- board 테이블에 항목 추가하는 구문
-- (주의) 추가하는 항목에 not null이 있으면 기존 데이터를 지워야함

DELETE board;
commit;

TRUNCATE table board;
ALTER table board add(
board_group number not null,
board_parent number,
board_depth number default 0 not null
);

-- board_list view 수정(3개 항목 추가)
CREATE or REPLACE  view board_list as select member_nickname, board.BOARD_NO, 
board.BOARD_WRITER ,board.BOARD_TITLE ,board.BOARD_CTIME ,
board.BOARD_READCOUNT ,board.BOARD_LIKECOUNT ,
board.BOARD_REPLYCOUNT , board.BOARD_UTIME , board_group,
board_parent, board_depth
from board left outer join member
on member.MEMBER_ID = board.BOARD_WRITER ;



insert into member(member_id, member_pw, member_nickname) values('khstudent1234', 'Khstudent1234!', '케이에이치1234');
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(1, '첫 번째 글', '첫 번째 글 내용', 'khstudent1234', 1, null, 0);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(2, '두 번째 글', '두 번째 글 내용', 'khstudent1234', 2, null, 0);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(3, '세 번째 글', '세 번째 글 내용', 'khstudent1234', 3, null, 0);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(4, '네 번째 글', '네 번째 글 내용', 'khstudent1234', 4, null, 0);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(5, '다섯 번째 글', '다섯 번째 글 내용', 'khstudent1234', 4, 4, 1);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(6, '여섯 번째 글', '여섯 번째 글 내용', 'khstudent1234', 3, 3, 1);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(7, '일곱 번째 글', '일곱 번째 글 내용', 'khstudent1234', 3, 3, 1);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(8, '여덟 번째 글', '여덟 번째 글 내용', 'khstudent1234', 4, 5, 2);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(9, '아홉 번째 글', '아홉 번째 글 내용', 'khstudent1234', 4, 5, 2);
insert into board(board_no, board_title, board_content, board_writer, board_group, board_parent, board_depth)
values(10, '열 번째 글', '열 번째 글 내용', 'khstudent1234', 4, 4, 1);
commit;


-- 최종 조회
SELECT * FROM board_list 
connect by Prior  board_no = board_parent
start WITH board_parent is NULL 
order siblings by board_group desc,board_no asc;
