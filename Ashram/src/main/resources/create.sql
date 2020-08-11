alter table student drop foreign key FK6d29gtm2iqoi4j3m3vgs5d55m;
drop table if exists student;
drop table if exists teacher;
create table student (roll_no integer not null auto_increment, email varchar(255) not null, full_name varchar(255) not null, password varchar(255) not null, profle_pic blob, teacher_id integer,  primary key (roll_no));
create table teacher (id integer not null auto_increment, email varchar(100) not null, full_name varchar(100) not null, profile_pic blob, primary key (id));
alter table student add constraint UK_fe0i52si7ybu0wjedj6motiim unique (email);
alter table student add constraint FK6d29gtm2iqoi4j3m3vgs5d55m foreign key (teacher_id) references teacher (id);
alter table teacher add constraint  UK_teacher_email unique(email);

