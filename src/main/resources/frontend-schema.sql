DROP TABLE IF EXISTS `booking` CASCADE;
DROP TABLE IF EXISTS `property`;
DROP TABLE IF EXISTS `buyer` ;
DROP TABLE IF EXISTS `seller`;
CREATE TABLE IF NOT EXISTS `buyer`(

`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR,
`last_name` VARCHAR
);

CREATE TABLE `seller`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR,
`last_name` VARCHAR
);

CREATE TABLE `property`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`bathroom` INT,
`bedroom` INT,
`price` FLOAT,
`address` VARCHAR,
`city` VARCHAR,
`garden` VARCHAR,
`image` VARCHAR,
`status` VARCHAR,
`type` VARCHAR
);

CREATE TABLE `booking`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`buyer_id` INT, FOREIGN KEY (`buyer_id`) REFERENCES `buyer` (`id`),
`date` DATE,
`property_id` INT, FOREIGN KEY (`property_id`) REFERENCES `property` (`id`),
`time` TIME
);

