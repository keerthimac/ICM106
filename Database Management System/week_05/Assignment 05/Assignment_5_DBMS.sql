CREATE DATABASE assignment_05_dbms;

USE assignment_05_dbms;

CREATE TABLE Student(
    student_id INT,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    CONSTRAINT PRIMARY KEY (student_id)
);

DESC Student;

CREATE TABLE student_contact(
    student_id INT,
    email_address VARCHAR(30),
    contact VARCHAR(15),
    CONSTRAINT PRIMARY KEY (student_id),
    CONSTRAINT FOREIGN KEY (student_id) REFERENCES Student(student_id)
);

DESC student_contact;

INSERT INTO Student VALUES
(1,'Kamal','Perera'),
(2,'Nimal','Samson'),
(3,'Amal','Perera'),
(4,'Roy','Silva');

SELECT * FROM Student;

INSERT INTO student_contact VALUES
(1,'kamal@school.edu','77234512'),
(2,'nimal@school.edu','77456396'),
(3,'amal@school.edu','077743566');

SELECT * FROM student_contact;
SELECT student_id, first_name FROM Student;

SELECT Student.student_id, Student.first_name, student_contact.email_address AS Email
FROM Student 
INNER JOIN student_contact
ON Student.student_id = student_contact.student_id;

SELECT CONCAT(Student.first_name,' ', Student.last_name) AS "Full Name", student_contact.email_address
FROM Student 
INNER JOIN student_contact
ON Student.student_id = student_contact.student_id;

SELECT Student.student_id, Student.first_name, student_contact.email_address AS Email
FROM Student 
INNER JOIN student_contact
ON Student.student_id = student_contact.student_id
WHERE first_name LIKE  '%mal%';

--------------------------------------------------------------
CREATE TABLE DepartmentInfo(
    DepartmentID INT,
    DepartmentName VARCHAR(20),
    CONSTRAINT PRIMARY KEY (DepartmentID)
);

DESC DepartmentInfo;

CREATE TABLE StudentInfo(
    StudentID INT,
    StudentName VARCHAR(20),
    DepartmentID INT,
    CONSTRAINT PRIMARY KEY (StudentID),
    CONSTRAINT FOREIGN KEY (DepartmentID) REFERENCES DepartmentInfo(DepartmentID)
);

DESC StudentInfo;

CREATE TABLE CourseInfo(
    CourseID INT,
    CourseName VARCHAR(30),
    DepartmentID INT,
    CONSTRAINT PRIMARY KEY (CourseID),
    CONSTRAINT FOREIGN KEY (DepartmentID) REFERENCES DepartmentInfo(DepartmentID)
);

DESC CourseInfo;

INSERT INTO DepartmentInfo VALUES
(101,'Computer Science'),
(102,'Mathematics'),
(103,'History');

SELECT * FROM DepartmentInfo;

INSERT INTO StudentInfo VALUES
(1,'Alice',101),
(2,'Bob',102),
(3,'Carol',101),
(4,'Dave',103);

SELECT * FROM StudentInfo;

INSERT INTO CourseInfo VALUES
(1,'Database Systems',101),
(2,'Calculus',102),
(3,'World History',103);

SELECT * FROM CourseInfo;

SELECT StudentName, DepartmentName
FROM StudentInfo
INNER JOIN DepartmentInfo
ON
DepartmentInfo.DepartmentID =  StudentInfo.DepartmentID;


SELECT StudentName, DepartmentName
FROM StudentInfo
LEFT JOIN DepartmentInfo
ON
DepartmentInfo.DepartmentID =  StudentInfo.DepartmentID;

SELECT DepartmentName, StudentName 
FROM DepartmentInfo
LEFT JOIN StudentInfo
ON
DepartmentInfo.DepartmentID =  StudentInfo.DepartmentID;

SELECT DepartmentName, StudentName 
FROM DepartmentInfo
LEFT JOIN StudentInfo
ON
DepartmentInfo.DepartmentID =  StudentInfo.DepartmentID;

SELECT DepartmentName,COUNT(*) AS Student_Count
FROM DepartmentInfo
LEFT JOIN StudentInfo
ON
DepartmentInfo.DepartmentID =  StudentInfo.DepartmentID
GROUP BY DepartmentName;

SELECT DepartmentName, COUNT(*) AS student_count
FROM DepartmentInfo
LEFT JOIN StudentInfo ON DepartmentInfo.DepartmentID = StudentInfo.DepartmentID
GROUP BY DepartmentName;

