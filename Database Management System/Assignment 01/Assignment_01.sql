-- QUESTION 01

CREATE DATABASE university;

use university;


-- QUESTION 02
CREATE TABLE student (
    student_id INT,
    first_name VARCHAR(25),
    last_name VARCHAR(25),
    date_of_birth DATE
);

INSERT INTO student (student_id,first_name,last_name,date_of_birth)
 VALUES
 (1,'John','Doe','1990-05-15'),
 (2,'Jane','Smith','1992-08-22'),
 (3,'Bob','Johnson','1995-02-10')
 ;


-- QUESTION 03

CREATE TABLE book(
    book_id INT,
    title VARCHAR(30),
    author VARCHAR(30),
    publication_year INT
);

INSERT INTO book (book_id,title,author,publication_year)
VALUES
(1,'The Great Gatsby','F. Scott Fitzgerald',1925),
(2,'To Kill a Mockingbird', 'harper Lee',1960),
(3,'1984','George Orwell',1949)
;


-- QUESTION 04

CREATE TABLE orders(
    order_id INT,
    customer_id INT,
    order_date DATE,
    total_amount DECIMAL
);

INSERT INTO orders(order_id,customer_id,order_date,total_amount)
VALUES
(1,101,'2023-01-15',150.75),
(2,102,'2023-02-20',75.50),
(3,103,'2023-03-10',200.25)
;