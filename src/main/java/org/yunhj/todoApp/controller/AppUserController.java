package org.yunhj.todoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yunhj.todoApp.dto.UserDto;
import org.yunhj.todoApp.service.UserServiceImpl;



@RestController
public class AppUserController {

    @Autowired
    UserServiceImpl userService;

    /** 회원가입 기능 */
    @PostMapping("/signIn")
    public boolean signIn(@RequestBody UserDto userDto){
        return userService.signIn(userDto);
    }

    /** 로그인 기능 */
    @PostMapping("/logIn")
    public UserDto logIn(@RequestBody UserDto userDto) {
        return userService.logIn(userDto);
    }
}
