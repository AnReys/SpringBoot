package edu.ntudp.sau.reis.javaspringbootlab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String welcomeDescribing(Model model){
        NumberCreator numberCreator = new NumberCreator();
        model.addAttribute("name", numberCreator.createRandomNumber());
        return "about";
    }
    @GetMapping("/")
    public String init(Model model){
        return "index";
    }
    @GetMapping("/index")
    public String initIndex(Model model){
        return "index";
    }
}
