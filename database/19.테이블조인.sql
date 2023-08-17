CREATE table member(
member_id varchar2(20)primary key check(regexp_like(member_id,'^[a-z0-9\-_]{5,20}$')),
member_pw varchar2(16)not null check(regexp_like(member_pw,'^[a-zA-Z0-9!@#$]{8,16}$')),
member_nickname varchar2(30)not null check(regexp_like(member_nickname,'^[가-힣0-9]{10}$')),
member_email varchar2(100),
member_contact char(11)check(regexp_like(member_contact, '^010[1-9][0-9]{7}$')),
member_birth char(10)check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
member_post varchar2(6)check(regexp_like(member_post,'^[0-9]{5,6}$')),
member_addr1 varchar2(300),
member_addr2 varchar2(300),
member_level varchar2(9) default '일반' check (member_level in('일반''VIP''관리자')),
member_point number  default 0 check(member_point >0),
member_join date default sysdate not null,
member_login date default sysdate not null,
member_change date default sysdate not null
);



CREATE table member(
member_id varchar2(20)primary key,
member_pw varchar2(16)not null,
member_nickname varchar2(30)not null,
member_email varchar2(100),
member_contact char(11)check(regexp_like(member_contact, '^010[1-9][0-9]{7}$')),
member_birth char(10)check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
member_post varchar2(6)check(regexp_like(member_post,'^[0-9]{5,6}$')),
member_addr1 varchar2(300),
member_addr2 varchar2(300),
member_level varchar2(9) default '일반' check (member_level in('일반''VIP''관리자')),
member_point number  default 0,
member_join date default sysdate not null,
member_login date default sysdate not null,
member_change date default sysdate not null
);
DROP table member;

commit;

select * from member where member_id = 'testuser1234';





drop table member;
create table member(
member_id varchar2(20) primary key,
member_pw varchar2(16) not null,
member_nickname varchar2(30) not null unique,
member_email varchar2(100),
member_contact char(11),
member_birth char(10),
member_post varchar2(6),
member_addr1 varchar2(300),
member_addr2 varchar2(300),
member_level varchar2(9) default '일반' not null,
member_point number default 0 not null,
member_join date default sysdate not null,
member_login date default sysdate not null,
member_change date default sysdate not null,
check(regexp_like(member_id, '^[a-z][a-z0-9-_]{4,19}$')),
check(
    regexp_like(member_pw, '^[A-Za-z0-9!@#$]{8,16}$')
    and
    regexp_like(member_pw, '[A-Z]+')
    and
    regexp_like(member_pw, '[a-z]+')
    and
    regexp_like(member_pw, '[0-9]+')
    and
    regexp_like(member_pw, '[!@#$]+')
),
check(regexp_like(member_contact, '^010[1-9][0-9]{7}$')),
check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(member_post, '^[0-9]{5,6}$')),
check(member_level in ('일반', 'VIP', '관리자')),
check(member_point >= 0)
);



-- 로그인 시간 업데이트
UPDATE member set MEMBER_LOGIN=sysdate where MEMBER_ID='testuser1';

--비밀번호 변경 Hello1234!로 변경
UPDATE  member set MEMBER_PW ='Hello1234!' where MEMBER_id='testuser1';


DELETE from member where member_id =testuser11;

rollback;


CREATE table board(
board_no number primary key,
board_writer references member(member_id) on DELETE set null,
board_title varchar2(300)not null,
board_content varchar2(4000)not null,
board_ctime date default sysdate,
board_readcount number default 0 check(board_readcount>=0),
board_likecount number default 0 check(board_likecount>=0),
board_replycount number default 0,
board_utime date default null);

DROP table board;
CREATE sequence board_seq;
select board_seq.nextval from dual;
DROP sequence board_seq;
commit;

delete from board where board_no =24;
update board set board_readcount =board_readcount+1 where board_no=22;


select board_no,board_writer,board_title "			
				+ "from board where board_title='asdasdas';
select board_no,board_writer,board_title, board_readcount,board_likecount,board_replycount,BOARD_CTIME ,BOARD_UTIME  from board order by board_no asc;




-- 검색을 위한 SQL 구문은 무엇인가?
--1. 제목을 Hello로 검색했을때
SELECT * from board where instr(board_title, 'hello') >0
order by BOARD_NO desc;
--2. 작성자를 testuser로 검색했을때
SELECT * from board where instr(BOARD_WRITER , 'testuser') >0
order by BOARD_NO desc;


--------------------------------------------------------------------------------------
--테이블 조인(table join) : 서로다른 테이블을 합쳐서 조회
--------------------------------------------------------------------------------------
select * from "MEMBER" ;
select * from BOARD  ;

--1.cross join : 두테이블을 곱하여 출력
SELECT member_id, board_no, board_writer FROM MEMBer,board;

--2.inner join : 둘다 있는 경우 출력(커플만 출력)
select member_id,member_nickname ,board_no, board_writer
from member inner join board 
on member.member_id = board.BOARD_WRITER;

--3.outer join : 한쪽을 기준으로 연결하여 출력(솔로+커플 모두 출력)
select member_id,member_nickname, board_no,board_writer
from board left outer join member
on member.MEMBER_ID = board.BOARD_WRITER ;


--완성된 구문
select member_nickname, board.*
from board left outer join member
on member.MEMBER_ID = board.BOARD_WRITER ;
