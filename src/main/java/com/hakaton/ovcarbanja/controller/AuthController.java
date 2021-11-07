package com.hakaton.ovcarbanja.controller;

import com.hakaton.ovcarbanja.api.country.Country;
import com.hakaton.ovcarbanja.model.User;
import com.hakaton.ovcarbanja.service.CountryAPI;
import com.hakaton.ovcarbanja.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class AuthController {

    private final UserService userService;
    private final CountryAPI countryAPI;




    @GetMapping("/auth")
    public String showAuthPage(Model model){
        List<Country> countries = countryAPI.getAllCountries();
        model.addAttribute("countries", countries);
        System.out.println(countries.toString());
        model.addAttribute("user", new User());
        return "reg";
    }


    @PostMapping("registerUser")
    public String registerNewUser(@ModelAttribute User user){
        if(user!= null){
            userService.createNewUser(user);
        }
        return "reg";


    }



}
