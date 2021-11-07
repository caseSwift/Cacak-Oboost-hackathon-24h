package com.hakaton.ovcarbanja.controller;

import com.hakaton.ovcarbanja.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ShopController {

    private final ItemRepository itemRepository;


    @GetMapping("/shop")
    public String showShow(Model model){
        model.addAttribute("items", itemRepository.findAll());

        return "shop";
    }


}
