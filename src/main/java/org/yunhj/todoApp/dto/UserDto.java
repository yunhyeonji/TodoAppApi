package org.yunhj.todoApp.dto;

import lombok.Data;

@Data
public class UserDto {
    /** 사용자 seq */
    private int seq;

    /** 사용자 id */
    private String id;

    /** 사용자 이름 */
    private String username;

    /** 사용자 pwd */
    private String password;
}
