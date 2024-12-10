create database Library_management;
use Library_management;

CREATE TABLE Book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    copiesAmount INT NOT NULL,
    availableCopies INT NOT NULL
);

CREATE TABLE Customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone VARCHAR(20),
    email VARCHAR(255),
    address VARCHAR(255)
);

CREATE TABLE Orders (
    orderId INT AUTO_INCREMENT PRIMARY KEY,
    customerId INT NOT NULL,
    bookId INT NOT NULL,
    borrowDate DATE NOT NULL,
    returnDate DATE,
    FOREIGN KEY (customerId) REFERENCES Customer(id),
    FOREIGN KEY (bookId) REFERENCES Book(id)
);

INSERT INTO book (title, author, category, copies_amount, available_copies)
VALUES 
('To Kill a Mockingbird', 'Harper Lee', 'Fiction', 5, 5),
('1984', 'George Orwell', 'Dystopian', 5, 5),
('Pride and Prejudice', 'Jane Austen', 'Romance', 5, 5),
('The Great Gatsby', 'F. Scott Fitzgerald', 'Classic', 5, 5),
('Moby Dick', 'Herman Melville', 'Adventure', 5, 5);

INSERT INTO customer (name, phone, email, address)
VALUES 
('Nguyen Van A', '0901234567', 'nguyenvana@gmail.com', 'Ha Noi'),
('Tran Thi B', '0987654321', 'tranthib@gmail.com', 'Ho Chi Minh'),
('Nguyen Thanh Cong', '0912345678', 'cong.nguyen@gmail.com', 'Da Nang'),
('Tran Hong Quan', '0934722669', 'quantran11052005@gmail.com', 'Da Nang'),
('Le Van Tai', '0912345678', 'levantai@gmail.com', 'Da Nang');

INSERT INTO orders (customer_id, book_id, borrow_date, return_date)
VALUES 
(1, 1, '2024-12-01', '2024-12-10'), -- Nguyen Van A mượn sách "To Kill a Mockingbird"
(2, 2, '2024-12-02', NULL),         -- Tran Thi B mượn sách "1984" (chưa trả)
(3, 3, '2024-12-03', '2024-12-15'), -- Nguyen Thanh Cong mượn sách "Pride and Prejudice"
(4, 4, '2024-12-04', NULL),         -- Tran Hong Quan mượn sách "The Great Gatsby" (chưa trả)
(5, 5, '2024-12-05', NULL);         -- Le Van Tai mượn sách "Moby Dick" (chưa trả)

-- giam so luong avaiable_copies khi co khach muon
-- DELIMITER $$ 
-- CREATE PROCEDURE borrow_book(IN p_book_id INT)
-- BEGIN
--     DECLARE available INT;
--     -- Lấy số lượng sách còn lại
--     SELECT available_copies INTO available
--     FROM books
--     WHERE book_id = p_book_id;

    -- Kiểm tra nếu còn sách để mượn
--     IF available > 0 THEN
--         UPDATE books
--         SET available_copies = available_copies - 1
--         WHERE book_id = p_book_id;
--     ELSE
--         SIGNAL SQLSTATE '45000'
--         SET MESSAGE_TEXT = 'No available copies for this book';
--     END IF;
-- END$$
-- DELIMITER ;

-- Tang so luong available_copies khi co khach tra
-- DELIMITER $$
-- CREATE PROCEDURE return_book(IN p_book_id INT)
-- BEGIN
    -- Tăng số lượng sách có sẵn
--     UPDATE books
--     SET available_copies = available_copies + 1
--     WHERE book_id = p_book_id;
-- END$$
