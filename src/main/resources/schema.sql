/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Uglybear
 * Created: 15 Nov 2021
 */
CREATE TABLE IF NOT EXISTS course (
    courseId          INTEGER      AUTO_INCREMENT,
    courseName        VARCHAR (50) NOT NULL,
    courseDescription VARCHAR (10) NOT NULL,
    courseLevel       INTEGER (1)  NOT NULL,
    PRIMARY KEY (courseId)
);

CREATE TABLE IF NOT EXISTS student (
    studentId           INTEGER      AUTO_INCREMENT,
    studentFirstName    VARCHAR (30) NOT NULL,
    studentLastName     VARCHAR (30) NOT NULL,
    studentGender       VARCHAR (1)  NOT NULL,
    studentCountryCode  VARCHAR (5)  NOT NULL,
    studentContactNum   VARCHAR (10) NOT NULL,
    studentHouseNum     VARCHAR (10) NOT NULL,
    studentPostcode     VARCHAR (10) NOT NULL,
    studentGraduated    BOOLEAN      NOT NULL,
    courseId            INTEGER,
    PRIMARY KEY (studentId),
    FOREIGN KEY (courseId) REFERENCES course(courseId)
);

CREATE TABLE IF NOT EXISTS account (
    accountUsername VARCHAR (30) NOT NULL,
    accountPassword VARCHAR (200) NOT NULL,
    PRIMARY KEY (accountUsername)
);
