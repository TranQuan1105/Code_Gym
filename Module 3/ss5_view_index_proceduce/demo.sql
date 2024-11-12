create database demo;
use demo;

CREATE TABLE products (
    id CHAR(4) PRIMARY KEY,
    productcode VARCHAR(50) NOT NULL,
    productname VARCHAR(100) NOT NULL,
    productprice FLOAT NOT NULL,
    productamount INT NOT NULL,
    productdescription TEXT,
    productstatus BIT DEFAULT 1
);



insert into products (id, productcode, productname, productprice, productamount, productdescription, productstatus)
values
('1', 'a', 'SanPham1', 100, 10, 'Description for product 1', 1),
('2', 'b', 'SanPham2', 200, 10, 'Description for product 2', 0),
('3', 'c', 'SanPham3', 300, 10, 'Description for product 3', 0);

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index idx_productcode on products (productcode);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index idx_productname_price on products (productname, productprice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
	-- Trước khi tạo index
EXPLAIN SELECT * FROM Products WHERE productName = 'Product A' AND productPrice = 100.00;
	-- Sau khi tạo index
EXPLAIN SELECT * FROM Products WHERE productName = 'Product A' AND productPrice = 100.00;

-- So sánh câu truy vấn trước và sau khi tạo index

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view product_view as
select productcode, productname, productprice, productstatus
from products;

-- Tiến hành sửa đổi view
create or replace view product_view as
select productcode, productname, productprice, productstatus, productamount
from products;

-- Tiến hành xoá view
drop view if exists product_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //

CREATE PROCEDURE GetAllProducts()
BEGIN
    SELECT * FROM Products;
END //

DELIMITER ;

-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //

CREATE PROCEDURE AddProduct(
    IN pCode VARCHAR(50),
    IN pName VARCHAR(100),
    IN pPrice DECIMAL(10, 2),
    IN pAmount INT,
    IN pDescription TEXT,
    IN pStatus BOOLEAN
)
BEGIN
    INSERT INTO Products (productCode, productName, productPrice, productAmount, productDescription, productStatus)
    VALUES (pCode, pName, pPrice, pAmount, pDescription, pStatus);
END //

DELIMITER ;

-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //

CREATE PROCEDURE UpdateProductById(
    IN pId INT,
    IN pCode VARCHAR(50),
    IN pName VARCHAR(100),
    IN pPrice DECIMAL(10, 2),
    IN pAmount INT,
    IN pDescription TEXT,
    IN pStatus BOOLEAN
)
BEGIN
    UPDATE Products
    SET productCode = pCode,
        productName = pName,
        productPrice = pPrice,
        productAmount = pAmount,
        productDescription = pDescription,
        productStatus = pStatus
    WHERE Id = pId;
END //

DELIMITER ;

-- Tạo store procedure xoá sản phẩm theo id
DELIMITER //

CREATE PROCEDURE DeleteProductById(IN pId INT)
BEGIN
    DELETE FROM Products WHERE Id = pId;
END //

DELIMITER ;