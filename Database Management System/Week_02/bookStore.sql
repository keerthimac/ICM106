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