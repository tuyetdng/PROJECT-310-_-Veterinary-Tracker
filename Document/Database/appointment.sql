DROP Table if exists `client`.`appointment`;
CREATE TABLE `client`.`appointment` (
  `id_appointment` INT NOT NULL,
  `time` VARCHAR(1024) NOT NULL,
  `owner_name` VARCHAR(1024) NOT NULL,
  `veterinarian` VARCHAR(1024) NOT NULL,
  PRIMARY KEY (`id_appointment`));
INSERT INTO `client`.`appointment` (`id_appointment`, `time`, `owner_name`, `veterinarian`) VALUES
(1, '2024-03-01 10:00 AM', 'John Doe', 'Dr. Smith'),
(2, '2024-03-02 11:30 AM', 'Jane Smith', 'Dr. Johnson'),
(3, '2024-03-03 02:00 PM', 'Alice Johnson', 'Dr. Martinez'),
(4, '2024-03-04 09:15 AM', 'Bob Brown', 'Dr. Garcia'),
(5, '2024-03-05 03:30 PM', 'Emily Davis', 'Dr. Lee'),
(6, '2024-03-06 01:45 PM', 'Michael Wilson', 'Dr. Wilson'),
(7, '2024-03-07 10:30 AM', 'Sarah Thompson', 'Dr. Thompson'),
(8, '2024-03-08 04:00 PM', 'David Clark', 'Dr. Clark'),
(9, '2024-03-09 11:00 AM', 'Laura Rodriguez', 'Dr. Rodriguez'),
(10, '2024-03-10 02:30 PM', 'Steven Hall', 'Dr. Hall');