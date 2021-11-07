package com.hakaton.ovcarbanja.controller;


import com.hakaton.ovcarbanja.model.Stay;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SearchController {




    @GetMapping("search")
    public String showSearch(){
        return "search";
    }

}
