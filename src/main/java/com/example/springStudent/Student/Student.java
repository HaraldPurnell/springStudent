/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springStudent.Student;

/**
 *
 * @author Uglybear
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentId")
    private Integer studentId;
    @Column(name = "studentFirstName")
    private String studentFirstName;
    @Column(name = "studentLastName")
    private String studentLastName;
    @Column(name = "studentGender")
    private String studentGender;
    @Column(name = "studentCountryCode")
    private String studentCountryCode; 
    @Column(name = "studentContactNum")
    private String studentContactNum;
    @Column(name = "studentHouseNum")
    private String studentHouseNum;
    @Column(name = "studentPostcode")
    private String studentPostcode;
    @Column(name = "studentGraduated")
    private Boolean studentGraduated;
    @Column(name = "courseId")
    private Integer courseId;

    /**
     * @return the studentId
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentFirstName
     */
    public String getStudentFirstName() {
        return studentFirstName;
    }

    /**
     * @param studentFirstName the studentFirstName to set
     */
    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    /**
     * @return the studentLastName
     */
    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     * @param studentLastName the studentLastName to set
     */
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     * @return the studentGender
     */
    public String getStudentGender() {
        return studentGender;
    }

    /**
     * @param studentGender the studentGender to set
     */
    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    /**
     * @return the studentCountryCode
     */
    public String getStudentCountryCode() {
        return studentCountryCode;
    }

    /**
     * @param studentCountryCode the studentCountryCode to set
     */
    public void setStudentCountryCode(String studentCountryCode) {
        this.studentCountryCode = studentCountryCode;
    }

    /**
     * @return the studentContactNum
     */
    public String getStudentContactNum() {
        return studentContactNum;
    }

    /**
     * @param studentContactNum the studentContactNum to set
     */
    public void setStudentContactNum(String studentContactNum) {
        this.studentContactNum = studentContactNum;
    }

    /**
     * @return the studentHouseNum
     */
    public String getStudentHouseNum() {
        return studentHouseNum;
    }

    /**
     * @param studentHouseNum the studentHouseNum to set
     */
    public void setStudentHouseNum(String studentHouseNum) {
        this.studentHouseNum = studentHouseNum;
    }

    /**
     * @return the studentPostcode
     */
    public String getStudentPostcode() {
        return studentPostcode;
    }

    /**
     * @param studentPostcode the studentPostcode to set
     */
    public void setStudentPostcode(String studentPostcode) {
        this.studentPostcode = studentPostcode;
    }

    /**
     * @return the studentGraduated
     */
    public Boolean getStudentGraduated() {
        return studentGraduated;
    }

    /**
     * @param studentGraduated the studentGraduated to set
     */
    public void setStudentGraduated(Boolean studentGraduated) {
        this.studentGraduated = studentGraduated;
    }

    /**
     * @return the courseId
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

}
