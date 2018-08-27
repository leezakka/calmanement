CREATE DATABASE IF NOT EXISTS calendar;

ALTER DATABASE calendar;
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;


GRANT ALL PRIVILEGES ON calendar.* TO huming@localhost IDENTIFIED BY 'dkatjr1';

USE calendar;


CREATE TABLE IF NOT EXISTS members (
  user_id     VARCHAR(10) NOT NULL PRIMARY KEY,
  user_pwd    VARCHAR(30) NOT NULL,
  address     VARCHAR(100),
  company     VARCHAR(20) ,
  department  VARCHAR(20) ,
  extention   VARCHAR(20) ,
  telephone   VARCHAR(20) ,
  INDEX(company)
) engine=InnoDB;