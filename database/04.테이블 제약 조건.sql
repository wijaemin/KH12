/*
테이블 제약 조건(table constraint)
- 보관할 데이터의 유효성을 검사하기 위하여 컬럼에 설정하는 조건
-만들때 cheak를 사용한다
-and라는 키워드로 && 처리 가능
-or이라는 키워드로||처리 가능
-not이라는 키워드로 !처리 가능
-between이라는 키워드로 ~이상 ~이하의 처리 가능
-오라클에서 같다는 의미는 =이다.
-in(a,b,c) 는 a,b,c중 하나여야 하는 의미이다.

조건의 종류
 - cheak : 추가할 데이터의 형식 검사를 설정 (주의 null 제외)
 - not null : 해당 항목에 null을 허용하지 않겟다는 설정(즉, 필수 항목)
 - unique : 특정 항목에 중복을 허용하지 않겟다는 설정(여러 항목을 묶어도 가능 ->복합키 설정) 
*/
drop table score;
CREATE TABLE score(
grade NUMBER NOT NULL CHECK(grade >= 1),
room NUMBER NOT NULL CHECK(room >= 1),
name varchar2(21) NOT NULL CHECK(regexp_like(name, '^[가-힣]{2,7}$')),
korean NUMBER (3) CHECK(korean >= 0
AND korean <= 100 ),
english NUMBER (3) CHECK(english BETWEEN 0 AND 100 ),
math NUMBER (3) CHECK(math BETWEEN 0 AND 100 ),
UNIQUE(grade,
room,
name)
);


INSERT  INTO  score(Grade, room, NAME, KOREAN,ENGLISH,MATH)
values(5,1,'황민하',50,60,70);

SELECT  *from score;



drop table account;

CREATE TABLE ACCOUNT(
account_owner varchar2(21) CHECK(regexp_like(account_owner, '^[가-힣]{2,7}$')),
account_period NUMBER CHECK(IN (1, 2, 3, 5, 10)),
account_count NUMBER CHECK(ACCOUNT_count >= 1),
account_payment NUMBER CHECK(ACCOUNT_payment >= 0
AND MOD(ACCOUNT_payment,
10000)= 0),
account_balance NUMBER CHECK(ACCOUNT_balance >= 0)
);
INSERT
	INTO
	ACCOUNT(account_owner,
	ACCOUNT_period,
	ACCOUNT_count,
	ACCOUNT_payment,
	ACCOUNT_balance
	)
	values ('황민하',1,2,150,1200);
