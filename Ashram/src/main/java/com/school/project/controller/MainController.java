package com.school.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.school.project.model.Student;
import com.school.project.services.EmailService;
import com.school.project.services.Serv;

@Controller
@RequestMapping("/school")
public class MainController 
{
    
    @Autowired
    Serv serv;
    
    @Autowired
    EmailService emailService;
 
    @RequestMapping(value = "/getTeachers", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
    	model.addAttribute("studentCount",serv.getStudentCount());
        model.addAttribute("teachers",serv.getAllTechers());
        return "studentList";
    }
    
    @RequestMapping(value = "/studentLogin/{rollNo}", method = RequestMethod.GET)
    public String studentLogin(@PathVariable("rollNo") Integer rollNo,Model model) {
    	
    	Student student=serv.getStudent(rollNo);
    	emailService.sendEmail(student.getEmail(), student.getFullName());
    	model.addAttribute("studnet",student); 
    	return "emailSuccess";
    }
    
   
}