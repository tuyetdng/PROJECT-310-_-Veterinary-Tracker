DROP TABLE IF EXISTS `veterinarianuser`;
CREATE TABLE `veterinarianuser` (
	`id_ver` INT(5) NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(50) NOT NULL,
	`last_name` VARCHAR(50) NOT NULL,
	`email` VARCHAR(50) NOT NULL,
	`age` INT(11) NOT NULL,
	`gender` VARCHAR(50) NULL,
	`phone_num` VARCHAR(15) NOT NULL,
	`password`  VARCHAR(50) NOT NULL,
	`name_of_consulating_room` VARCHAR(50) NOT NULL,
	`appoinmentschedule`  VARCHAR(1024) NULL,
	`quanlification`  VARCHAR(50) NOT NULL,
	`experience`  VARCHAR(100) NOT NULL,
	`identification`  VARCHAR(50) NOT NULL,
	`check_vaccine`  VARCHAR(50) NULL,
	`history`  VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id_ver`) USING BTREE,
	UNIQUE INDEX `email` (`email`) USING BTREE,
	UNIQUE INDEX `phone_num` (`phone_num`)
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;

INSERT INTO `client`.`veterinarianuser`(id_ver,first_name,last_name,email,age,gender,phone_num,password,name_of_consulating_room,appoinmentschedule,quanlification,experience,identification,check_vaccine,history)
VALUES
(1, 'John', 'Doe', 'john.doe@email.com', 35, 'Male', '123-456-7890', 'pass123', 'Room 101', '2024-02-01 10:00 AM', 'DVM', '10 years', 'YES', 'Null', 'Null'),
(2, 'Alice', 'Johnson', 'alice.johnson@email.com', 28, 'Female', '987-654-3210', 'secret321', 'Room 202', '2024-02-03 02:30 PM', 'BVSc', '5 years', 'YES', 'Null', 'Null'),
(3, 'David', 'Smith', 'david.smith@email.com', 42, 'Male', '555-123-4567', 'vetpass', 'Room 303', '2024-02-05 11:15 AM', 'DVM', '15 years', 'YES', 'Null', 'Null'),
(4, 'Emily', 'White', 'emily.white@email.com', 30, 'Female', '111-222-3333', 'petcare22', 'Room 404', '2024-02-08 03:45 PM', 'BVetMed', '8 years', 'YES', 'Null', 'Null'),
(5, 'Michael', 'Brown', 'michael.brown@email.com', 38, 'Male', '777-888-9999', 'animaldoc', 'Room 505', '2024-02-10 09:30 AM', 'DVM', '12 years', 'YES', 'Null', 'Null'),
(6, 'Sarah', 'Taylor', 'sarah.taylor@email.com', 29, 'Female', '555-999-7777', 'vetlover123', 'Room 606', '2024-02-12 01:00 PM', 'BVSc', '6 years', 'YES', 'Null', 'Null'),
(7, 'Kevin', 'Anderson', 'kevin.anderson@email.com', 45, 'Male', '123-987-6543', 'paws1234', 'Room 707', '2024-02-15 10:45 AM', 'DVM', '18 years', 'YES', 'Null', 'Null'),
(8, 'Jessica', 'Martinez', 'jessica.martinez@email.com', 33, 'Female', '777-333-1111', 'furrycare', 'Room 808', '2024-02-18 03:15 PM', 'BVetMed', '7 years', 'YES', 'Null', 'Null'),
(9, 'Brian', 'Miller', 'brian.miller@email.com', 40, 'Male', '222-444-6666', 'petvet2022', 'Room 909', '2024-02-20 11:30 AM', 'DVM', '14 years', 'YES', 'Null', 'Null'),
(10, 'Olivia', 'Walker', 'olivia.walker@email.com', 31, 'Female', '888-555-2222', 'olivets', 'Room 1010', '2024-02-22 02:00 PM', 'DVM', '9 years', 'YES', 'Null', 'Null'),
(11, 'Daniel', 'Hill', 'daniel.hill@email.com', 36, 'Male', '111-777-8888', 'dhillvets', 'Room 1111', '2024-02-25 09:00 AM', 'BVSc', '11 years', 'YES', 'Null', 'Null'),
(12, 'Mia', 'Collins', 'mia.collins@email.com', 27, 'Female', '333-666-9999', 'vetmialove', 'Room 1212', '2024-02-28 03:30 PM', 'DVM', '5 years', 'YES', 'Null', 'Null'),
(13, 'Samuel', 'Rodriguez', 'samuel.rodriguez@email.com', 39, 'Male', '999-555-3333', 'samvet22', 'Room 1313', '2024-03-02 10:15 AM', 'BVetMed', '12 years', 'YES', 'Null', 'Null'),
(14, 'Ava', 'Cooper', 'ava.cooper@email.com', 32, 'Female', '444-777-1111', 'avapetscare', 'Room 1414', '2024-03-05 01:45 PM', 'DVM', '8 years', 'YES', 'Null', 'Null'),
(15, 'Ethan', 'Turner', 'ethan.turner@email.com', 28, 'Male', '777-111-4444', 'ethanvet', 'Room 1515', '2024-03-08 11:00 AM', 'BVSc', '7 years', 'YES', 'Null', 'Null');
