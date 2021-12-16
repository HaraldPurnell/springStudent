/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.example.springStudent;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    
    // Navigations
    @GetMapping(value = "/")
    public String home(Model model) {
        List<Student> listStudents = studentService.getStudents();
        model.addAttribute("students", listStudents);
        return "home";
    }
    
    @GetMapping(value="/login")    
    public String show_login() {
        return "login";    
    }   

    @GetMapping(value = "/home")
    public String show_Home(Model model)
    {
        List<Student> listStudents = studentService.getStudents();
        model.addAttribute("students", listStudents);
        return "home";
    }
    
    @GetMapping(value = "/add")
    public String show_Add(Model model)
    {
        List<Course> listCourses = studentService.getCourses();
        model.addAttribute("courses", listCourses);
        return "add_student";
    }
    
    @RequestMapping(value = "/edit/{student_id}")
    public ModelAndView show_Edit(@PathVariable(name = "student_id") int student_id, Model model) {
        ModelAndView modelView = new ModelAndView("edit_record");
        Student student = studentService.getStudent(student_id);
        modelView.addObject("student", student);
        
        List<Course> listCourses = studentService.getCourses();
        model.addAttribute("courses", listCourses);
        
        return modelView;
    }
    
    @RequestMapping(value = "/logout")
    public String logout()
    {
        return "redirect:";
    }

    // Not Navigations name_format:btn_verb
    @RequestMapping(value = "/btn_delete/{student_id}")
    public String delete_Student(@PathVariable(name = "student_id") int student_id)
    {
        studentService.deleteStudent(student_id);
        return "redirect:/home";
    }
    
    @GetMapping(value = "/btn_edit")
    public String edit_Student(@ModelAttribute("student") Student student) {
        //studentService.updateRecord(student_id, first_name, last_name, gender, country_code, contact_no, house_no, postcode, course_id, graduated);
        studentService.updateRecord(student);
        return "redirect:/home";
    }
    
    @PostMapping(value = "/btn_add")
    public String add_Student(@RequestParam("first_name") String first_name,
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
