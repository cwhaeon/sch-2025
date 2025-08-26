package com.sch.springboot.controller;

import com.sch.springboot.dto.User;
import com.sch.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {

    UserService userService =  new UserService();       // 유저 서비스 객체

    @ResponseBody       // 브라우저로 바로 감
    @PostMapping("/login")
    public Map<String, Object> login(User user){
        return userService.login(user);
    }

    @ResponseBody
    @PostMapping("/signup")
    public String signup(User user){
        return userService.signUp(user);
    }
}
