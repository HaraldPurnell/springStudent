/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springStudent.Course;

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
public class CourseService implements DatabaseOperations {
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List selectAll(String tableName) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlStatement = "SELECT * FROM " + tableName;
        
        List<Course> courseList = jdbcTemplate.query(sqlStatement,BeanPropertyRowMapper.newInstance(Course.class));
        return courseList;
    }

    @Override
    public Object selectSingle(Integer entityId) {return null;}

    @Override
    public void deleteSingle(Integer entityId) {}

    @Override
    public void insert(Object object) {}

    @Override
    public void update(Object object) {}
}
