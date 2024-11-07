create database QuanLySinhVien;
use QuanLySinhVien;

CREATE TABLE Class (
    ClassID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME NOT NULL,
    Status BIT
);

CREATE TABLE Student (
    StudentID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    StudentName VARCHAR(30) NOT NULL,
    Address VARCHAR(50),
    Phone VARCHAR(20),
    Status BIT,
    ClassID INT NOT NULL,
    FOREIGN KEY (ClassID) REFERENCES Class (ClassID)
);

CREATE TABLE Subject (
    SubID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    SubName VARCHAR(30) NOT NULL,
    Credit TINYINT NOT NULL DEFAULT 1 CHECK (credit >= 1),
    Status BIT DEFAULT 1
);

CREATE TABLE Mark (
    MarkID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    SubID INT NOT NULL,
    StudentID INT NOT NULL,
    UNIQUE (SubID , StudentID),
    Mark FLOAT DEFAULT 0 CHECK (Mark >= 0 and Mark <= 100),
    ExamTimes TINYINT DEFAULT 1,
    FOREIGN KEY (SubID) REFERENCES Subject (SubID),
    FOREIGN KEY (StudentID) REFERENCES Student (StudentID)
);



													     -- THÊM THÔNG TIN VÀO CƠ SỞ DỮ LIỆU --
                                                         
-- Nhập dữ liệu vào bảng Class
INSERT INTO Class (ClassID, ClassName, StartDate, Status)
VALUES (1, 'A1', '2008-12-20', 1),
(2, 'A2', '2008-12-22', 1),
(3, 'B3', current_date, 0);

-- Thêm dữ liệu vào bẳng Student 
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
values ('Hung', 'Ha Noi', '0912113113', 1, 1),
('Hoa', 'Hai phong', '0921423523', 1, 1),
('Manh', 'HCM', '0123123123', 0, 2);

-- Thêm dữ liệu vào bảng Subject
INSERT INTO Subject (SubID, SubName, Credit, Status)
VALUES (1, 'CF', 5, 1),
 (2, 'C', 4, 1),
 (3, 'HDJ', 5, 1),
 (4, 'RDBMS', 10, 1);
 
 -- Thêm dữ liệu vào bảng Mark
 INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
 (1, 2, 10, 2),
 (2, 1, 12, 1);
 
 
 
 
 
 
                                                                    -- TRUY VẤN DỮ LIỆU --
-- 1.Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select *
from Student
where StudentName like 'h%';

-- 2.Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select * 
from Class 
where month(StartDate) = 12;

-- 3.Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * 
from Subject
where credit >= 3 and credit <=5;

-- 4.Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates = 0;
update Student
set ClassID = 2
where StudentName = 'Hung';

-- 5.Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select Student.StudentName, Subject.SubName, Mark.Mark
from Mark 
JOIN Student ON Mark.StudentID = Student.StudentID
JOIN Subject ON Mark.SubID = Subject.SubID
ORDER BY Mark.Mark DESC, Student.StudentName ASC;