/*
--수정(update)
-- 이미 존재하는 데이터의  값을 바꾸는 작업
-- 개인정보변경, 조회수증가, 구독/해지, 좋아요 , 게시글 수정...

-- update 테이블 이름 set 변경내용 [조건];
 */

-- 모든 상품의 가격을 0원으로 변경
UPDATE  PRODUCT  set PRICE =0;

UPDATE  PRODUCT  set PRICE =0 where TYPE ='과자';
UPDATE  PRODUCT  set PRICE =0, name = '증정품' where TYPE ='과자';
--지금까지의 작업을 무효화 시킨다.
rollback;
--지금 작업을 확정 저장하겠다( 주의 한번 커밋하면 계속 커밋을 해서 저장해야한다.)
commit;


UPDATE  PRODUCT  set PRICE = 1500 where no=1;
UPDATE  PRODUCT  set PRICE  = 2000 where name = '스크류바';
UPDATE  PRODUCT  set PRICE  = 1000, set TYPE ='과자' where  name = '멘토스';
UPDATE  PRODUCT  set PRICE  = PRICE -500 where TYPE= '과자';
UPDATE  PRODUCT  set PRICE  = PRICE*1.1 where TYPE= '아이스크림';
