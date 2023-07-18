
-- 동신사가 무조건 2자리 라면 고정문자열 처리
-- (장점) 빠른 처리 속도
--(단점)  글자수가 다를수 없음
CREATE  TABLE plan(
company char (2),
name varchar2(60),
pirce NUMBER,
DATA NUMBER,
CALL NUMBER,
text number
);




--메뉴 정보 테이블
--(참고) 테이블 자료형에는 논리가 없다.
--y/n으로 처리하거나 1/0으로 처리
CREATE TABLE menu(
name varchar2(60),
TYPE  varchar2(9),
pirce NUMBER,
event char(1)
);
