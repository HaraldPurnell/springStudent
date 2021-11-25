/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.example.springStudent;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Uglybear
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    // Home
    @RequestMapping("/")
    public String getAllStudents(Model model)
    {
        List<Student> listStudents = studentService.getStudents();
        model.addAttribute("students", listStudents);
        return "home";
    }
    
    // Navigation
    @RequestMapping("/new_student")
    public String showAdd(Model model)
    {
        List<Course> listCourses = studentService.getCourses();
        model.addAttribute("courses", listCourses);
        return "add_student";
    }
    
    @RequestMapping("/home")
    public void showHome(Model model)
    {
        getAllStudents(model);
    }
    
    @RequestMapping("/edit/{student_id}")
    public ModelAndView showEdit(@PathVariable(name = "student_id") int student_id, Model model) {
        ModelAndView modelView = new ModelAndView("edit_record");
        Student student = studentService.getStudent(student_id);
        modelView.addObject("student", student);
        
        List<Course> listCourses = studentService.getCourses();
        model.addAttribute("courses", listCourses);
        
        return modelView;
    }
    
    
    // Functionality
    @RequestMapping("/delete/{student_id}")
    public String deleteStudent(@PathVariable(name = "student_id") int student_id)
    {
        studentService.deleteStudent(student_id);
        return "redirect:/";
    }
    
    @RequestMapping("/update")
    public String updateRecord(@RequestParam("student_id") Integer student_id,
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("gender") String gender,
            @RequestParam("country_code") String country_code,
            @RequestParam("contact_no") String contact_no,
            @RequestParam("house_no") String house_no,
            @RequestParam("postcode") String postcode,
            @RequestParam("course_id") Integer course_id,
            @RequestParam("graduated") boolean graduated,
            Model model) {
        studentService.updateRecord(student_id, first_name, last_name, gender, country_code, contact_no, house_no, postcode, course_id, graduated);
        
        return "redirect:/";
    }
    
    @PostMapping("/add")
    public String addStudent(@RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name,
            @RequestParam("gender") String gender,
            @RequestParam("country_code") String country_code,
            @RequestParam("contact_no") String contact_no,
            @RequestParam("house_no") String house_no,
            @RequestParam("postcode") String postcode,
            @RequestParam("course_id") Integer course_id,
            Model model)
    {
        studentService.addStudent(first_name, last_name, gender, country_code, contact_no, house_no, postcode, course_id, false);
        
        List<Course> listCourses = studentService.getCourses();
        model.addAttribute("courses", listCourses);
        return "add_student";
    }
    
    
    
    
}
