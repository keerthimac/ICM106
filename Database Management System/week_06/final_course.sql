CREATE DATABASE final_course_dbms;

USE final_course_dbms;

CREATE TABLE guest(
    guest_id INT,
    name VARCHAR(20),
    address VARCHAR(20),
    country VARCHAR(20),
    gender ENUM('male','female'),
    email VARCHAR(10) UNIQUE,
    user_name VARCHAR(10),
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (guest_id)
);
DESC guest;
INSERT INTO guest VALUES
(1,'Nimal rathnayaka','Kandy','Sri Lanka','male','nimal@example.com','nimal123','nimal@123'),
(2,'Ragu singhe','Kolkata','India','male','ragu@example.com','ragu123','ragu@123'),
(3,'Linda smith','London','England','female','linda@example.com','linda123','linda@123'),
(4,'John doe','New York','USA','male','john@example.com','john123','john@123'),
(5,'Bella porch','Milan','Italy','female','bella@example.com','bella123','bella@123');
SELECT * FROM guest;

CREATE TABLE receptionist_staff(
    receptionist_staff_id INT,
    name VARCHAR(20), 
    phone VARCHAR(15), 
    user_name VARCHAR(10), 
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (receptionist_staff_id)
);
DESC receptionist_staff;
INSERT INTO receptionist_staff VALUES
(1, 'Samantha Perera', '1234567890', 'samantha', 'samantha@123'),
(2, 'Rajitha Silva', '9876543210', 'rajitha', 'rajitha@456'),
(3, 'Nimal Gunawardana', '8765432109', 'nimal', 'nimal@789'),
(4, 'Dilani Fernando', '2345678901', 'dilani', 'dilani@012'),
(5, 'Chathura Jayasena', '3456789012', 'chathura', 'chathura@345');
SELECT * FROM receptionist_staff;

CREATE TABLE housekeeping_staff(
    housekeeping_staff_id INT,
    name VARCHAR(20), 
    phone VARCHAR(15), 
    user_name VARCHAR(10), 
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (housekeeping_staff_id)
);
DESC housekeeping_staff;
INSERT INTO housekeeping_staff VALUES
(1, 'Kumara Bandara', '1234567890', 'kumara', 'kumara@123'),
(2, 'Thilini Mendis', '9876543210', 'thilini', 'thilini@456'),
(3, 'Sunil Rajapaksa', '8765432109', 'sunil', 'sunil@789'),
(4, 'Dulani Perera', '2345678901', 'dulani', 'dulani@012'),
(5, 'Pradeepa Ranasinghe', '3456789012', 'pradeepa', 'pradeepa@345');
SELECT * FROM housekeeping_staff;

CREATE TABLE financial_staff(
    financial_staff_id INT,
    name VARCHAR(20), 
    phone VARCHAR(15), 
    user_name VARCHAR(10), 
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (financial_staff_id)
);
DESC financial_staff;
INSERT INTO financial_staff VALUES
(1, 'Asanka Silva', '1234567890', 'asanka', 'asanka@123'),
(2, 'Shalini Fernando', '9876543210', 'shalini', 'shalini@456'),
(3, 'Dinesh Rajapaksa', '8765432109', 'dinesh', 'dinesh@789'),
(4, 'Menaka Perera', '2345678901', 'menaka', 'menaka@012'),
(5, 'Chaminda Jayawardena', '3456789012', 'chaminda', 'chaminda@345');
SELECT * FROM financial_staff;

CREATE TABLE it_staff(
    it_staff_id INT,
    name VARCHAR(20), 
    phone VARCHAR(15), 
    user_name VARCHAR(10), 
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (it_staff_id)
);
DESC it_staff;
INSERT INTO it_staff VALUES
(1, 'Rukmal Perera', '1234567890', 'rukmal', 'rukmal@123'),
(2, 'Ishara Silva', '9876543210', 'ishara', 'ishara@456'),
(3, 'Nuwan Rajapaksa', '8765432109', 'nuwan', 'nuwan@789'),
(4, 'Anusha Fernando', '2345678901', 'anusha', 'anusha@012'),
(5, 'Chandana Jayasena', '3456789012', 'chandana', 'chandana@345');
SELECT * FROM it_staff;


