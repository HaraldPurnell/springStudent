/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Uglybear
 * Created: 15 Nov 2021
 */

CREATE TABLE IF NOT EXISTS course (
    course_id          INTEGER      AUTO_INCREMENT,
    course_name        VARCHAR (50) NOT NULL,
    course_description VARCHAR (10) NOT NULL,
    course_level       INTEGER (1)  NOT NULL,
    PRIMARY KEY (course_id)
);

CREATE TABLE IF NOT EXISTS student (
    student_id   INTEGER      AUTO_INCREMENT,
    first_name   VARCHAR (30) NOT NULL,
    last_name    VARCHAR (30) NOT NULL,
    gender       VARCHAR (1)  NOT NULL,
    country_code VARCHAR (5)  NOT NULL,
    contact_no   VARCHAR (10) NOT NULL,
    house_no     VARCHAR (10) NOT NULL,
    postcode     VARCHAR (10) NOT NULL,
    course_id    INTEGER      NOT NULL,
    graduated    TINYINT (1)  NOT NULL,
    PRIMARY KEY (student_id),
    FOREIGN KEY (course_id) REFERENCES course(course_id)
);
