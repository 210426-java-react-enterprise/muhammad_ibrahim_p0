--show search_path;
--set search_path to project_0; -- prevents us from having to explicitly target the chinook when creating objects
--select current_user; -- show us what current users we are using

create table test_table (
	id int not null,
	test varchar(20)
);

drop table test_table;
select * from test_table;