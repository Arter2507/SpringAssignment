package com.controllers;

import com.models.Users;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class TravelContronller {

    @ModelAttribute("setDataForm")
    public Users setUserForm() {
        return new Users();
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showFormData() {
        return "index";
    }

    @RequestMapping(value = "acceptDataForm", method = RequestMethod.POST)
    public String saveDataForm(@ModelAttribute("setDataForm") @Valid Users user, BindingResult br, ModelMap model) {
        if (br.hasErrors()) {
            return "index";
        }

        model.addAttribute("username", user.getUsername());
        model.addAttribute("mobileNumber", user.getMobileNumber());
        model.addAttribute("destination", user.getDestination());
        return "thanks";
    }
}
