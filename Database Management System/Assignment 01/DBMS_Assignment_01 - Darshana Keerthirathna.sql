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

SELECT * FROM student;

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

SELECT * FROM book;

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

SELECT * FROM orders;


-- QUESTION 05

CREATE TABLE employee(
employee_id INT,
first_name VARCHAR(20),
last_name VARCHAR(20),
department_id INT
);

INSERT INTO employee (employee_id,first_name,last_name,department_id)
VALUES
(1,'Alice','Johnson',101),
(2,'Bob','Smith',102),
(3,'Charlie','Brown',103)
;

SELECT * FROM employee;
\! cls

-- QUESTION 06

CREATE TABLE product(
product_id INT,
product_name VARCHAR(20),
price DECIMAL,
stock_quantity INT
);

INSERT INTO product(product_id,product_name,price,stock_quantity)
VALUES
(1,'Laptop',899.99,50),
(2,'Smartphone',499.99,100),
(3,'Headphone',79.99,200)
;

SELECT * FROM product;

-- QUESTION 07

CREATE TABLE category(
category_id INT,
category_name VARCHAR(20)
);

INSERT INTO category(category_id,category_name)
VALUES
(1,'Electronic'),
(2,'Books'),
(3,'Clothing')
;

SELECT * FROM category;


-- QUESTION 08

CREATE TABLE invoice(
invoice_id INT,
customer_id INT,
invoice_date DATE,
total_amount DECIMAL
);

INSERT INTO invoice(invoice_id,customer_id,invoice_date,total_amount)
VALUES
(1,201,'2023-04-05',120.50),
(2,202,'2023-05-12',75.25),
(3,203,'2023-06-20',300.00)
;

SELECT * FROM invoice;


-- QUESTION 09

CREATE TABLE event(
event_id INT,
event_name VARCHAR(30),
date DATE,
location VARCHAR(30)
);

INSERT INTO event(event_id,event_name,date,location)
VALUES
(1,'Conference X','2023-07-15','City Hall'),
(2,'Musical Festival','2023-08-22','Park Plaza'),
(3,'Tech Expo','2023-09-10','Convention Center')
;

SELECT * FROM event;


-- QUESTION 10

CREATE TABLE task(
task_id INT,
task_description VARCHAR(40),
due_date DATE
);

INSERT INTO task(task_id,task_description,due_date)
VALUES
(1,'Complete project proposal','2023-10-15'),
(2,'Prepare for meeting with client','2023-11-02'),
(3,'Review and submit report','2023-12-01')
;

SELECT * FROM task;

