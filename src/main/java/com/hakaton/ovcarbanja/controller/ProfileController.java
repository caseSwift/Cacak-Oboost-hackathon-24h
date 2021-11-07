package com.hakaton.ovcarbanja.controller;

import com.hakaton.ovcarbanja.model.Stay;
import com.hakaton.ovcarbanja.model.User;
import com.hakaton.ovcarbanja.repository.ActivityRepository;
import com.hakaton.ovcarbanja.repository.StayRepository;
import com.hakaton.ovcarbanja.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class ProfileController {

    private final StayRepository stayRepository;
    private  final UserService userService;
    private final ActivityRepository activityRepository;

    @GetMapping("/profile")
    public String showProfilePage(Model model, Principal principal){
        User user = userService.getUserByEmail(principal.getName());
        Stay stay = stayRepository.getStayByUser(user);
        model.addAttribute("activities", activityRepository.findAll());
        model.addAttribute("user",user);
        return "profile";

    }


}
