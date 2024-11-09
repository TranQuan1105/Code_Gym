create database LuyenTapCacHam;
use LuyenTapCacHam;

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
VALUES (1, 'Toan', 5, 1),
 (2, 'Ly', 4, 1),
 (3, 'Hoa', 5, 1),
 (4, 'Tieng Anh', 10, 1);
 
 -- Thêm dữ liệu vào bảng Mark
 INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
 (1, 3, 10, 2),
 (2, 1, 7, 1);


									
									-- LUYỆN TẬP CÁC HÀM THÔNG DỤNG TRONG SQL --

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *
from Subject
where Credit = (select max(Credit) from Subject);


-- Hiển thị các thông tin môn học có điểm thi lớn nhất
SELECT s.*, m.Mark
FROM Subject s
JOIN Mark m ON s.SubID = m.SubID
WHERE m.Mark = (SELECT MAX(Mark) FROM Mark);

-- Hiển thị thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
