/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.example.springStudent.Student;

import com.example.springStudent.DatabaseOperations;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Uglybear
 */
@Service
public class StudentService implements DatabaseOperations{
    
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    @Override
    public List selectAll(String tableName) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "SELECT * FROM " + tableName;
        List<Student> studentList = jdbcTemplate.query(sqlStatement,BeanPropertyRowMapper.newInstance(Student.class));
        return studentList;
    }

    @Override
    public Object selectSingle(Integer entityId) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        String sqlStatement = "SELECT * FROM student WHERE studentId = " + entityId ;
        
        Student student = jdbcTemplate.queryForObject(sqlStatement, BeanPropertyRowMapper.newInstance(Student.class));
        
        return student;
    }

    @Override
    public void deleteSingle(Integer entityId) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "DELETE FROM student WHERE studentId = ?";
        jdbcTemplate.update(sqlStatement, entityId);
    }

    @Override
    public void insert(Object object) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        
        Student student = (Student) object;
        
        String sqlStatement = "INSERT INTO student(studentFirstName,studentLastName,studentGender,studentCountryCode,"
                + "studentContactNum,studentHouseNum,studentPostcode,studentGraduated,courseId)VALUES(?,?,?,?,?,?,?,?,?)"; 
        
        jdbcTemplate.update(sqlStatement, student.getStudentFirstName(), student.getStudentLastName(), 
                student.getStudentGender(), student.getStudentCountryCode(), student.getStudentContactNum(), student.getStudentHouseNum(), 
                student.getStudentPostcode(), false, student.getCourseId());
    }

    @Override
    public void update(Object object) {
        jdbcTemplate = new JdbcTemplate(dataSource);

        Student student = (Student) object;
        
        String sqlStatement = "UPDATE student SET studentFirstName=?, studentLastName=?, studentGender=?, " 
                + "studentCountryCode=?, studentContactNum=?, studentHouseNum=?, studentPostcode=?, "
                + "studentGraduated=?, courseId=? WHERE studentId=?"; 
        
        jdbcTemplate.update(sqlStatement, student.getStudentFirstName(), student.getStudentLastName(), 
                student.getStudentGender(), student.getStudentCountryCode(), student.getStudentContactNum(), student.getStudentHouseNum(), 
                student.getStudentPostcode(), student.getStudentGraduated(), student.getCourseId(), student.getStudentId());
    }
}
