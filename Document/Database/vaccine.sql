DROP TABLE IF EXISTS `vaccine`;

CREATE TABLE `vaccine` (
	`id_vac` int NOT NULL AUTO_INCREMENT,
    `vac_name` VARCHAR(50) NOT NULL,
    `date` varchar(50) NOT NULL,
    `dose` VARCHAR(1024) NOT NULL,
    `total` DECIMAL(13,2) NOT NULL,
    PRIMARY KEY (`id_vac`) USING BTREE
) COLLATE='utf8mb4_general_ci' ENGINE=InnoDB;

INSERT INTO `client`.`vaccine` (vac_name, date, dose, total) VALUES
("Rabies Vaccine", "2024-02-19", "1 ml", 35.00),
("Canine Distemper Vaccine", "2024-02-20", "0.5 ml", 25.00),
("Feline Calicivirus Vaccine", "2024-02-21", "0.3 ml", 20.00),
("Equine Influenza Vaccine", "2024-02-22", "2 ml", 40.00),
("Avian Influenza Vaccine", "2024-02-23", "0.1 ml", 15.00);