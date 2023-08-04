--몬스터와 속성(1대 다 관계) 구현
CREATE table pocketmon(
no number primary key,
name varchar2(30) not null
);

CREATE  table pocketmon_type(
type varchar2(30) not null,
no references pocketmon(no) --외래키(FK, Foreign Key)
);

INSERT  into pocketmon(no, name) values(1,'이상해씨');
INSERT  into Pocketmon_type(type, no) values('풀',1);
INSERT  into Pocketmon_type(type, no) values('독',1);
commit;

SELECT * FROM pocketmon where no = 1;
SELECT * FROM pocketmon_type where no = 1;


CREATE table quiz(
quiz_no number primary key,
quiz_content varchar2(300) not null
);

CREATE TABLE choice(
choice_no number primary key,
choice_content varchar(30),
choice_correct char(1) check(upper(choice_correct) in('Y','N')),
-- 외래키 설정시 부여가능한 옵션
-- 아무것도 안붙히면 하위 요소를 지워야 상위요소가 삭제됨
-- on DELETE cascade를 붙히면 상위요소를 지우면 하위요소도 같이 삭제된다.
-- on DELETE set null를 붙히면 상위요소를 지우면 외래키가 null로 바뀜
quiz_no REFERENCES quiz(quiz_no) on DELETE cascade
);
DROP  table choice;
DROP  table quiz;
INSERT  into quiz(quiz_no,quiz_content) values(1,'한국의 수도는?');
INSERT  into choice(choice_no, choice_content, choice_correct, quiz_no) values(1,'서울','y',1);
INSERT  into choice(choice_no, choice_content, choice_correct, quiz_no) values(2,'평양','n',1);
INSERT  into choice(choice_no, choice_content, choice_correct, quiz_no) values(3,'홍콩','n',1);
INSERT  into choice(choice_no, choice_content, choice_correct, quiz_no) values(4,'도쿄','n',1);
SELECT  * FROM  quiz where quiz_no =1 ;
SELECT  * FROM  choice where quiz_no =1 ;
