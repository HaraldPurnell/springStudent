/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springStudent;

/**
 *
 * @author Uglybear
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer course_id;
    private String course_name; 
    private String course_description; 
    private Integer course_level;

    /**
     * @return the course_id
     */
    public Integer getCourse_id() {
        return course_id;
    }

    /**
     * @param course_id the course_id to set
     */
    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    /**
     * @return the course_name
     */
    public String getCourse_name() {
        return course_name;
    }

    /**
     * @param course_name the course_name to set
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     * @return the course_description
     */
    public String getCourse_description() {
        return course_description;
    }

    /**
     * @param course_description the course_description to set
     */
    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    /**
     * @return the course_level
     */
    public Integer getCourse_level() {
        return course_level;
    }

    /**
     * @param course_level the course_level to set
     */
    public void setCourse_level(Integer course_level) {
        this.course_level = course_level;
    }
    
    
}
