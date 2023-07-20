-- 서브쿼리(sub query)
-- 여러 개의 구문을 순차적으로 실행하도록 만드는 기술

--만약 가장 비싼 금액의 상품 정보를 조회
SELECT  max(PRICE) from PRODUCT ;
SELECT *FROM  PRODUCT WHERE PRICE = 3000;

--위 항목의 예제를 서브쿼리로 변환하면 아래와 같다.
SELECT *FROM  PRODUCT WHERE PRICE = (SELECT  max(PRICE) from PRODUCT );


--SELECT max(name) from PRODUCT;
SELECT *from PRODUCT   where name =(SELECT max(name) from PRODUCT);

--SELECT  min(book_pirce) from book;
SELECT  * from book where BOOK_PIRCE =(SELECT  min(book_pirce) from book);
