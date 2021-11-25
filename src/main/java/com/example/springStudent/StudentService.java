/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.example.springStudent;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Uglybear
 */
@Service
public class StudentService {
    
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public List<Student> getStudents()
    {
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        String sqlStatement = "SELECT * FROM student";
        List<Student> studentList = jdbcTemplate.query(sqlStatement,
                BeanPropertyRowMapper.newInstance(Student.class));
        
        return studentList;
    }

    public Student getStudent(int student_id)
    {
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        String sqlStatement = "SELECT * FROM student WHERE student_id = " + student_id ;
        
        Student student = jdbcTemplate.queryForObject(sqlStatement, BeanPropertyRowMapper.newInstance(Student.class));
        
        return student;
    }
    
    public List<Course> getCourses()
    {
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        String sqlStatement = "SELECT * FROM course";
        List<Course> courseList = jdbcTemplate.query(sqlStatement,
                BeanPropertyRowMapper.newInstance(Course.class));
        
        return courseList;
    }
    
    
    public void addStudent(String first_name, String last_name, String gender, String country_code, String contact_no, String house_no, String postcode, Integer course_id, boolean graduated) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "INSERT INTO student(first_name,last_name,gender,country_code,contact_no,house_no,postcode,course_id,graduated)VALUES(?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sqlStatement
                ,first_name,last_name,gender,country_code,contact_no,house_no,postcode,course_id,graduated);
    }

    public void updateRecord(Integer student_id, String first_name, String last_name, String gender, String country_code, String contact_no, String house_no, String postcode, Integer course_id, boolean graduated) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "UPDATE student SET first_name=?, last_name=?, gender=?, "
                + "country_code=?, contact_no=?, house_no=?, postcode=?, "
                + "course_id=?, graduated=? WHERE student_id=?";
        
        //BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(student);
        jdbcTemplate.update(sqlStatement, first_name,last_name,gender,country_code,contact_no,house_no,postcode,course_id,graduated, student_id);        
    }
    
    public void deleteStudent(int student_id) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "DELETE FROM student WHERE student_id = ?";
        jdbcTemplate.update(sqlStatement, student_id);
    }
}
