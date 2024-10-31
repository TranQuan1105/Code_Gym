create database c0624;
use c0624;
-- Tao bang student cos name, dob, gender, point\
CREATE TABLE student (
    name VARCHAR(50),
    dob DATE,
    gender BIT,
    point DOUBLE
);

-- Thao tac voi du lieu trong bang DML
insert into student (name, dob, gender, point)
values ("Tran Quan", "2005-11-5", 1, 5),
		("Thanh Cong", "2000-01-01", 1, 6),
		("Van Tai", "2004-01-01", 1, 7);

SELECT 
    *
FROM
    student;

set sql_safe_updates = 0;-- Tat chuc nang safe update, vi safe update chi cho phep update voi khoa chinh (main key)

UPDATE student 
SET 
    point = 7
WHERE
    name = 'Thanh Cong';

-- DELETE FROM student 
-- WHERE
--     name = 'Van Tai';