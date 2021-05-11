select current_user;

create schema project_0;
create user mibrahim with password 'revature';
grant create on schema project_0 to mibrahim;
grant all privileges on all tables in schema project_0 to mibrahim;
grant usage on schema project_0 to mibrahim;