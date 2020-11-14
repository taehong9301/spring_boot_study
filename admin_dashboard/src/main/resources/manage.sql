--DROP USER test_user@localhost;
CREATE USER test_user@localhost IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON MANAGE_DB.* TO test_user@localhost;

--DROP DATABASE MANAGE_DB;
CREATE DATABASE MANAGE_DB default CHARACTER SET UTF8;

-- Category Table
DROP TABLE IF EXISTS MANAGE_DB.CATEGORY;
CREATE TABLE IF NOT EXISTS STUDY_DB.CATEGORY (
    `ID` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `TYPE` VARCHAR(50) NOT NULL,
    `TITLE` VARCHAR(100),
    `CREATED_AT` DATETIME NOT NULL,
    `CREATED_BY` VARCHAR(20) NOT NULL,
    `UPDATED_AT` DATETIME,
    `UPDATED_BY` VARCHAR(20),
    PRIMARY KEY(`ID`)
);

-- User Table
DROP TABLE IF EXISTS MANAGE_DB.USER;
CREATE TABLE IF NOT EXISTS STUDY_DB.USER (
    `ID` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `ACCOUNT` VARCHAR(12) NOT NULL,
    `PASSWORD` VARCHAR(100) NOT NULL,
    `STATUS` VARCHAR(50) NOT NULL,
    `EMAIL` VARCHAR(100),
    `PHONE_NUMBER` VARCHAR(13),
    `REGISTERED_AT` DATETIME,
    `UNREGISTERED_AT` DATETIME,
    `CREATED_AT` DATETIME NOT NULL,
    `CREATED_BY` VARCHAR(20) NOT NULL,
    `UPDATED_AT` DATETIME,
    `UPDATED_BY` VARCHAR(20),
    PRIMARY KEY(`ID`)
);

DROP TABLE IF EXISTS MANAGE_DB.ITEM;
CREATE TABLE IF NOT EXISTS MANAGE_DB.ITEM (
    ID BIGINT(20) NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(45) NOT NULL,
    PRICE INT NOT NULL,
    CONTENT VARCHAR(100),
    PRIMARY KEY(ID)
);

DROP TABLE IF EXISTS MANAGE_DB.ORDER_DETAIL;
CREATE TABLE IF NOT EXISTS MANAGE_DB.ORDER_DETAIL (
    ID BIGINT(20) NOT NULL AUTO_INCREMENT,
    ORDER_AT DATETIME NOT NULL,
    USER_ID BIGINT(20) NOT NULL,
    ITEM_ID BIGINT(20) NOT NULL,
    PRIMARY KEY(ID)
);