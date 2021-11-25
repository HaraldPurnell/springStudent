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
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer student_id;

    private String first_name;
    private String last_name;
    private String gender;
    private String country_code; 
    private String contact_no;
    private String house_no;
    private String postcode;
    private Integer course_id;
    private Boolean graduated;

    /**
     * @return the student_id
     */
    public Integer getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the country_code
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     * @param country_code the country_code to set
     */
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    /**
     * @return the contact_no
     */
    public String getContact_no() {
        return contact_no;
    }

    /**
     * @param contact_no the contact_no to set
     */
    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    /**
     * @return the house_no
     */
    public String getHouse_no() {
        return house_no;
    }

    /**
     * @param house_no the house_no to set
     */
    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    /**
     * @return the postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode the postcode to set
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

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
     * @return the graduated
     */
    public Boolean getGraduated() {
        return graduated;
    }

    /**
     * @param graduated the graduated to set
     */
    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }
    
    
    
}
