/*
-- 정렬(order)
--모든 조회가 끝나고 나온 결화를 원하는 목적에 따라 재배열
asc 는 오름차순(작은게 먼저) desc는 내림차순(큰게 먼저)
만약 둘다 안쓰면 오름차순으로 정렬
*/
SELECT  * FROM  PRODUCT order by no ;
SELECT  * FROM  PRODUCT order by no asc;
SELECT  * FROM  PRODUCT order by no desc;

--2차 정렬(1차가 먼저 실행되고 같은 값이면 2차로 만든게 우선순위가 된다)
SELECT  * from PRODUCT order by price desc, no asc;



SELECT  * from PRODUCT order by made desc;
SELECT  * from PRODUCT order by EXPIRE asc;
SELECT  * from PRODUCT order by name asc;
SELECT  * from PRODUCT order by Type asc, PRICE desc;
SELECT  * from PRODUCT order by EXPIRE-made+1 asc;

-- 부여한 별칭으로 정렬 가능
--*와일드 카드는 다른항목과 같이 쓸수 없고 테이블이름에 .*를 추가하여 사용가능하다
-- 테이블에도 별칭 부여가 가능하다.
SELECT p.*, expire-made +1 유통기한
from PRODUCT p
order by 유통기한 asc, no asc;
