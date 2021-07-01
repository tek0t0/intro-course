package com.amdocs.introcourse.web.controllers;


import com.amdocs.introcourse.domain.model.ContactBindingModel;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.service.ContactService;
import com.amdocs.introcourse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class HomeController {

    private final EmployeeService employeeService;
    private final ContactService contactService;

    @Autowired
    public HomeController(EmployeeService employeeService, ContactService contactService) {
        this.employeeService = employeeService;
        this.contactService = contactService;
    }


    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping("register")
    public String register(Model model){
        if (!model.containsAttribute("employeeBindingModel")) {
            model.addAttribute("employeeBindingModel", new EmployeeBindingModel());
        }
        return "register";
    }

    @PostMapping("register")
    public String registerConfirm(EmployeeBindingModel employeeBindingModel){
        employeeService.addEmployee(employeeBindingModel);
        return "index";
    }

    @GetMapping("contact")
    public String contact(){
        return "contact";
    }

    @PostMapping("contact")
    public String contactConfirm(ContactBindingModel contactBindingModel){
        contactService.addContact(contactBindingModel);
        return "index";
    }

    @GetMapping("feedback")
    public String feedback(){
        return "feedback";
    }

    @GetMapping("course")
    public String course(){
        return "course";
    }

}