CREATE TABLE room_views(
    view_id INT,
    view VARCHAR(20), 
    CONSTRAINT PRIMARY KEY (view_id)
);
DESC room_views;
INSERT INTO room_views VALUES
(1, 'City View'),
(2, 'Mountain View'),
(3, 'Ocean View'),
(4, 'Garden View'),
(5, 'Pool View');
SELECT * FROM room_views;

CREATE TABLE room_type(
    room_type_id INT, 
    room_type_name VARCHAR(20), 
    has_bathtub BOOLEAN, 
    has_kitchen BOOLEAN, 
    has_tv BOOLEAN, 
    has_internet BOOLEAN, 
    has_hot_tub BOOLEAN, 
    has_fridge BOOLEAN,
    has_microwave BOOLEAN, 
    number_of_guests INT, 
    total_double_beds INT, 
    total_single_beds INT,
    CONSTRAINT PRIMARY KEY (room_type_id)
);
DESC room_type;
INSERT INTO room_type VALUES
(1, 'Single Room', false, false, true, true, false, true, false, 1, 0, 1),
(2, 'Double Room', true, true, true, true, false, true, true, 2, 1, 1),
(3, 'Suite', true, true, true, true, true, true, true, 2, 1, 2);
SELECT * FROM room_type;

CREATE TABLE payment_methods(
    payment_method_id INT,
    payment_method_name VARCHAR(20),
    CONSTRAINT PRIMARY KEY (payment_method_id)
);
DESC payment_methods;
INSERT INTO payment_methods VALUES
(1, 'Cash'),
(2, 'Cheque'),
(3, 'Credit Card');
SELECT * FROM payment_methods;

CREATE TABLE software_maintain_information(
    report_id INT, 
    description VARCHAR(50),
    CONSTRAINT PRIMARY KEY (report_id)
);
DESC software_maintain_information;
INSERT INTO software_maintain_information VALUES
(1, 'System Update'),
(2, 'Security Patch'),
(3, 'Bug Fix'),
(4, 'Performance Optimization'),
(5, 'Database Backup');
SELECT * FROM software_maintain_information;

CREATE TABLE room_information(
    room_id INT, 
    available BOOLEAN, 
    room_area INT, 
    has_balcony BOOLEAN,
    room_type_id INT,
    CONSTRAINT PRIMARY KEY (room_id),
    CONSTRAINT FOREIGN KEY (room_type_id) REFERENCES room_type(room_type_id)
);
DESC room_information;
INSERT INTO room_information VALUES
(101, true, 300, true, 1),
(102, true, 400, false, 2),
(103, true, 500, true, 3),
(104, true, 350, false, 1),
(105, true, 450, true, 2);
SELECT * FROM room_information;

CREATE TABLE booking_preferences(
    booking_id INT,
    booking_create_date DATE,
    expected_arrival_date DATE,
    checkin_date DATE, 
    checkout_date DATE,
    cancellation BOOLEAN NOT NULL,
    guest_id INT, 
    receptionist_staff_id INT, 
    room_id INT,
    CONSTRAINT PRIMARY KEY (booking_id),
    CONSTRAINT FOREIGN KEY (guest_id) REFERENCES guest(guest_id),
    CONSTRAINT FOREIGN KEY (receptionist_staff_id) REFERENCES receptionist_staff(receptionist_staff_id),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information(room_id)
);
DESC booking_preferences;
INSERT INTO booking_preferences VALUES
(1, '2024-01-01', '2024-01-05', '2024-01-05', '2024-01-10', false, 1, 1, 101),
(2, '2024-02-10', '2024-02-15', '2024-02-15', '2024-02-20', false, 2, 2, 102),
(3, '2024-03-20', '2024-03-25', '2024-03-25', '2024-03-30', false, 3, 3, 103),
(4, '2024-04-05', '2024-04-10', '2024-04-10', '2024-04-15', false, 4, 4, 104),
(5, '2024-05-15', '2024-05-20', '2024-05-20', '2024-05-25', false, 5, 5, 105);
SELECT * FROM booking_preferences;

