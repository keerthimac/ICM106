--Question 01
CREATE DATABASE AirportManagement;

USE AirportManagement;
CREATE TABLE Airline(
    airline_id INT AUTO_INCREMENT ,
    airline_name VARCHAR(100) NOT NULL,
    country VARCHAR(50)NOT NULL,
    CONSTRAINT PRIMARY KEY (airline_id)
);
DESC Airline;
CREATE TABLE Flight(
    flight_id INT AUTO_INCREMENT,
    airline_id INT,
    flight_number VARCHAR(20) NOT NULL,
    origin VARCHAR(50) NOT NULL,
    destination VARCHAR(50) NOT NULL,
    departure_time DATETIME,
    arrival_time DATETIME,
    CONSTRAINT PRIMARY KEY (flight_id),
    CONSTRAINT FOREIGN KEY (airline_id) REFERENCES Airline(airline_id)
);
DESC Flight;
CREATE TABLE Ticket(
    ticket_id INT AUTO_INCREMENT,
    flight_id INT,
    ticket_price DECIMAL(10,2),
    ticket_class VARCHAR(20) NOT NULL,
    CONSTRAINT PRIMARY KEY (ticket_id),
    CONSTRAINT FOREIGN KEY (flight_id) REFERENCES Flight(flight_id)
);
DESC Ticket;
CREATE TABLE Passenger(
    passenger_id INT AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    seat_number VARCHAR(10) NOT NULL,
    ticket_id INT NOT NULL,
    CONSTRAINT PRIMARY KEY (passenger_id),
    CONSTRAINT FOREIGN KEY (ticket_id) REFERENCES Ticket(ticket_id)
);
DESC Passenger;

INSERT INTO Airline (airline_name,country) VALUES
("Delta Airline","USA"),
("Emirates","UAE"),
("Lufthansa","Germany");

SELECT*FROM Airline;

INSERT INTO Flight (airline_id,flight_number,origin,destination,departure_time,arrival_time) VALUES
(1,"DL123","New York","Los Angeles","2023-01-01 08:00:00","2023-01-01 10:30:00"),
(2,"EK456","Dubai","London","2023-01-02 14:00:00","2023-01-02 18:00:00"),
(3,"LH789","Berlin","Paris","2023-01-03 09:30:00","2023-01-03 11:30:00");

SELECT*FROM Flight;

INSERT INTO Ticket (flight_id,ticket_price,ticket_class) VALUES
(1,250.00,"Economy"),
(2,500.00,"Business"),
(3,300.00,"Economy");

SELECT*FROM Ticket;

INSERT INTO Passenger (passenger_id,first_name,last_name,email,age,seat_number,ticket_id) VALUES
(4,"John","Doe","jhon@example.com",30,"A23",1),
(5,"Emma","Smith","emma@example.com",25,"B15",2),
(6,"Michael","Johnson","michael@example.com",40,"C10",3);


--Question 02
UPDATE Flight SET destination = 'Paris' WHERE flight_id = 2;

--Question 03
UPDATE Ticket SET ticket_price = 350.00 WHERE ticket_class = 'Economy' AND flight_id IN (SELECT flight_id FROM Flight WHERE origin = 'Dubai');

--Question 04
UPDATE Flight SET departure_time = '2023-02-01 10:00:00' WHERE origin = 'New York' AND destination = 'Los Angeles';

--Question 05
SELECT*FROM Flight WHERE origin = 'Dubai' AND destination = 'London';

--Question 06
SELECT * FROM Ticket WHERE ticket_class IN ('Business', 'Economy');

--Question 07
SELECT * FROM Passenger WHERE age = 25 OR email LIKE '%@example.com';

--Question 08
SELECT * FROM Passenger LIMIT 5;

--Question 09
SELECT * FROM Ticket ORDER BY ticket_price DESC LIMIT 3;

--Question 10
SELECT COUNT(*) AS number_of_flights FROM Flight;

--Question 11
SELECT COUNT(*) AS passengers_above_30 FROM Passenger WHERE age > 30;

--Question 12
SELECT * FROM Passenger WHERE ticket_id IN (SELECT ticket_id FROM Ticket WHERE flight_id IN (SELECT flight_id FROM Flight WHERE origin = 'New York'));

--Question 13
SELECT * FROM Flight WHERE arrival_time BETWEEN '2023-01-01 12:00:00' AND '2023-01-03 12:00:00';

--Question 14
SELECT * FROM Ticket WHERE ticket_price > 300.00;

--Question 15
SELECT * FROM Flight ORDER BY departure_time DESC;

--Question 16
SELECT * FROM Passenger ORDER BY age DESC;

--Question 17
SELECT * FROM Ticket ORDER BY ticket_price DESC;

--Question 18
SELECT * FROM Flight ORDER BY arrival_time ASC;

--Question 19
SELECT * FROM Passenger ORDER BY first_name ASC;

--Question 20
SELECT * FROM Ticket ORDER BY ticket_class ASC;

--Question 21
SELECT * FROM Flight ORDER BY origin ASC, destination DESC;

--Question 22
SELECT * FROM Passenger ORDER BY age DESC, last_name ASC;

