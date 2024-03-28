DROP TABLE IF EXISTS `medicine`;

CREATE TABLE `medicine` (
	`id_med` int NOT NULL AUTO_INCREMENT,
    `med_name` VARCHAR(50) NOT NULL,
    `dosage` VARCHAR(1024) NOT NULL,
    `amount` VARCHAR(1024) NOT NULL,
    `notice` VARCHAR(1024) NULL,
    `total` DECIMAL(13,2) NOT NULL,
    PRIMARY KEY (`id_med`) USING BTREE
) COLLATE='utf8mb4_general_ci' ENGINE=InnoDB;

INSERT INTO `client`.`medicine` (med_name, dosage, amount, notice, total) VALUES
    ("APA DICHLO I", "2 times a day", "100 tablets", NULL, 128),
    ("Vetoquinol", "1 tablet per day", "30 tablets", "Take with food", 25.50),
    ("Petcam", "1 drop in each eye twice a day", "10 ml", "Shake well before use", 15.75),
    ("Flexadin Advanced", "1 chewable tablet daily", "60 tablets", "For joint health", 40.00),
    ("NexGard", "1 chewable tablet once a month", "3 tablets", "Effective against fleas and ticks", 35.00),
    ("Bravecto", "1 chewable tablet every 3 months", "1 tablet", "Protects against fleas and ticks", 20.00),
    ("Metacam", "0.1 ml per kg of body weight once a day", "100 ml", "Pain relief for dogs", 45.50),
    ("Revolution", "Apply 1 tube topically once a month", "3 tubes", "Prevents heartworm disease and treats fleas", 60.25),
    ("Cosequin", "2 capsules daily", "90 capsules", "Supports joint health in cats", 55.00),
    ("Heartgard Plus", "1 chewable tablet once a month", "6 tablets", "Prevents heartworm disease", 40.00),
    ("Apoquel", "1 tablet twice a day for 14 days, then 1 tablet once a day", "30 tablets", "Controls itching due to allergic dermatitis", 70.50),
    ("Simparica Trio", "1 chewable tablet once a month", "3 tablets", "Protects against fleas, ticks, heartworms, and intestinal parasites", 65.00),
    ("Rimadyl", "2 mg per pound of body weight once a day", "60 chewable tablets", "Non-steroidal anti-inflammatory for dogs", 50.75),
    ("Denamarin", "1 tablet once a day on an empty stomach", "30 tablets", "Supports liver function in dogs", 35.25),
    ("Sentinel", "1 tablet once a month with food", "6 tablets", "Prevents heartworm disease, controls flea populations, and treats and controls intestinal parasites", 45.00),
    ("Thyro-Tabs", "0.1 mg per pound of body weight twice a day", "120 tablets", "For dogs with hypothyroidism", 30.50);