SELECT StudentName,CourseName, DepartmentName
FROM DepartmentInfo
INNER JOIN CourseInfo ON CourseInfo.DepartmentID = DepartmentInfo.DepartmentID
INNER JOIN StudentInfo ON DepartmentInfo.DepartmentID = StudentInfo.DepartmentID;

SELECT StudentName AS "Student Enrolled to Computer Science"
FROM StudentInfo
INNER JOIN DepartmentInfo ON DepartmentInfo.DepartmentID = StudentInfo.DepartmentID
WHERE DepartmentName = "Computer Science";


SELECT DepartmentName, COUNT(*) AS student_count
FROM DepartmentInfo
LEFT JOIN StudentInfo ON DepartmentInfo.DepartmentID = StudentInfo.DepartmentID
GROUP BY DepartmentName
HAVING COUNT(*) > 1;

SELECT StudentName AS "Student Who Taking DataBase Systems Course"
FROM DepartmentInfo
INNER JOIN StudentInfo ON DepartmentInfo.DepartmentID = StudentInfo.DepartmentID
INNER JOIN CourseInfo ON CourseInfo.DepartmentID = DepartmentInfo.DepartmentID
WHERE DepartmentInfo.DepartmentName = "Computer Science" AND CourseInfo.CourseName = "Database Systems";

-----------------------------------------------------------------------------------------------

CREATE TABLE Author(
    AuthorID INT,
    AuthorName VARCHAR(30),
    Country VARCHAR(10),
    CONSTRAINT PRIMARY KEY (AuthorID)
);

DESC Author;

CREATE TABLE Book(
    BookID INT,
    Title VARCHAR(40),
    AuthorID INT,
    PublicationYear INT,
    CONSTRAINT PRIMARY KEY (BookID),
    CONSTRAINT FOREIGN KEY (AuthorID) REFERENCES Author(AuthorID)
);

DESC Book;

CREATE TABLE Reader(
    ReaderID INT,
    ReaderName VARCHAR(30),
    BookID INT,
    CONSTRAINT PRIMARY KEY (ReaderID),
    CONSTRAINT FOREIGN KEY (BookID) REFERENCES Book(BookID)
);

DESC Reader;

INSERT INTO Author VALUES
(1,'John Smith','USA'),
(2,'Emily Brown','UK'),
(3,'Maria Lopez','Spain');

SELECT * FROM Author;

INSERT INTO Book VALUES
(1,'The Book of Life',1,2020),
(2,'Secrets Revealed',2,2019),
(3,'Mystery Tales',1,2022),
(4,'Spanish Cuisine',3,2021);

SELECT * FROM Book;

INSERT INTO Reader VALUES
(101,'Alice',1),
(102,'Bob',2),
(103,'Carol',3),
(104,'David',1);

SELECT * FROM Reader;

SELECT Author.AuthorName, COUNT(Book.BookID) AS BooksPublished
FROM Author
INNER JOIN Book
ON Author.AuthorID = Book.AuthorID
GROUP BY Author.AuthorID, Author.AuthorName
HAVING COUNT(Book.BookID) > 0;

SELECT Author.AuthorName, COUNT(Book.BookID) AS TotalBooks
FROM Author
LEFT JOIN Book ON Author.AuthorID = Book.AuthorID
GROUP BY Author.AuthorID, Author.AuthorName;

SELECT Book.Title,Book.PublicationYear,Author.AuthorName
FROM Book
INNER JOIN Author ON Book.AuthorID = Author.AuthorID
WHERE Book.PublicationYear < 2020;

SELECT Reader.ReaderName,Book.Title
FROM Reader
INNER JOIN Book 
ON Reader.BookID = Book.BookID
WHERE Reader.ReaderID = 101 OR Reader.ReaderID = 102;

SELECT Reader.ReaderName,Book.Title
FROM Reader
INNER JOIN Book 
ON Reader.BookID = Book.BookID
WHERE (Reader.ReaderID = 101 OR Reader.ReaderID = 102) AND Book.BookID = 2;

SELECT
    Reader.ReaderName,
    Book.Title
FROM
    Reader
JOIN
    Book ON Reader.BookID = Book.BookID
WHERE
    (Reader.ReaderID = 101 OR Reader.ReaderID = 102) AND Book.BookID = 2;


