if(운영자 PC 오라클 버전 21 and 아마존AWS PC 오라클 버전 11) 일경우

디비버 운영자 PC
select * from dba_directories;

CREATE or REPLACE directory DATA_pump_dir as 'C:\';

grant read, write on directory DATA_pump_dir to C##home;

exp userid=system/oracle file="D:/backup.dmp" owner=c##home;
commit;


  
cmd 들어가서  운영자 PC
expdp C##home/home directory=DATA_PUMP_DIR schemas=C##home dumpfile=backup.dmp


디비버 아마존AWS PC
select * from dba_directories;

CREATE or REPLACE directory DATA_pump_dir as 'C:\Users\Administrator\Desktop';

create user c##home identified by home;

grant connect, resource, CREATE view, unlimited tablespace to c##home;
grant read, write on directory DATA_pump_dir to c##home;


  
  
cmd 들어가서  아마존AWS PC
impdp system/oracle directory=DATA_PUMP_DIR dumpfile=BACKUP.DMP






if(운영자 PC 오라클 버전 21 and 아마존AWS PC 오라클 버전 21) 일경우



디비버 운영자 PC
select * from dba_directories;

CREATE or REPLACE directory DATA_pump_dir as 'C:\';

grant read, write on directory DATA_pump_dir to C##home;

exp userid=system/oracle file="D:/backup.dmp" owner=c##home;
commit;
  
cmd 들어가서  운영자 PC
내보낼 경우 : exp userid=system/oracle file=내보낼파일경로 owner=소유계정
exp userid=system/oracle file=C:\Users\user1\backup11.dmp owner=c##home




  
디비버 아마존AWS PC
select * from dba_directories;

CREATE or REPLACE directory DATA_pump_dir as 'C:\Users\Administrator\Desktop';

create user c##home identified by home;

grant connect, resource, CREATE view, unlimited tablespace to c##home;
grant read, write on directory DATA_pump_dir to c##home;

cmd 들어가서  아마존AWS PC
불러올 경우 : imp userid=system/oracle file=불러올파일경로 fromuser=내보낸계정 touser=불러올계정
imp userid=system/oracle file="C:\Users\Administrator\Desktop\backup.dmp" fromuser=c##home touser=c##home

