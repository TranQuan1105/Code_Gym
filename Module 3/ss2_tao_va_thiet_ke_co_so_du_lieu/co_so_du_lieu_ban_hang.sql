-- Tạo cơ sở dữ liệu QuanLyBanHang
CREATE DATABASE QuanLyBanHang;
USE QuanLyBanHang;

-- Bảng Customer
CREATE TABLE Customer (
    cID INT PRIMARY KEY,
    cName VARCHAR(100) not null,
    cAge INT
);

-- Bảng Order
CREATE TABLE Orders (
    oID INT PRIMARY KEY,
    cID INT,
    oDate DATE,
    oTotalPrice float,
    FOREIGN KEY (cID) REFERENCES Customer(cID)
);

-- Bảng Product
CREATE TABLE Product (
    pID INT PRIMARY KEY,
    pName VARCHAR(100) not null,
    pPrice float
);

-- Bảng OrderDetail
CREATE TABLE OrderDetail (
    oID INT,
    pID INT,
    odQTY INT,
    PRIMARY KEY (oID, pID),
    FOREIGN KEY (oID) REFERENCES Orders (oID),
    FOREIGN KEY (pID) REFERENCES Product(pID)
);