create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');

drop table PRODUCT ;
-- 기본 조회
select * from product;

SELECT  * from PRODUCT  WHERE  TO_CHAR(made,'mm') in('06','07','08'); 

SELECT  * from PRODUCT  WHERE  made BETWEEN 
TO_DATE('2019-07-01 00:00:00','yyyy-mm-dd hh24:mi:ss') 
and TO_DATE('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss');  

SELECT  * from PRODUCT  WHERE made BETWEEN  
TO_DATE('2020-01-01 00:00:00', 'yyyy-mm-dd hh24:mi:ss') and 
SYSDATE ; 

SELECT  * FROM  PRODUCT WHERE  made BETWEEN SYSDATE  -365 and SYSDATE ;

--(응용) 시간까지 고려 (시작일 00시부터 종료일 23시 59분 59초까지)
-- sysdate는 현재시각이라 시분초가 안맞을수 있음
SELECT  * FROM  PRODUCT WHERE  made BETWEEN 
TO_DATE( to_char(SYSDATE  -365,'yyyy-mm-dd') || ' '||'00:00:00','yyyy-mm-dd hh24:mi:ss')
and  TO_DATE(to_char(SYSDATE,'yyyy-mm-dd') || ' '||'23:59:59','yyyy-mm-dd hh24:mi:ss');
