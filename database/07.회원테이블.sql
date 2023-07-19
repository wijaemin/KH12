CREATE TABLE MEMBER(
member_id varchar2(25) PRIMARY KEY CHECK(regexp_like(member_id, '^[a-z][a-z0-9]{7,24}$')),
member_pw varchar2(20) NOT NULL CHECK(regexp_like(member_pw, '[A-Z]+')
AND
regexp_like(member_pw, '[a-z]+')
AND
regexp_like(member_pw, '[0-9]+')
AND
regexp_like(member_pw, '[!@#$]+')
AND
regexp_like(member_pw, '^[a-zA-Z0-9!@#$]{8,20}$')),
member_nickname varchar2(30) NOT NULL CHECK(regexp_like(member_nickname, '^[a-zA-Z가-힣0-9]{2,10}$')),
member_brith char(10) NOT NULL UNIQUE,
member_email varchar2(100) NOT NULL ,
member_contact varchar2(11) NOT NULL , 
member_level varchar2(9) NOT NULL CHECK(member_level IN('일반', 'VIP', '관리자')),
member_point NUMBER DEFAULT 0 NOT NULL CHECK(member_point >= 0),
member_join DATE DEFAULT sysdate NOT NULL
);
-- (주의) 오라클에는 긍정 부정탐색이 없다.
drop table member;
SELECT *from member;

INSERT
	INTO
	MEMBER (member_id,
	member_pw,
	member_nickname,
	member_brith,
	member_email,
	member_contact,
	member_level,
	member_point,
	member_join)
VALUES('testuser1',
'Testuser1!',
'테스트유저',
'2023-10-26',
'tpfkalrrltk@naver.com',
'01022466759',
'관리자',
500,
sysdate);
