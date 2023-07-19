CREATE  table customer(
customer_no number primary key,
customer_id varchar2(30) not null check(regexp_like(customer_id,'^[a-zA-Z0-9]{8,20}$')),
customer_call char(13) not null check(regexp_like(customer_call,'^010-[0-9]{3,4}-[0-9]{4}$')),
customer_input char(10) not null,
customer_last_buy char(10) not null,
customer_point number check(customer_point>=0),
customer_level varchar2(12) not null check(customer_level in ('일반','VIP','VVIP','플래티넘')),
unique(customer_id,customer_call)
);

drop table customer;
drop sequence customer_seq; 
SELECT * from customer;
create sequence customer_seq; 

INSERT  INTO  customer(customer_no,customer_id,customer_call,
customer_input,customer_last_buy,customer_point,customer_level)
values (customer_seq.nextval,'testuser1', '010-1212-3434','2022-01-01','2022-03-11',5500, 'VIP');
INSERT  INTO  customer(customer_no,customer_id,customer_call,
customer_input,customer_last_buy,customer_point,customer_level)
values (customer_seq.nextval,'testuser2', '010-2323-4545','2020-05-11','2022-01-30',7200, 'VVIP');
INSERT  INTO  customer(customer_no,customer_id,customer_call,
customer_input,customer_last_buy,customer_point,customer_level)
values (customer_seq.nextval,'testuser3', '010-3434-5656','2021-11-26','2021-12-25',30000, '플래티넘');
INSERT  INTO  customer(customer_no,customer_id,customer_call,
customer_input,customer_last_buy,customer_point,customer_level)
values (customer_seq.nextval,'testuser4', '010-4545-6767','2022-02-03','2022-03-15',500, '일반');
INSERT  INTO  customer(customer_no,customer_id,customer_call,
customer_input,customer_last_buy,customer_point,customer_level)
values (customer_seq.nextval,'testuser5', '010-5656-7878','2021-12-31','2022-01-31',800, '일반');
