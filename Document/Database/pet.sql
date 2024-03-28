DROP TABLE if exists `client`.`pet` ;
CREATE TABLE `client`.`pet` (
  `id_pet` int NOT NULL AUTO_INCREMENT,
  `img` VARCHAR(1024) NULL,
  `pet_type` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `weight` VARCHAR(45) NULL,
  `height` VARCHAR(45) NULL,
  `identification` VARCHAR(1024) NOT NULL,
  `vaccine` VARCHAR(1024) NULL,
  `history` VARCHAR(1024) NULL,
  PRIMARY KEY (`id_pet`),
  UNIQUE INDEX `id_pet_UNIQUE` (`id_pet` ASC) VISIBLE);
  
INSERT INTO `client`.`pet` (`id_pet`, `img`, `pet_type`, `name`, `age`, `gender`, `weight`, `height`, `identification`, `vaccine`, `history`) VALUES
(1, 'https://example.com/img1.jpg', 'Dog', 'Buddy', 3, 'Male', '15 kg', '50 cm', 'Golden retriever with a white spot on the chest', 'Rabies, DHPP', 'Regular check-ups indicate Buddy is healthy and active.'),
(2, 'https://example.com/img2.jpg', 'Cat', 'Whiskers', 2, 'Female', '5 kg', '30 cm', 'Black and white with green eyes', 'FVRCP', 'Whiskers has been vaccinated and has no health issues.'),
(3, 'https://example.com/img3.jpg', 'Dog', 'Max', 5, 'Male', '20 kg', '55 cm', 'German shepherd with brown patches', 'Rabies, DHPP, Bordetella', 'Max has had occasional ear infections, otherwise healthy.'),
(4, 'https://example.com/img4.jpg', 'Rabbit', 'Snowball', 1, 'Female', '1.5 kg', '20 cm', 'White with floppy ears', NULL, 'Snowball''s dental health is good, no other concerns.'),
(5, 'https://example.com/img5.jpg', 'Bird', 'Charlie', 2, 'Male', NULL, NULL, 'Green and yellow feathers', 'Polyomavirus, Psittacosis', 'Charlie''s wings have been clipped, otherwise in good health.'),
(6, 'https://example.com/img6.jpg', 'Dog', 'Lucy', 4, 'Female', '18 kg', '48 cm', 'Labrador retriever with a black coat', 'Rabies', 'Lucy has a slight skin allergy, medication prescribed.'),
(7, 'https://example.com/img7.jpg', 'Cat', 'Mittens', 6, 'Male', '7 kg', '35 cm', 'Gray tabby with white paws', 'FVRCP', 'Mittens has been neutered, overall health good.'),
(8, 'https://example.com/img8.jpg', 'Hamster', 'Nibbles', 1, 'Male', '0.2 kg', '10 cm', 'Brown fur with a white stripe down the back', NULL, 'Nibbles has been dewormed, no other issues detected.'),
(9, 'https://example.com/img9.jpg', 'Dog', 'Rocky', 7, 'Male', '25 kg', '60 cm', 'Boxer with a brindle coat', 'Rabies, DHPP, Leptospirosis', 'Rocky''s weight is stable, no concerns reported.'),
(10, 'https://example.com/img10.jpg', 'Guinea Pig', 'Cocoa', 3, 'Female', '0.8 kg', '15 cm', 'Brown and white with short hair', NULL, 'Cocoa has had no health issues, recommended to continue regular check-ups.'),
(11, 'https://example.com/img11.jpg', 'Bird', 'Kiwi', 1, 'Female', NULL, NULL, 'Small with green feathers and a long beak', 'Polyomavirus', 'Kiwi''s beak has been trimmed, no other issues reported.'),
(12, 'https://example.com/img12.jpg', 'Cat', 'Oreo', 5, 'Male', '6 kg', '32 cm', 'Black and white tuxedo cat', 'FVRCP', 'Oreo has been treated for fleas, otherwise in good health.'),
(13, 'https://example.com/img13.jpg', 'Rabbit', 'Thumper', 3, 'Male', '2 kg', '25 cm', 'Gray with floppy ears and a fluffy tail', NULL, 'Thumper''s diet adjusted to improve dental health.'),
(14, 'https://example.com/img14.jpg', 'Dog', 'Bailey', 2, 'Female', '12 kg', '45 cm', 'Golden doodle with curly fur', 'Rabies, DHPP', 'Bailey''s exercise routine modified to manage weight.'),
(15, 'https://example.com/img15.jpg', 'Fish', 'Bubbles', 1, 'Male', NULL, NULL, 'Orange with black stripes', NULL, 'Bubbles''s tank water quality checked, recommended filtration upgrade.');