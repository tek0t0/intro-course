package com.amdocs.introcourse.web.controllers;

import com.amdocs.introcourse.domain.entities.Employee;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("employees")
public class HomeController {


    private final EmployeeService employeeService;

    @Autowired
    public HomeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping(path="/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(path="/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(EmployeeBindingModel employeeBindingModel) {

        Employee employee = new Employee();


//        UserRegisterServiceModel registerServiceModel = modelMapper.map(userRegisterBindingModel, UserRegisterServiceModel.class);
//        userService.registerAndLoginUser(registerServiceModel);


        return "redirect:/home";
    }

}