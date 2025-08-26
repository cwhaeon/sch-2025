package com.sch.springboot.repository;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private final UserService userService;

    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    /**
     * signUp: 회원가입 처리
     */
    public Map<String,String> signUp(User user){
        Map<String,String> result = new HashMap<>();
        return userService;
    }
}


@Repository
public class UserRepository {
    /**
     * login: 로그인 처리
     */
    public Map<String, Object> login(User user) {
        String did = "test";
        String dpass = "1234";
        Map<String, Object> result = new HashMap<String, Object>();

        if (user.getId().equals(did) && user.getPass().equals(dpass)) {
            // 로그인 성공
            result.put("status", "success");
            result.put(("massage"), "로그인 성공!");
            result.put("id", user.getId());
        }
        else {
            // 로그인 실패
            result.put("status", "fail");
            result.put(("massage"), "로그인 실패!");
            result.put("id", user.getId());
        }
        return result;
    }
}
