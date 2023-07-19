/*
시퀀스(sequence)
-번호를 발행해 주는 기계(도구/객체)
데이터 베이스 종류에 따라 시퀀스가 테이블과 합쳐져 있는 경우도 있다.
오라클은 전반적으로 시퀀스를 따로 관리하는 것을 권장
생성
CREATE  sequence 이름[옵션];

*/

CREATE  table item(
item_no number primary key,
item_name varchar2(60) not null,
item_price number not null
);

drop table item;
SELECT * FROM  item;

DELETE FROM  item WHERE ITEM_name ='컴퓨터';
CREATE sequence item_seq;

INSERT INTO  item(item_no,item_name,item_price)
values (item_seq.nextval,'컴퓨터',100000);

SELECT * from user_sequences;
drop sequence item_seq;
--기본옵션으로 생성
CREATE sequence item_seq;
--옵션지정하여 생성(1001번부터 9999번까지 1씩증가,캐시없음)
create sequence item_seq
minvalue 1001
maxvalue 9999
increment by 1
start WITH  1001
nocache;
--cache 5;
