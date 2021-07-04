package com.amdocs.introcourse.web.controllers;


import com.amdocs.introcourse.domain.model.ContactBindingModel;
import com.amdocs.introcourse.domain.model.CourseBindingModel;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.service.ContactService;
import com.amdocs.introcourse.service.CourseService;
import com.amdocs.introcourse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
@CrossOrigin("http://localhost:8080")
public class HomeController {

    private final EmployeeService employeeService;
    private final ContactService contactService;
    private final CourseService courseService;

    @Autowired
    public HomeController(EmployeeService employeeService, ContactService contactService, CourseService courseService) {
        this.employeeService = employeeService;
        this.contactService = contactService;
        this.courseService = courseService;
    }


    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    @CrossOrigin("http://localhost:8080")
    public String register(Model model) {
        if (!model.containsAttribute("employeeBindingModel")) {
            model.addAttribute("employeeBindingModel", new EmployeeBindingModel());
        }

        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(EmployeeBindingModel employeeBindingModel,
                                  @RequestParam("file") MultipartFile file) throws IOException {

        System.out.println();
        employeeService.addEmployee(employeeBindingModel,file);



        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        if (!model.containsAttribute("contactBindingModel")) {
            model.addAttribute("contactBindingModel", new ContactBindingModel());
        }
        return "contact";
    }

    @PostMapping("/contact")
    public String contactConfirm(ContactBindingModel contactBindingModel) {
        contactService.addContact(contactBindingModel);
        return "index";
    }

    @GetMapping("/feedback")
    public String feedback() {
        return "feedback";
    }

    @GetMapping("/course")
    public String addCourse(Model model) {
        if (!model.containsAttribute("courseBindingModel")) {
            model.addAttribute("courseBindingModel", new CourseBindingModel());
        }
        return "course";
    }

    @PostMapping("/course")
    public String addCourseConfirm(CourseBindingModel courseBindingModel){
        this.courseService.addCourse(courseBindingModel);
        return "index";
    }

}