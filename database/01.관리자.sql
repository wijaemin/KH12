-- 사용자 생성
CREATE  USER c##jinha  IDENTIFIED BY 1234;



-- 사용자 에게 기본 권한 부여
GRANT CONNECT, resoce, unlimited TABLESPACE TO c##test;

-- 사용자 제거
DROP USER c##minha;
