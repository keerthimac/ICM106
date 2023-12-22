CREATE DATABASE assignment_05_dbms;

USE assignment_05_dbms;

CREATE TABLE Student(
    student_id INT,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    CONSTRAINT PRIMARY KEY (student_id)
);

CREATE TABLE student_contact(
    student_id INT,
    email_address VARCHAR(30),
    contact VARCHAR(15),
    CONSTRAINT PRIMARY KEY (student_id),
    CONSTRAINT FOREIGN KEY (student_id) REFERENCES Student(student_id)
);

INSERT INTO Student VALUES
(1,'Kamal','Perera'),
(2,'Nimal','Samson'),
(3,'Amal','Perera'),
(4,'Roy','Silva')
;

INSERT INTO student_contact VALUES
(1,'kamal@school.edu','77234512'),
(2,'nimal@school.edu','77456396'),
(3,'amal@school.edu','077743566')
;

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

INSERT INTO StudentInfo VALUES
(1,'Alice',101),
(2,'Bob',102),
(3,'Carol',101),
(4,'Dave',103);

INSERT INTO CourseInfo VALUES
(1,'Database Systems',101),
(2,'Calculus',102),
(3,'World History',103);

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
    Country VARCHAR(20),
    CONSTRAINT PRIMARY KEY (DepartmentID)
);

DESC Author;

CREATE TABLE Book(
    StudentID INT,
    StudentName VARCHAR(20),
    DepartmentID INT,
    CONSTRAINT PRIMARY KEY (StudentID),
    CONSTRAINT FOREIGN KEY (DepartmentID) REFERENCES DepartmentInfo(DepartmentID)
);

DESC Book;

CREATE TABLE Reader(
    CourseID INT,
    CourseName VARCHAR(30),
    DepartmentID INT,
    CONSTRAINT PRIMARY KEY (CourseID),
    CONSTRAINT FOREIGN KEY (DepartmentID) REFERENCES DepartmentInfo(DepartmentID)
);


DESC Reader;
