CREATE TABLE board(
board_no NUMBER primary key CHECK(board_no>0),
board_title varchar2(300)NOT NULL,
board_content varchar2(4000)NOT NULL,
board_writer varchar2(20) CHECK (regexp_like(board_writer, '^[a-zA-Z0-9]{8,20}$')),
board_readcount NUMBER default 0 NOT NULL CHECK(board_readcount >= 0),

);
/*
-- 등록시 항목을 제외시키면 null이 들어간다
-- null이 아니라 default를 입력하면 초기값을 정할수 있다. 입력도 바꿔야함

--번호의 경우 목적이 '식별'을 위한 값
-- [1]번호가 변경될수 있으면 not null unique로 본다.
-- [2]번호가 영원히 변경될 수 없다면 Primary Key 로 본다.

-- 결론적으로 사용하는 조건은 앞으로 5가지 이다.
-- not null - null 금지조건
-- unique -중복 금지 조건(null가능)
-- primary key - not null unique +불변(테이블 대표 항목)
-- check  - 데티어 형식 검사 조건
-- default - 미지정시 자동 설정될 값 조건
*/
DROP TABLE board;

SELECT
	*
	FROM board;

insert  INTO  board(board_no,board_title,board_content,board_writer)
values (1, '황민하','daadassd','tpfkalrrlkt');
insert  INTO  board(board_no,board_title,board_content,board_writer,board_readcount)
values (2, '김지권','dasd','adsasasd',1);
INSERT  INTO  board(board_no,board_title,board_content,board_writer,board_readcount)
values (3,'테스트제목','테스트내용','testt2est',5);

DELETE from board where board_title = '테스트제목';
