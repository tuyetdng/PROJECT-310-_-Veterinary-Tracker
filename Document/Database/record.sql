DROP TABLE if EXists`client`.`record`;
CREATE TABLE `client`.`record` (
  `id_record` INT NOT NULL AUTO_INCREMENT,
  `id_pet` INT NOT NULL,
  `medicine` VARCHAR(1024) NULL,
  `vaccine` VARCHAR(1024) NULL,
  `veterinarian` VARCHAR(1024) NOT NULL,
  PRIMARY KEY (`id_record`));
  
  INSERT INTO `client`.`record` (`id_record`, `id_pet`, `medicine`, `vaccine`, `veterinarian`) VALUES
(1, 1, 'Antibiotics for ear infection', 'Rabies', 'Dr. Smith'),
(2, 2, NULL, 'FVRCP', 'Dr. Johnson'),
(3, 3, 'Ear drops for infection', 'Rabies, Bordetella', 'Dr. Martinez'),
(4, 4, 'Dental cleaning', NULL, 'Dr. Garcia'),
(5, 5, NULL, 'Polyomavirus', 'Dr. Lee'),
(6, 6, 'Allergy medication', 'Rabies', 'Dr. Wilson'),
(7, 7, 'Neutering surgery', 'FVRCP', 'Dr. Thompson'),
(8, 8, 'Deworming treatment', NULL, 'Dr. Clark'),
(9, 9, NULL, 'Rabies, DHPP', 'Dr. Rodriguez'),
(10, 10, NULL, NULL, 'Dr. Hall'),
(11, 11, 'Beak trimming', 'Polyomavirus', 'Dr. Hernandez'),
(12, 12, 'Flea treatment', 'FVRCP', 'Dr. Young'),
(13, 13, 'Diet adjustment', NULL, 'Dr. White'),
(14, 14, 'Exercise plan', 'Rabies, DHPP', 'Dr. Baker'),
(15, 15, 'Water quality check', NULL, 'Dr. King');