CREATE TABLE cancellation_details(
    cancellation_id INT, 
    cancellation_date DATE, 
    reason VARCHAR(50),
    room_id INT,
    CONSTRAINT PRIMARY KEY (cancellation_id),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information(room_id)
);
DESC cancellation_details;
INSERT INTO cancellation_details VALUES
(1, '2024-01-04', 'Change of plans', 101),
(2, '2024-02-14', 'Family emergency', 102),
(3, '2024-03-24', 'Business trip canceled', 103),
(4, '2024-04-09', 'Health issues', 104),
(5, '2024-05-19', 'Unexpected circumstances', 105);
SELECT * FROM cancellation_details;


CREATE TABLE room_information_housekeeping_staff(
    room_id INT,
    housekeeping_staff_id INT,
    duties VARCHAR(50),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information(room_id),
    CONSTRAINT FOREIGN KEY (housekeeping_staff_id) REFERENCES housekeeping_staff(housekeeping_staff_id),
    CONSTRAINT PRIMARY KEY (room_id,housekeeping_staff_id)
);
DESC room_information_housekeeping_staff;
INSERT INTO room_information_housekeeping_staff VALUES
(101, 1, 'Cleaning and tidying'),
(102, 2, 'Ensuring cleanliness and order'),
(103, 3, 'Housekeeping duties'),
(104, 4, 'Room maintenance'),
(105, 5, 'Cleaning and organizing');
SELECT * FROM room_information_housekeeping_staff;

CREATE TABLE room_information_room_views(
    room_id INT,
    view_id INT,
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information(room_id),
    CONSTRAINT FOREIGN KEY (view_id) REFERENCES room_views(view_id),
    CONSTRAINT PRIMARY KEY (room_id,view_id)
);
DESC room_information_room_views;
INSERT INTO room_information_room_views VALUES
(101, 1),
(102, 2),
(103, 3),
(104, 4),
(105, 5);
SELECT * FROM room_information_room_views;

CREATE TABLE discount_information(
    discount_info_id INT, 
    discount_name VARCHAR(20),
    discount_percentage DECIMAL,
    payment_method_id INT,
    CONSTRAINT PRIMARY KEY (discount_info_id),
    CONSTRAINT FOREIGN KEY (payment_method_id) REFERENCES payment_methods(payment_method_id)
);
DESC discount_information;
INSERT INTO discount_information VALUES
(1, 'No Discount', 0.00, 1),
(2, 'Cheque Discount', 2.00, 2),
(3, 'Credit Card Discount', 3.00, 3);
SELECT * FROM discount_information;

CREATE TABLE final_bill(
    final_bill_id INT, 
    bill_date DATE, 
    final_amount DECIMAL,
    booking_id INT,
    payment_method_id INT, 
    financial_staff_id INT, 
    discount_info_id INT,
    CONSTRAINT PRIMARY KEY (final_bill_id),
    CONSTRAINT FOREIGN KEY (booking_id) REFERENCES booking_preferences(booking_id),
    CONSTRAINT FOREIGN KEY (payment_method_id) REFERENCES payment_methods(payment_method_id),
    CONSTRAINT FOREIGN KEY (financial_staff_id) REFERENCES financial_staff(financial_staff_id),
    CONSTRAINT FOREIGN KEY (discount_info_id) REFERENCES discount_information(discount_info_id)
);
DESC final_bill;
INSERT INTO final_bill VALUES
(1, '2024-01-10', 4000.00, 1, 3, 1, 1),
(2, '2024-02-20', 7600.00, 2, 2, 2, 2),
(3, '2024-03-30', 7000.00, 3, 1, 3, 3),
(4, '2024-04-15', 3800.00, 4, 3, 4, 1),
(5, '2024-05-25', 6650.00, 5, 2, 5, 2);
SELECT * FROM final_bill;

CREATE TABLE software_it_staff(
    report_id INT,
    it_staff_id INT,
    duties VARCHAR(50),
    CONSTRAINT FOREIGN KEY (report_id) REFERENCES software_maintain_information(report_id),
    CONSTRAINT FOREIGN KEY (it_staff_id) REFERENCES it_staff(it_staff_id),
    CONSTRAINT PRIMARY KEY (report_id,it_staff_id)
);
DESC software_it_staff;
INSERT INTO software_it_staff VALUES
(1, 1, 'System updates and maintenance'),
(1, 2, 'Ensuring system security'),
(2, 3, 'Bug fixing and troubleshooting'),
(2, 4, 'Performance optimization tasks'),
(3, 5, 'Database backup and maintenance');
SELECT * FROM software_it_staff;
