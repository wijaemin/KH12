-- 함수(function)
-- 입력과 출력으로 이루어진 기능 집합
-- 부르면 무언가 작업해주는 도구

-- <단일행 함수>
-- 입력과 출력이 1대1인 함수
select upper(book_title) from book;
select LOWER(book_title) from book;
SELECT  LENGTH(BOOK_TITLE ) from book;

SELECT  * from book WHERE  LOWER(BOOK_TITLE) like 'harry%'; 
-- <집계 함수>
--데이터를 모아서 하나의 결과를 만드는 함수
SELECT max(BOOK_PIRCE) from book;
SELECT min(BOOK_PIRCE) from book;
SELECT sum(BOOK_PIRCE) from book;
SELECT avg(BOOK_PIRCE) from book;

--(주의)count는 null을 카운트 하지 않는다.
SELECT count(BOOK_PIRCE) from book;
-- 그래서 null과 관련없이 카운트하고 싶다면 와일드 카드를 활용하여 사용한다.
SELECT count(*) from book;
--(주의사항) 집계함수는 정해진 자리에만 사용할수 있다.
SELECT  * from book WHERE BOOK_PIRCE = max(BOOK_PIRCE);
-- <분석 함수>


