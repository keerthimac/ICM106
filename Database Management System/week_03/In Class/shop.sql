CREATE DATABASE gamekade;

USE gamekade;

CREATE TABLE customer(
    customerId VARCHAR(6) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    address VARCHAR(30),
    salary DECIMAL(10,2)
);

DESC Customer;

CREATE TABLE orders(
    orderId VARCHAR(6) PRIMARY KEY,
    orderDate DATE,
    customerId VARCHAR(6),
    CONSTRAINT FOREIGN KEY(customerId) REFERENCES customer(customerId)
);

DESC orders;

CREATE TABLE item(
    itemCode VARCHAR(6) PRIMARY KEY,
    description VARCHAR(30) NOT NULL,
    unitPrice DECIMAL(10,2),
    qtyOnHand INT(10)
);

DESC item;

CREATE TABLE orderDetails(
    orderId VARCHAR(6),
    itemCode VARCHAR(6),
    quantity INT(10),
    CONSTRAINT FOREIGN KEY(orderId) REFERENCES orders(orderId),
    CONSTRAINT FOREIGN KEY(itemCode) REFERENCES item(itemCode),
    CONSTRAINT COMPOSITE PRIMARY KEY(orderId,itemCode)
);

DESC orderDetails;


INSERT INTO customer VALUES('c001','Josapin','Pol Waththa',85000.00);
INSERT INTO customer VALUES('c002','Magilin','Kanattha Para',65000.00);
INSERT INTO customer VALUES('c003','Siripala','7 Kanuwa',95000.00);


INSERT INTO orders VALUES('o001','2023-10-13','c002');
INSERT INTO orders VALUES('o002','2023-10-14','c003');
INSERT INTO orders VALUES('o003','2023-10-14','c001');
INSERT INTO orders VALUES('O004','2023-10-15','c002');
INSERT INTO orders VALUES('O005','2023-10-16','c003');

INSERT INTO item VALUES('i001','Dhal',200.00,50);
INSERT INTO item VALUES('i002','Suger',190.00,100);
INSERT INTO item VALUES('i003','Rice',210.00,150);
INSERT INTO item VALUES('i004','Chocolate Biscuits',95.00,45);
INSERT INTO item VALUES('i005','Onion',160.00,35);

INSERT INTO orderDetails VALUES('o001','i001',1);
INSERT INTO orderDetails VALUES('o001','i003',5);
INSERT INTO orderDetails VALUES('o001','i005',1);
INSERT INTO orderDetails VALUES('o002','i002',2);
INSERT INTO orderDetails VALUES('o002','i003',10);
INSERT INTO orderDetails VALUES('o002','i004',1);
INSERT INTO orderDetails VALUES('o003','i003',5);
INSERT INTO orderDetails VALUES('o003','i002',2);
INSERT INTO orderDetails VALUES('o003','i004',2);







