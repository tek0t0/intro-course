package com.amdocs.introcourse.web.controllers;


import com.amdocs.introcourse.domain.entities.Employee;
import com.amdocs.introcourse.domain.model.ContactBindingModel;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.service.ContactService;
import com.amdocs.introcourse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


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
    public String home() {
        return "index";
    }

    @GetMapping("register")
    public String register(Model model) {
        if (!model.containsAttribute("employeeBindingModel")) {
            model.addAttribute("employeeBindingModel", new EmployeeBindingModel());
        }

        return "register";
    }

    @PostMapping("register")
    public String registerConfirm(EmployeeBindingModel employeeBindingModel,
                                  @RequestParam("file") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        employeeBindingModel.setFile(file);
        Employee savedEmployee = employeeService.addEmployee(employeeBindingModel);

        String uploadDir = "static/img/" + savedEmployee.getId();
        Path uploadPath = Paths.get(uploadDir);

        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }

        InputStream inputStream = file.getInputStream();
        Path filePath = uploadPath.resolve(fileName);
        Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);


        return "index";
    }

    @GetMapping("contact")
    public String contact(Model model) {
        if (!model.containsAttribute("contactBindingModel")) {
            model.addAttribute("contactBindingModel", new ContactBindingModel());
        }
        return "contact";
    }

    @PostMapping("contact")
    public String contactConfirm(ContactBindingModel contactBindingModel) {
        contactService.addContact(contactBindingModel);
        return "index";
    }

    @GetMapping("feedback")
    public String feedback() {
        return "feedback";
    }

    @GetMapping("course")
    public String course() {
        return "course";
    }

}