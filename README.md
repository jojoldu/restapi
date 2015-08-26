# restapi
스터디용 REST API

#Member Query

create table member(
	idx int(11) not null auto_increment primary key,
	id varchar(200) not null unique,
	password varchar(200) not null,
	name varchar(200) not null,
	email varchar(200) not null,
	birth_date datetime,
	join_date datetime,
	update_ddate datetime
);
