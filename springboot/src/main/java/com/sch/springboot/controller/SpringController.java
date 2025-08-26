package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller     //자바형식을제이슨형식으로??
public class SpringController {

    @GetMapping("/spring")
    public String spring(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         Model model) {
    //Model 객체 추가
    model.addAttribute("name",name);
    model.addAttribute("age",age);
        return "spring";        //View name
    }
}
