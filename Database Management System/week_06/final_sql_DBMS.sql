CREATE TABLE guest (
    guest_id INT,
    name VARCHAR(20),
    address VARCHAR(20),
    country VARCHAR(20),
    gender ENUM('male', 'female'),
    email VARCHAR(50) UNIQUE,
    user_name VARCHAR(10),
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (guest_id)
);

CREATE TABLE receptionist_staff (
    receptionist_staff_id INT,
    name VARCHAR(20),
    phone VARCHAR(15),
    email VARCHAR(50) UNIQUE,
    user_name VARCHAR(10),
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (receptionist_staff_id)
);

CREATE TABLE housekeeping_staff (
    housekeeping_staff_id INT,
    name VARCHAR(20),
    phone VARCHAR(15),
    email VARCHAR(50) UNIQUE,
    user_name VARCHAR(10),
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (housekeeping_staff_id)
);

CREATE TABLE financial_staff (
    financial_staff_id INT,
    name VARCHAR(20),
    phone VARCHAR(15),
    email VARCHAR(50) UNIQUE,
    user_name VARCHAR(10),
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (financial_staff_id)
);

CREATE TABLE it_staff (
    it_staff_id INT,
    name VARCHAR(20),
    phone VARCHAR(15),
    email VARCHAR(50) UNIQUE,
    user_name VARCHAR(10),
    password VARCHAR(20),
    CONSTRAINT PRIMARY KEY (it_staff_id)
);

CREATE TABLE room_views (
    view_id INT,
    view VARCHAR(20),
    CONSTRAINT PRIMARY KEY (view_id)
);

CREATE TABLE room_type (
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

CREATE TABLE payment_methods (
    payment_method_id INT,
    payment_method_name VARCHAR(20),
    CONSTRAINT PRIMARY KEY (payment_method_id)
);

CREATE TABLE software_maintain_information (
    report_id INT,
    description VARCHAR(10),
    CONSTRAINT PRIMARY KEY (report_id)
);

CREATE TABLE booking_preferences (
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
    CONSTRAINT FOREIGN KEY (guest_id) REFERENCES guest (guest_id),
    CONSTRAINT FOREIGN KEY (receptionist_staff_id) REFERENCES receptionist_staff (receptionist_staff_id),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information (room_id)
);

CREATE TABLE cancellation_details (
    cancellation_id INT,
    cancellation_date DATE,
    reason VARCHAR(50),
    CONSTRAINT PRIMARY KEY (cancellation_id),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information (room_id)
);

CREATE TABLE room_information (
    room_id INT,
    available BOOLEAN,
    room_area INT,
    has_balcony BOOLEAN,
    room_type_id INT,
    CONSTRAINT PRIMARY KEY (room_id),
    CONSTRAINT FOREIGN KEY (room_type_id) REFERENCES room_type (room_type_id)
);

CREATE TABLE room_information_housekeeping_staff (
    room_id INT,
    housekeeping_staff_id INT,
    duties VARCHAR(50),
    CONSTRAINT PRIMARY KEY (room_id, housekeeping_staff_id),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information (room_id),
    CONSTRAINT FOREIGN KEY (housekeeping_staff_id) REFERENCES housekeeping_staff (housekeeping_staff_id)
);

CREATE TABLE room_information_room_views (
    room_id INT,
    view_id INT,
    CONSTRAINT PRIMARY KEY (room_id, view_id),
    CONSTRAINT FOREIGN KEY (room_id) REFERENCES room_information (room_id),
    CONSTRAINT FOREIGN KEY (view_id) REFERENCES room_views (view_id)
);

CREATE TABLE discount_information (
    discount_info_id INT,
    discount_name VARCHAR(20),
    discount_percentage DECIMAL(5, 2),
    payment_method_id INT,
    CONSTRAINT PRIMARY KEY (discount_info_id),
    CONSTRAINT FOREIGN KEY (payment_method_id) REFERENCES payment_methods (payment_method_id)
);

CREATE TABLE final_bill (
    final_bill_id INT,
    bill_date DATE,
    final_amount DECIMAL(10, 2),
    booking_id INT,
    payment_method_id INT,
    financial_staff_id INT,
    discount_info_id INT,
    CONSTRAINT PRIMARY KEY (final_bill_id),
    CONSTRAINT FOREIGN KEY (booking_id) REFERENCES booking_preferences (booking_id),
    CONSTRAINT FOREIGN KEY (payment_method_id) REFERENCES payment_methods (payment_method_id),
    CONSTRAINT FOREIGN KEY (financial_staff_id) REFERENCES financial_staff (financial_staff_id),
    CONSTRAINT FOREIGN KEY (discount_info_id) REFERENCES discount_information (discount_info_id)
);

CREATE TABLE software_it_staff (
    report_id INT,
    it_staff_id INT,
    duties VARCHAR(50),
    CONSTRAINT PRIMARY KEY (report_id, it_staff_id),
    CONSTRAINT FOREIGN KEY (report_id) REFERENCES software_maintain_information (report_id),
    CONSTRAINT FOREIGN KEY (it_staff_id) REFERENCES it_staff (it_staff_id)
);
