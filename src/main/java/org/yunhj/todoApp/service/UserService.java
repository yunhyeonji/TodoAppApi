package org.yunhj.todoApp.service;

import org.yunhj.todoApp.dto.UserDto;

public interface UserService {

    /** 회원가입 */
    boolean signIn(UserDto UserDto);

    /** 로그인 */
    UserDto logIn(UserDto userDto);
}
