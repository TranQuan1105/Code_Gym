create database demo;
use demo;

-- Tao bang student co id,name,age,country
CREATE TABLE student (id int, name VARCHAR(200), age int, country varchar(50));

-- Them thong tin vao bang Student da tao
insert into student (id, name, age, country)
values (1, "Tran Quan", 19, "Da Nang"),
		(2, "Thanh Cong", 33 , "Quang Nam"),
		(3, "Van Tai", 20, "Da Nang");