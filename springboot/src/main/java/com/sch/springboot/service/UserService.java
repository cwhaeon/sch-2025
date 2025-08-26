package com.sch.springboot.service;

import com.sch.springboot.dto.User;
import com.sch.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    UserRepository userRepository =  new UserRepository();      // 호출??

    /**
     * login: 로그인 비즈니스 로직 처리
     */
    public Map<String, Object> login(User user) {
        System.out.println("UserService login ---> ");
        return userRepository.login(user);
    }

    /**
     * signUp: 회원가입 비즈니스 로직 처리
     */
    public Map<String, String> signUp(User user) {
        return userRepository.signUp(user);
    }
}
