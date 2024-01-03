package org.learning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")

public class IndexController {


    @GetMapping
    public String index(@RequestParam int maxNumber, Model model){
        Random random = new Random();
        model.addAttribute("random",random.nextInt(1,maxNumber));
        return "home";
    }
}
