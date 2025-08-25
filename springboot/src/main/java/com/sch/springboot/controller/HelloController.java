package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller     //헬로컨트롤안에하면에러
public class HelloController {

    @GetMapping("/spring-mvc")
    public String springMvc(Model model) {   //메소드에는하이픈불가
        model.addAttribute("msg", "김채원 친구");
        return "spring-mvc";        //templates > spring-mvc.html
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        //Model(ModelAndView): hello.html view에게 데이터 전달
        model.addAttribute("msg", "김채원");
        return "hello";     //view name: msg = "김채원"
    }
}
