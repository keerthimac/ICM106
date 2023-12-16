CREATE DATABASE gift;

USE gift;


CREATE TABLE employee(
emp_no VARCHAR(10),
emp_name VARCHAR(10),
salary DECIMAL(10,2),
CONSTRAINT PRIMARY KEY (emp_no)
);

DESC employee;

CREATE TABLE gift(
    gift_code VARCHAR(10),
    gift_name VARCHAR(10),
    emp_no VARCHAR(10),
    CONSTRAINT PRIMARY KEY(gift_code),
    CONSTRAINT FOREIGN KEY(emp_no) REFERENCES employee(emp_no)
);

DESC gift;
DROP TABLE gift;

INSERT INTO employee VALUES
('E001','KAMAL',60000),
('E002','AMAL',60000),
('E003','NIMAL',60000),
('E004','KASUN',60000),
('E005','ANIL',60000);

SELECT * FROM employee;

INSERT INTO gift VALUES
('G001','Watch','E001'),
('G002','Band','E002'),
('G003','cap','E003'),
('G004','bottle','E002'),
('G005','bag','E001'),
('G006','pen','E001'),
('G007','pencil','E002'),
('G008','a4 Bundle','E003'),
('G009','marker','E002'),
('G010','calculator','E001');


SELECT employee.emp_name, gift.gift_code,gift.gift_name
FROM employee
INNER JOIN gift
ON employee.emp_no = gift.emp_no;

SELECT employee.emp_name, gift.gift_code,gift.gift_name
FROM employee
LEFT JOIN gift
ON employee.emp_no = gift.emp_no;

SELECT employee.emp_name, gift.gift_code,gift.gift_name
FROM employee
RIGHT JOIN gift
ON employee.emp_no = gift.emp_no;

SELECT employee.emp_name, gift.gift_code,gift.gift_name
FROM employee
FULL OUTER JOIN gift
ON employee.emp_no = gift.emp_no
WHERE employee.salary > 50000;


--Extra

DROP DATABASE IF EXISTS GroceryStore;

CREATE DATABASE GroceryStore;

SHOW DATABASES;

USE GroceryStore;

CREATE TABLE Customer(
	customerId VARCHAR(6) NOT NULL,
	name VARCHAR(30),
	address VARCHAR(30),
	salary DECIMAL(10,2),
	CONSTRAINT PRIMARY KEY (customerId)
);

DESC Customer;


INSERT INTO Customer VALUES('C001','Danapala','Panadura',54000);

INSERT INTO Customer VALUES('C002','Gunapala','Matara',44000);

INSERT INTO Customer VALUES('C003','Somapala','Galle',82000);

INSERT INTO Customer VALUES('C004','Siripala','Galle',24000);

INSERT INTO Customer VALUES('C005','Jinadasa','Panadura',94000);

INSERT INTO Customer VALUES('C006','Sepalika','Kalutara',58000);

