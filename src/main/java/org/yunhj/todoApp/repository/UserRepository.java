package org.yunhj.todoApp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.yunhj.todoApp.dto.UserDto;

@Mapper
@Repository
public interface UserRepository {
    /* 회원 정보 추가*/
    int insertUser(UserDto userDto);

    /* id별 회원 검색 */
    UserDto selectById(String id);
}
