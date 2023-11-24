CREATE DATABASE book_store;

USE book_store;

CREATE TABLE authors(
    AuthorID INT NOT NULL,
    AuthorName VARCHAR(30) NOT NULL UNIQUE,
    CONSTRAINT PRIMARY KEY(AuthorID)
);
CREATE TABLE categories(
    CategoryID INT NOT NULL,
    CategoryName VARCHAR(20) NOT NULL UNIQUE,
    CONSTRAINT PRIMARY KEY(CategoryID)
);

CREATE TABLE books(
    BookID INT NOT NULL,
    Title VARCHAR(50) NOT NULL UNIQUE,
    AuthorID INT NOT NULL,
    CategoryID INT NOT NULL,
    CONSTRAINT PRIMARY KEY(BookID),
    CONSTRAINT FOREIGN KEY(AuthorID) REFERENCES authors(AuthorID),
    CONSTRAINT FOREIGN KEY(CategoryID) REFERENCES categories(CategoryID)
);


INSERT INTO authors VALUES(1,'J.K. Rowling');
INSERT INTO authors VALUES(2,'Stephen King');
INSERT INTO authors VALUES(3,'Harper Lee');
INSERT INTO authors VALUES(4,'George Orwell');


INSERT INTO categories VALUES(1,'Fantasy');
INSERT INTO categories VALUES(2,'Horror');
INSERT INTO categories VALUES(3,'Classics');
INSERT INTO categories VALUES(4,'Dystopian');


INSERT INTO books VALUES(1,'Harry Potter and the Philosopher`s Stone',1,1);
INSERT INTO books VALUES(2,'The Shining',2,2);
INSERT INTO books VALUES(3,'To Kill a Mockingbird',3,3);
INSERT INTO books VALUES(4,'1984',4,4);



--Shop Tables

CREATE TABLE products(
    ProductID INT NOT NULL,
    ProductName VARCHAR(30) NOT NULL,
    Price DOUBLE(10,2),
    StockQuantity INT,
    CONSTRAINT PRIMARY KEY(ProductID)
);
CREATE TABLE customer(
    CustomerID INT NOT NULL,
    CustomerName VARCHAR(20) NOT NULL,
    Email VARCHAR(20)UNIQUE,
    CONSTRAINT PRIMARY KEY(CustomerID)
);

CREATE TABLE sales(
    SaleID INT NOT NULL,
    ProductID INT NOT NULL,
    CustomerID INT NOT NULL,
    Quantity INT NOT NULL,
    TotalAmount DOUBLE(10,2),
    SaleDate DATE,
    CONSTRAINT PRIMARY KEY(SaleID),
    CONSTRAINT FOREIGN KEY(ProductID) REFERENCES products(ProductID),
    CONSTRAINT FOREIGN KEY(CustomerID) REFERENCES customer(CustomerID)
);

INSERT INTO customer VALUES(1,'John Doe','john@example.com');
INSERT INTO customer VALUES(2,'Jane Smith','jane@example.com');
INSERT INTO customer VALUES(3,'Emily Johnson','emily@example.com');

INSERT INTO products VALUES(1,'T-Shirt',19.99,50);
INSERT INTO products VALUES(2,'Jeans',39.99,30);
INSERT INTO products VALUES(3,'Sneakers',29.99,40);
INSERT INTO products VALUES(4,'Dress',49.99,20);

INSERT INTO sales VALUES(101,1,1,2,39.98,'2023-11-15');
INSERT INTO sales VALUES(102,2,2,1,39.99,'2023-11-16');
INSERT INTO sales VALUES(103,3,3,3,89.97,'2023-11-17');
INSERT INTO sales VALUES(104,4,1,1,49.99,'2023-11-18');

--Cafe

CREATE TABLE menu_items(
    MenuItemID INT NOT NULL,
    ItemName VARCHAR(30) NOT NULL,
    Price DOUBLE(10,2),
    CONSTRAINT PRIMARY KEY(MenuItemID)
);
CREATE TABLE customers(
    CustomerID INT NOT NULL,
    CustomerName VARCHAR(20) NOT NULL,
    Email VARCHAR(20)UNIQUE,
    CONSTRAINT PRIMARY KEY(CustomerID)
);

CREATE TABLE orders(
    OrderID INT NOT NULL,
    MenuItemID INT NOT NULL,
    CustomerID INT NOT NULL,
    Quantity INT NOT NULL,
    TotalAmount DOUBLE(10,2),
    OrderDate DATE,
    CONSTRAINT PRIMARY KEY(OrderID),
    CONSTRAINT FOREIGN KEY(MenuItemID) REFERENCES products(ProductID),
    CONSTRAINT FOREIGN KEY(CustomerID) REFERENCES customers(CustomerID)
);



INSERT INTO menu_items VALUES(1,'Fish Bun',110.00);
INSERT INTO menu_items VALUES(2,'Chicken Bun',130.00);
INSERT INTO menu_items VALUES(3,'Black Coffee',120.00);
INSERT INTO menu_items VALUES(4,'Milk Tea',150.00);


INSERT INTO customers VALUES(1,'Nimal','Nimal@example.com');
INSERT INTO customers VALUES(2,'Kamal','Kamal@example.com');
INSERT INTO customers VALUES(3,'Sunimal','Sunimal@example.com');
INSERT INTO customers VALUES(4,'Rathmal','Rathmal@example.com');


INSERT INTO orders VALUES(120,1,1,2,220.00,'2023-11-17');
INSERT INTO orders VALUES(121,2,2,3,390.00,'2023-11-19');
INSERT INTO orders VALUES(122,3,3,1,120.00,'2023-11-23');
INSERT INTO orders VALUES(123,4,4,1,150.00,'2023-11-28');