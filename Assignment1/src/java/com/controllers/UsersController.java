/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.models.Employees;
import com.models.Users;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UsersController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView showLoginForm() {
        return new ModelAndView("login", "loginEmployeeForm", new Users());
    }

    @RequestMapping(value = "loginProcess", method = RequestMethod.POST)
    public String loginEmployeeProcess(@ModelAttribute("loginEmployeeForm") Users user, BindingResult br, ModelMap model) {
        if (br.hasErrors()) {
            br.rejectValue("message", "error.message", "Username or Password are empty. Please try again!!");
            return "login";
        }
        if (user.getUsername().isEmpty() && user.getPassword().isEmpty()) {
            br.reject("message", "Username or Password are empty. Please try again!!");
            return "login";
        }
        if (user.getUsername().equals("admin")) {
            if (user.getPassword().equals("blackcat")) {
                model.addAttribute("username", user.getUsername());
                model.addAttribute("addEmployee", new Employees());
                return "employeeInformation";
            } else {
                br.rejectValue("password", "error.password", "Password incorrect. Please try again!!");
            }
        } else {
            br.rejectValue("username", "error.username", "Username incorrect. Please try again!!");
        }
        return "login";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String showEmployeeInformation(@ModelAttribute("addEmployee") @Valid Employees employee, BindingResult br, ModelMap model) {
        if (br.hasErrors()) {
            model.addAttribute("addEmployee", employee);
            return "employeeInformation";
        }
        if (employee.getEmpId() != null) {
            model.addAttribute("employeeDetails", employee);

            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // Assuming your original format
                Date birthDate = formatter.parse(employee.getEmpBirthday());
                formatter = new SimpleDateFormat("dd/MM/yyyy"); // Desired output format
                String formattedBirthday = formatter.format(birthDate);
                model.addAttribute("formattedBirthday", formattedBirthday);
            } catch (ParseException ex) {
                Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return "employeeDetails";
        }
        return "employeeInformation";
    }
}
