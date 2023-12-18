USE gift;


CREATE TABLE Customer(
ID INT,
Name VARCHAR(10),
Age INT,
Address VARCHAR(20),
Salary DECIMAL(10,2),
CONSTRAINT PRIMARY KEY (ID)
);

DESC Customer;


CREATE TABLE Orders(
OID INT,
Date DATE, 
Customer_ID INT,
Amount DECIMAL(10,2),
CONSTRAINT PRIMARY KEY (OID),
CONSTRAINT FOREIGN KEY(Customer_ID) REFERENCES Customer(ID)
);

INSERT INTO Customer VALUES
(1, 'Ramesh', 32, 'Ahmedabad', 2000.00 ),
(2, 'Khilan', 25, 'Delhi', 1500.00 ),
(3, 'Kaushik', 23, 'Kolkata', 2000.00 ),
(4, 'Chaitali', 25, 'Mumbai', 6500.00 ),
(5, 'Hardik', 27, 'Bhopal', 8500.00 ),
(6, 'Komal', 22, 'Hyderabad', 4500.00 ),
(7, 'Muffy', 24, 'Indore', 10000.00 );


INSERT INTO Orders VALUES
(102, '2009-10-08', 3, 3000.00),
(100, '2009-10-08', 3, 1500.00),
(101, '2009-11-20', 2, 1560.00),
(103, '2008-05-20', 4, 2060.00);



DESC orders;

SELECT Customer.id, Customer.name, Orders.date, orders.amount
FROM Customer
INNER JOIN orders
ON
Customer.id=orders.Customer_ID;

SELECT Customer.id, Customer.name, Orders.date, orders.amount
FROM Customer
INNER JOIN orders
ON
Customer.id=orders.Customer_ID
WHERE orders.Amount > 2000;

SELECT Customer.id, Customer.name, Orders.date, orders.amount
FROM Customer
INNER JOIN orders
ON
Customer.id=orders.Customer_ID
WHERE orders.Amount BETWEEN 1550 AND 4000;

SELECT Customer.id, Customer.name, Orders.date, orders.amount
FROM Customer
INNER JOIN orders
ON
Customer.id=orders.Customer_ID
WHERE Customer.Name = 'Kaushik';

SELECT Customer.id, Customer.name, Orders.date, orders.amount
FROM Customer
LEFT JOIN orders
ON
Customer.id=orders.Customer_ID;

SELECT Customer.id, Customer.name, Orders.date, orders.amount
FROM Customer
LEFT JOIN orders
ON
Customer.id=orders.Customer_ID;


CREATE TABLE Seller(
SellerID INT,
Seller_NAME VARCHAR(10),
code INT,
Order_ID INT,
CONSTRAINT PRIMARY KEY (SellerID),
CONSTRAINT FOREIGN KEY(Order_ID) REFERENCES Orders(OID)
);

DESC Seller;


INSERT INTO Seller VALUES
(1000, 'SARIKA', 4500, 102),
(1001, 'ALEKHYA', 3623, 100),
(1002, 'REVATHI', 1291, 101),
(1003, 'VIVEK', 3426, 103);

SELECT Customer.id, Customer.name, orders.amount,Orders.date,Seller.Seller_NAME
FROM Customer
INNER JOIN orders
ON Customer.ID=orders.Customer_ID
INNER JOIN Seller
ON Orders.OID=seller.order_ID;

SELECT Customer.id, Customer.name, orders.amount,Orders.date,Seller.Seller_NAME
FROM Customer
INNER JOIN orders
ON Customer.ID=orders.Customer_ID
INNER JOIN Seller
ON Orders.OID=seller.order_ID
WHERE Orders.date = '2008-05-20';

SELECT Customer.id, Customer.name, orders.amount,Orders.date,Seller.Seller_NAME
FROM Customer
INNER JOIN orders
ON Customer.ID=orders.Customer_ID
INNER JOIN Seller
ON Orders.OID=seller.order_ID
WHERE Orders.date = '2009-10-08' AND Orders.Amount>2000;














