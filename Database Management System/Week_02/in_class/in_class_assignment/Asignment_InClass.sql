--QUESTION 01
ALTER TABLE pets RENAME pets_new;

--QUESTION 02
ALTER TABLE locationDetails ADD location_id varchar(5);

--QUESTION 03
ALTER TABLE locationDetails ADD location_id varchar(5) FIRST;

--QUESTION 04
ALTER TABLE locationDetails ADD region_id varchar(5) AFTER state_province;

--QUESTION 05
ALTER TABLE locationDetails MODIFY COLUMN location_id INT;

--QUESTION 06
ALTER TABLE locationDetails DROP location_id;


--QUESTION 07

CREATE TABLE employee(
	employee_Id INT,
	first_name VARCHAR(15),
	last_name VARCHAR(15),
	email VARCHAR(25),
	phone_number VARCHAR(30),
	hire_date DATE,
	job_id ENUM ('Manager','Developer','Sales','HR','Analyst'),
    CONSTRAINT PRIMARY KEY (employee_Id)
);

INSERT INTO employee VALUES(1,'john','Doe','john@example.com','123-456-7890','2022-01-10',1);
INSERT INTO employee VALUES(2,'jane','Smith','jane@example.com','987-654-3210','2022-02-15',2);
INSERT INTO employee VALUES(3,'Michael','Johnson','Michael@example.com','111-222-3333','2022-03-20',3);
INSERT INTO employee VALUES(4,'Emily','Davis','Emily@example.com','444-555-6666','2022-04-25',4);
INSERT INTO employee VALUES(5,'David','Wilson','David@example.com','777-888-9999','2022-05-30',5);
INSERT INTO employee VALUES(6,'Sophia','Brown','Sophia@example.com','222-333-4444','2022-06-05',2);
INSERT INTO employee VALUES(7,'Oliver','Miller','Oliver@example.com','555-666-7777','2022-07-10',5);
INSERT INTO employee VALUES(8,'Ava','Garcia','ava@example.com','999-888-7777','2022-08-15',1);
INSERT INTO employee VALUES(9,'Ethan','Johns','ethan@example.com','333-222-1111','2022-09-20',3);
INSERT INTO employee VALUES(10,'Isabella','Martinez','isabella@example.com','666-777-8888','2022-10-25',4);

--QUESTION 08
ALTER TABLE employee DROP PRIMARY KEY; 
ALTER TABLE employee ADD PRIMARY KEY(employee_Id,first_name);

--QUESTION 09
ALTER TABLE employee ADD CONSTRAINT UNIQUE (phone_number);

--QUESTION 10
ALTER TABLE employee MODIFY last_name VARCHAR(15) NOT NULL;





