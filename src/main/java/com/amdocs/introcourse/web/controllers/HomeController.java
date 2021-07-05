package com.amdocs.introcourse.web.controllers;


import com.amdocs.introcourse.domain.model.ContactBindingModel;
import com.amdocs.introcourse.domain.model.CourseBindingModel;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.domain.model.FeedbackBindingModel;
import com.amdocs.introcourse.service.ContactService;
import com.amdocs.introcourse.service.CourseService;
import com.amdocs.introcourse.service.EmployeeService;
import com.amdocs.introcourse.service.FeedbackService;
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
    private final FeedbackService feedbackService;

    @Autowired
    public HomeController(EmployeeService employeeService, ContactService contactService, CourseService courseService, FeedbackService feedbackService) {
        this.employeeService = employeeService;
        this.contactService = contactService;
        this.courseService = courseService;
        this.feedbackService = feedbackService;
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

        if (!model.containsAttribute("allUsers")) {
            model.addAttribute("allUsers", this.employeeService.getEmployees());
        }

        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(EmployeeBindingModel employeeBindingModel,Model model,
                                  @RequestParam("file") MultipartFile file) throws IOException {
        model.addAttribute("allUsers", this.employeeService.getEmployees());
        employeeService.addEmployee(employeeBindingModel,file);
        return "redirect:/register";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        if (!model.containsAttribute("contactBindingModel")) {
            model.addAttribute("contactBindingModel", new ContactBindingModel());
        }

        if (!model.containsAttribute("allContacts")) {
            model.addAttribute("allContacts", this.contactService.getAllContacts());
        }
        return "contact";
    }

    @PostMapping("/contact")
    public String contactConfirm(ContactBindingModel contactBindingModel, Model model) {
        model.addAttribute("allContacts", this.contactService.getAllContacts());
        contactService.addContact(contactBindingModel);
        return "redirect:/contact";
    }

    @GetMapping("/feedback")
    public String feedback(Model model) {
        if (!model.containsAttribute("feedbackBindingModel")) {
            model.addAttribute("feedbackBindingModel", new FeedbackBindingModel());
        }
        return "feedback";
    }

    @PostMapping("/feedback")
    public String feedbackConfirm(FeedbackBindingModel feedbackBindingModel) {
        this.feedbackService.addFeedback(feedbackBindingModel);
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
        return "course";
    }

}