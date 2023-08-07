CREATE TABLE shirt(
shirt_no NUMBER PRIMARY KEY,
shirt_name varchar2(300) NOT NULL,
shirt_color varchar2(9) NOT NULL 
,
shirt_price NUMBER NOT NULL CHECK(shirt_price >= 0),
shirt_kind varchar2(9) NOT NULL,
shirt_type varchar2(9) NOT NULL,
shirt_material varchar2(300),
shirt_stock NUMBER NOT NULL CHECK(shirt_stock >= 0)
);
CREATE sequence shirt_seq;
DROP sequence shirt_seq;
select shirt_seq.nextval from dual;
commit;
DROP table shirt;
SELECT * from shirt;
SELECT * from shirt_size WHERE shirt_no =23;


--옷사이즈 테이블
CREATE  table shirt_size(
shirt_no references shirt(shirt_no) on DELETE cascade,
shirt_size_name varchar2(10),
primary key(shirt_no, shirt_size_name)
);

