select * from customes;

create table Customers (
	code number(4) primary key,
	name varchar2(30) not null,
	email varchar2(30),
	phone varchar2(20)
);