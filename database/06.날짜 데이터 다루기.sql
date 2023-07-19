/*
날짜 데이터 다루기
-date 형태를 사용하며 연/월/일/시/분/초 까지 저장
- 날짜만 쓰거나 시간만 써야 되는 경우는 문자열로 하는 경우도 있음
- 날짜는 형식이 지정되어 있어 따로 설정 할 것이 없음

*/

create  table emp(
emp_no number primary key,
emp_name varchar2(21) check(regexp_like(emp_name,'^[가-힣]{2,7}$')),
emp_salary number  not null check (emp_salary>=0),
emp_join date  default sysdate not null 
);
SELECT *from emp;
drop table emp;
DELETE  from emp where emp_no = 4;

--시간은 문자열 처럼도 넣을수 있다(단 국가별로 형식이 다름)
INSERT  into emp(emp_no,emp_name,emp_salary,emp_join)
values (1,'김사장',10000000,'2001-01-01');

--- 문자열을 변환 명령을 써서 넣을수도 있다
INSERT  into emp(emp_no,emp_name,emp_salary,emp_join)
values (1,'김사장',10000000,to_date('2001-02-01','yyyy-MM-dd'));

-- 현재시간을 구해서 넣어야 할때는 sys.date라는 항목을 사용(현재 시간까지 넣어짐)
INSERT  into emp(emp_no,emp_name,emp_salary,emp_join)
values (2,'박전무',7500000,sysdate);

INSERT  into emp(emp_no,emp_name,emp_salary)
values (4,'이부장',7500000);
