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

CREATE TABLE StudentInfo(
    StudentID INT,
    StudentName VARCHAR(20),
    DepartmentID INT,
    CONSTRAINT PRIMARY KEY (StudentID)
    CONSTRAINT FOREIGN KEY (DepartmentID) REFERENCES DepartmentInfo(DepartmentID)
);

CREATE TABLE CourseInfo(
    CourseID INT,
    CourseName VARCHAR(30),
    DepartmentID INT,
    CONSTRAINT PRIMARY KEY (CourseID),
    CONSTRAINT FOREIGN KEY (DepartmentID) REFERENCES DepartmentInfo(DepartmentID)
);





