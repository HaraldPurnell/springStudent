/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Uglybear
 * Created: 15 Nov 2021
 */

INSERT INTO course(course_id, course_name, course_description, course_level)VALUES(1, 'Computer Science', 'MSc', 7)
ON DUPLICATE KEY UPDATE course_id=VALUES(course_id);

INSERT INTO course(course_id, course_name, course_description, course_level)VALUES(2, 'Software Engineering', 'MEng', 7)
ON DUPLICATE KEY UPDATE course_id=VALUES(course_id);

INSERT INTO course(course_id, course_name, course_description, course_level)VALUES(3, 'Computing', 'MA', 7)
ON DUPLICATE KEY UPDATE course_id=VALUES(course_id);

INSERT INTO course(course_id, course_name, course_description, course_level)VALUES(4, 'Computing', 'BA', 6)
ON DUPLICATE KEY UPDATE course_id=VALUES(course_id);

INSERT INTO course(course_id, course_name, course_description, course_level)VALUES(5, 'Software Engineering', 'BEng' ,6)
ON DUPLICATE KEY UPDATE course_id=VALUES(course_id);

INSERT INTO course(course_id, course_name, course_description, course_level)VALUES(6, 'Computer Science', 'BSc', 6)
ON DUPLICATE KEY UPDATE course_id=VALUES(course_id);

