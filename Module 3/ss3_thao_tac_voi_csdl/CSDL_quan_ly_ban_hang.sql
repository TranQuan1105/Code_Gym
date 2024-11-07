create database CsdlQuanLyBanHang;
use CsdlQuanLyBanHang;

-- Bảng Customer
CREATE TABLE Customer (
    cID INT PRIMARY KEY,
    cName VARCHAR(25) NOT NULL,
    cAge INT
)

-- Bảng Order
CREATE TABLE Orders (
    oID INT PRIMARY KEY,
    cID INT,
    oDate DateTime,
    oTotalPrice INT,
    FOREIGN KEY (cID) REFERENCES Customer(cID)
);

-- Bảng Product
CREATE TABLE Product (
    pID INT PRIMARY KEY,
    pName VARCHAR(25) not null,
    pPrice int
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


						-- Thao tác với CSDL quản lý bán hàng --

insert into Customer (cID, cName, cAge)
values (1, 'Minh Quan', 10),
(2, 'Ngoc Oanh', 20),
(3, 'Hong Ha', 50);

insert into Orders (oID, cID, oDate, oTotalPrice) 
values (1, 1, '2006-3-21', Null),
(2, 2, '2006-3-23', Null),
(3, 1, '2006-3-16', Null);

insert into Product (pID, pName, pPrice)
values (1, 'May Giat', 3),
(2, 'Tu Lanh', 5),
(3, 'Dieu Hoa', 7),
(4, 'Quat', 1),
(5, 'Bep Dien', 2);

insert into OrderDetail(oID, pID, odQTY)
values (1, 1, 3),
(1, 3, 7),
(1, 4, 2),
(2, 1, 1), 
(3, 1, 8),
(2, 5, 4),
(2, 3, 3);

-- Hiển thị các thông tin gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT 
    oID, oDate, oTotalPrice
FROM
    Orders;

-- Hiển thị danh sách các khách hàng, và danh sách sản phẩm được mua bởi các khách
SELECT Customer.cID, Customer.cName, Product.pName, OrderDetail.odQTY
FROM Customer
JOIN Orders ON Customer.cID = Orders.cID
JOIN OrderDetail ON Orders.oID = OrderDetail.oID
JOIN Product ON OrderDetail.pID = Product.pID
ORDER BY Customer.cID;

-- Hiển thị tên nhũng khách hàng không mua bất kỳ một sản phẩm nào
SELECT cName
FROM Customer
WHERE cID NOT IN (SELECT cID FROM Orders);


-- Hiển thị mã hóa đơn, ngày bán và giá tiền từng hóa đơn (giá một hóa đơn được tính bằng tổng giá 
-- bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính bằng odQTY * pPrice) 
SELECT 
    Orders.oID,
    Orders.oDate,
    SUM(OrderDetail.odQTY * Product.pPrice) AS oTotalPrice
FROM
    Orders
        JOIN
    OrderDetail ON Orders.oID = OrderDetail.oID
        JOIN
    Product ON OrderDetail.pID = Product.pID
GROUP BY Orders.oID , Orders.oDate;
