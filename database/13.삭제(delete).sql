/*
-- 삭제(delete)
-- 데이터 베이스에 저장된 값을 영구적으로 제거하는 것
-- commit / rollback에 영향을 받음
--delete from 테이블 이름 [조건]
*/

delete FROM PRODUCT where no =1;
DELETE  from PRODUCT where TYPE ='과자' or type = '아이스크림';
DELETE  from PRODUCT where made  BETWEEN to_date('2020-01-01','yyyy-mm-dd') 
and to_date('2020-06-30','yyyy-mm-dd');

SELECT  * FROM  PRODUCT ;
rollback;
