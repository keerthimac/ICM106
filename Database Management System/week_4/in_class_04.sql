DROP DATABASE IF EXISTS shop;

CREATE DATABASE shop;

SHOW DATABASES;

USE shop;

CREATE TABLE Customer(
	customerId VARCHAR(6) NOT NULL,
	name VARCHAR(30),
	address VARCHAR(30),
	salary DECIMAL(10,2),
	CONSTRAINT PRIMARY KEY (customerId)
);

DESC Customer;

======================================================

INSERT INTO Customer VALUES('C001','Danapala','Panadura',54000);

INSERT INTO Customer VALUES('C002','Gunapala','Matara',44000);

INSERT INTO Customer VALUES('C003','Somapala','Galle',82000);

INSERT INTO Customer VALUES('C004','Siripala','Galle',24000);

INSERT INTO Customer VALUES('C005','Jinadasa','Panadura',94000);

INSERT INTO Customer VALUES('C006','Somapala','Kalutara',58000);



CREATE TABLE Customer1(
	customerId VARCHAR(6) NOT NULL,
	name VARCHAR(30),
	address VARCHAR(30),
	salary DECIMAL(10,2),
	CONSTRAINT PRIMARY KEY (customerId)
);


DESC Customer1;

INSERT INTO Customer1 SELECT * FROM Customer;

SELECT * FROM Customer1;



INSERT INTO Customer(customerId, name, address) VALUES ('C007','Sepali','Matara');


INSERT INTO Customer VALUES('C008','Jinasena','Ambalangoda',51000);

INSERT INTO Customer VALUES('C009','Somadasa','Baddegama',34000);

INSERT INTO Customer VALUES('C010','Siripala','Moratuwa',29000);

INSERT INTO Customer VALUES('C011','Somasiri','Kandy',64000);

CREATE TABLE Customer2(
	customerId VARCHAR(6) NOT NULL,
	name VARCHAR(30),
	address VARCHAR(30),
	salary DECIMAL(10,2),
	CONSTRAINT PRIMARY KEY (customerId)
);

DESC Customer2;

INSERT INTO Customer2 (customerId, name)
SELECT customerId, name
FROM Customer;

SELECT * FROM Customer2;



-------------------------------------------------------
CREATE TABLE CustomerDetails AS SELECT * FROM Customer;

SELECT * FROM CustomerDetails;

-------------##########--------------------

DELETE FROM CustomerDetails; 

SELECT * FROM CustomerDetails;

SHOW TABLES;



CREATE TABLE Customer3 AS SELECT * FROM Customer;

SELECT * FROM Customer3;


-----------------------------------------------------------
DESC Customer3;

UPDATE Customer1 SET address='Colombo';

SELECT * FROM Customer1; 

-------------------------------------------------------------

UPDATE Customer1 SET address='Panadura' WHERE name='Danapala';

SELECT * FROM Customer1; 

-------------------------------------------------------------

UPDATE Customer SET address='Kaluthara' WHERE customerId='c007';

SELECT * FROM Customer; 

--------------------------------------------------------------
-------------COPY ALL RECORDS AGAIN----------------------

INSERT INTO CustomerDetails SELECT * FROM Customer;

SELECT * FROM CustomerDetails;

DELETE FROM CustomerDetails WHERE name='Somapala'; 

DELETE FROM CustomerDetails WHERE name='Siripala' AND customerId='C004';

SELECT * FROM CustomerDetails;

UPDATE CustomerDetails SET salary=50000.00 WHERE name= 'Danapala' AND customerId='c001'

UPDATE CustomerDetails SET address='Galle' WHERE address= 'Matara';

UPDATE CustomerDetails SET salary=30000.00 WHERE customerId='C007' AND name='Sepali';

UPDATE CustomerDetails SET salary=30000.00 WHERE salary>50000.00;

DELETE FROM CustomerDetails WHERE name='Jinadasa' OR address='panadura';

TRUNCATE TABLE  CustomerDetails;


SELECT * FROM CustomerDetails;
DESC CustomerDetails;
SHOW TABLES;


----------------------------------------

CREATE TABLE CustomerDetails AS SELECT * FROM Customer;

SELECT * FROM CustomerDetails;


INSERT INTO CustomerDetails SELECT * FROM Customer;

SELECT * FROM CustomerDetails;



SELECT COUNT(name) FROM CustomerDetails;

SELECT COUNT(salary) FROM CustomerDetails;


CREATE TABLE Student(
	studentId INT AUTO_INCREMENT,
	name VARCHAR(30),
	address VARCHAR(30),
	CONSTRAINT PRIMARY KEY (studentId)
);

DESC Student;


INSERT INTO Student VALUES(1,'Siripala','Mathara');
INSERT INTO Student (name,address) VALUES('Somapala','Galle');

INSERT INTO Student (name,address) VALUES('Danapala','panadura');

SELECT * FROM Student;

INSERT INTO Student VALUES(2000,'Darshana','kandy');
INSERT INTO Student (name,address) VALUES('Ahen','Peradeniya');

INSERT INTO Student (name,address) VALUES('Dilsha','Gampola');



------------------------------------------------------------------

SELECT * FROM Student;

SELECT studentId FROM Student;

SELECT studentId,name FROM Student;

SELECT studentId,name AS 'StudentName' FROM Student;

SELECT studentId AS 'StudentID' FROM Student;

-----------------------------------------------------------------------

SELECT customerId,name,address,salary,(salary*3/100) AS ETF FROM CustomerDetails;

SELECT customerId,name,address,salary,(salary*3/100) AS ETF,(salary-(salary*0.03)) AS NetSalary FROM CustomerDetails;


//////////error
SELECT customerId,name,address,salary,(salary*3/100) AS ETF,(salary-ETF) AS NetSalary FROM CustomerDetails;