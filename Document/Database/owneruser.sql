DROP TABLE IF EXISTS `owneruser`;
CREATE TABLE `owneruser` (
  `id_ow` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(11) DEFAULT NULL,
   `phone_num` varchar(15) DEFAULT NULL,
  `password` varchar(1024) NOT NULL,
  `num_of_pets` tinyint DEFAULT NULL,
  `appoinmentschedule` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id_ow`) USING BTREE,
  UNIQUE KEY `email` (`email`) USING BTREE,
  UNIQUE KEY `phoneNum` (`phone_num`) USING BTREE
)COLLATE='utf8mb4_general_ci' ENGINE=InnoDB;

INSERT INTO `owneruser` (`first_name`, `last_name`, `email`, `age`, `gender`, `phone_num`, `password`, `num_of_pets`, `appoinmentschedule`) VALUES
('John', 'Doe', 'johndoe@example.com', 30, 'Male', '1234567890', 'hashed_password_1', 2, 'Monday 10:00 AM'),
('Jane', 'Smith', 'janesmith@example.com', 25, 'Female', '9876543210', 'hashed_password_2', 1, 'Wednesday 2:00 PM'),
('Michael', 'Johnson', 'michaeljohnson@example.com', 40, 'Male', '1112223333', 'hashed_password_3', 3, 'Friday 3:00 PM'),
('Emily', 'Williams', 'emilywilliams@example.com', 35, 'Female', '4445556666', 'hashed_password_4', 0, NULL),
('David', 'Brown', 'davidbrown@example.com', 28, 'Male', '7778889999', 'hashed_password_5', 2, 'Tuesday 4:00 PM'),
('Sarah', 'Jones', 'sarahjones@example.com', 45, 'Female', '5554443333', 'hashed_password_6', 1, 'Thursday 1:00 PM'),
('Chris', 'Lee', 'chrislee@example.com', 33, 'Male', '2223334444', 'hashed_password_7', 4, 'Saturday 11:00 AM'),
('Amanda', 'Davis', 'amandadavis@example.com', 29, 'Female', '6667778888', 'hashed_password_8', 2, 'Wednesday 10:00 AM'),
('Matthew', 'Miller', 'matthewmiller@example.com', 38, 'Male', '9998887777', 'hashed_password_9', 1, 'Monday 2:00 PM'),
('Laura', 'Wilson', 'laurawilson@example.com', 32, 'Female', '3332221111', 'hashed_password_10', 3, 'Thursday 3:00 PM'),
('Kevin', 'Taylor', 'kevintaylor@example.com', 27, 'Male', '8889990000', 'hashed_password_11', 0, NULL),
('Hannah', 'Martinez', 'hannahmartinez@example.com', 36, 'Female', '6661112222', 'hashed_password_12', 2, 'Friday 10:00 AM'),
('Andrew', 'Anderson', 'andrewanderson@example.com', 31, 'Male', '5556667777', 'hashed_password_13', 1, 'Tuesday 3:00 PM'),
('Megan', 'Thomas', 'meganthomas@example.com', 39, 'Female', '2221113333', 'hashed_password_14', 2, 'Saturday 2:00 PM'),
('Jason', 'Hernandez', 'jasonhernandez@example.com', 26, 'Male', '7776665555', 'hashed_password_15', 3, 'Wednesday 11:00 AM');
