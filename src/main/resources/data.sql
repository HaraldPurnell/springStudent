/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Uglybear
 * Created: 15 Nov 2021
 */

INSERT INTO course(courseId, courseName, courseDescription, courseLevel)VALUES(1, 'Computer Science', 'MSc', 7)
ON DUPLICATE KEY UPDATE courseId=VALUES(courseId);

INSERT INTO course(courseId, courseName, courseDescription, courseLevel)VALUES(2, 'Software Engineering', 'MEng', 7)
ON DUPLICATE KEY UPDATE courseId=VALUES(courseId);

INSERT INTO course(courseId, courseName, courseDescription, courseLevel)VALUES(3, 'Computing', 'MA', 7)
ON DUPLICATE KEY UPDATE courseId=VALUES(courseId);

INSERT INTO course(courseId, courseName, courseDescription, courseLevel)VALUES(4, 'Computing', 'BA', 6)
ON DUPLICATE KEY UPDATE courseId=VALUES(courseId);

INSERT INTO course(courseId, courseName, courseDescription, courseLevel)VALUES(5, 'Software Engineering', 'BEng' ,6)
ON DUPLICATE KEY UPDATE courseId=VALUES(courseId);

INSERT INTO course(courseId, courseName, courseDescription, courseLevel)VALUES(6, 'Computer Science', 'BSc', 6)
ON DUPLICATE KEY UPDATE courseId=VALUES(courseId);

INSERT INTO account(accountUsername, accountPassword)VALUES('smithJohn01', '$2a$12$boM4fKYjpuRdFh.hIHY5Ae1cwWFWdc.7P7qxo47Z4dAGhTp8i1qEe')
ON DUPLICATE KEY UPDATE accountUsername=VALUES(accountUsername);

INSERT INTO account(accountUsername, accountPassword)VALUES('root', '$2a$12$0kBlZ/yQlrGajq0nwDJkQelGZ02vMyssr730Fzzc.S1F09Rx2FtAm')
ON DUPLICATE KEY UPDATE accountUsername=VALUES(accountUsername);
