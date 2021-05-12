--show search_path;
--set search_path to project_0; -- prevents us from having to explicitly target the chinook when creating objects
--select current_user; -- show us what current users we are using

create table test_table (
	id int not null,
	test varchar(20)
);

drop table test_table;
select * from test_table;

create table customer(
	user_id serial,
	username varchar(25) unique not null,
	password varchar(50) not null,
	email varchar(50) unique not null,
	first_name varchar not null,
	last_name varchar not null,
	phone_number varchar(16) not null,
	
	constraint pk_users primary key (user_id)
	
);


select * from customer;

create table account(
	account_id serial,
	user_id int,
	account_name varchar not null,
	account_balance numeric(20,2) check (account_balance >= 0.0) not null,
	
	constraint pk_account_id primary key (account_id),
	
	constraint fk_customer_id foreign key (user_id)
	references customer 
);

select * from account;

create table transaction( 
	transaction_id serial,
	account_id int not null,
	user_id int not null,
	transaction_name varchar not null,
	transaction_amount numeric(20,2) check (transaction_amount >= 0) not null,
	account_balance numeric(20,2) not null,
	
	constraint pk_txn_id primary key (transaction_id),
	
	constraint fk_account_id foreign key (account_id)
	references account,
	constraint fk_user_id foreign key (user_id)
	references customer
);

select * from transaction;


