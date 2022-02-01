/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.example.springStudent.Student;

import com.example.springStudent.Course.CourseService;
import com.example.springStudent.Course.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Uglybear
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    
    // Navigations
    @GetMapping(value = "/")
    public String defaultHome(Model model) {
        List<Student> listStudents = studentService.selectAll("student");
        model.addAttribute("students", listStudents);
        return "ViewHome";
    }
    
    @GetMapping(value="/login")    
    public String showViewLogin() {
        return "ViewLogin";    
    }   

    @GetMapping(value = "/home")
    public String showViewHome(Model model)
    {
        List<Student> listStudents = studentService.selectAll("student");
        model.addAttribute("students", listStudents);
        return "ViewHome"; 
    }
    
    @GetMapping(value = "/insertStudent")
    public String showViewAdd(Model model)
    {
        List<Course> listCourses = courseService.selectAll("course");
        model.addAttribute("courses", listCourses);
        return "ViewInsertStudent";
    }
    
    @RequestMapping(value = "/edit/{studentId}")
    public ModelAndView showViewEdit(@PathVariable(name = "studentId") int studentId, Model model) {
        ModelAndView modelView = new ModelAndView("ViewEditRecord");
        Student student = (Student)studentService.selectSingle(studentId);
        modelView.addObject("student", student);
        
        List<Course> listCourses = courseService.selectAll("course");
        model.addAttribute("courses", listCourses);
        
        return modelView;
    }
    
    @RequestMapping(value = "/logout")
    public String showViewLogout()
    {
        return "redirect:";
    }
    
    // Not Navigations
    @RequestMapping(value = "/btnStudentDelete/{studentId}")
    public String btnStudentDelete(@PathVariable(name = "studentId") int studentId)
    {
        studentService.deleteSingle(studentId);
        return "redirect:/home";
    }
    
    @GetMapping(value = "/btnStudentUpdate")
    public String btnStudentUpdate(@ModelAttribute("student") Student student) {
        studentService.update(student);
        return "redirect:/home";
    }
    
    @GetMapping(value = "/btnStudentInsert")
    public String btnStudentInsert(@ModelAttribute("student") Student student) {
        studentService.insert(student);
        return "redirect:/home";
    }
}
