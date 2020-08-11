--CREATE USER 'root'@'%' IDENTIFIED BY 'root';
--GRANT FILE ON *.* TO 'root'@'%' WITH GRANT OPTION;
--GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
--SET GLOBAL local_infile = 'ON';
--SHOW VARIABLES LIKE "secure_file_priv";
--select @@secure_file_priv;


insert into teacher(full_name,email,profile_pic) values('Swati Haran','hariharan@gmail.com',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\teacher1.jpg'));
insert into teacher(full_name,email,profile_pic) values('Lasya Mallan','krishnamallan@gmail.com',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\teacher2.jpg'));
insert into teacher(full_name,email,profile_pic) values('Mahani Pitta','santhoshpitta@gmail.com',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\teacher3.jpg'));
insert into teacher(full_name,email,profile_pic) values('Vasavi Nallam','vasavinallam@gmail.com',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\teacher4.jpg'));
insert into teacher(full_name,email,profile_pic) values('Chandra Haasain','chandrakishore@gmail.com',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\teacher5.jpg'));
update teacher set profile_pic=LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\book.jpg') where id=5;

INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('balu','s@l.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student1.jpg'),1);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('swati','ff@l.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student2.jpg'),1);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('meghana','ss@l.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student3.jpg'),1);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('viwa','ds@d.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student4.jpg'),2);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('balu','asd@sd.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student5.jpg'),3);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('vishwa','ss@sd.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student6.jpg'),3);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('sakthe','sds@sd.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student7.jpg'),4);
INSERT INTO student(full_name,email,`password`,profle_pic,teacher_id) VALUES('mariya','ssd@sd.com','password',LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\images\\student8.jpg'),5);




