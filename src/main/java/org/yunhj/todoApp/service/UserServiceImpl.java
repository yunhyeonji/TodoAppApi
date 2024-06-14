package org.yunhj.todoApp.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yunhj.todoApp.dto.UserDto;
import org.yunhj.todoApp.repository.UserRepository;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Log4j2
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userMapper;


    /** 회원가입 기능 */
    @Override
    public boolean signIn(UserDto userDto) {
        // id 사용유무 확인
        if(userMapper.selectById(userDto.getId()) == null){
            // pwd 암호화
            userDto.setPassword(shaPwd(userDto.getPassword()));
            // 회원정보 insert 진행
            if(userMapper.insertUser(userDto) == 1){
                return true;
            }
        }
        return false;
    }

    /** 로그인 기능 */
    @Override
    public UserDto logIn(UserDto userDto) {
        // id로 사용자 가져오기
        UserDto dbUser = userMapper.selectById(userDto.getId());
        if(dbUser != null){
            // 비밀번호 확인
            String hashedPwd = shaPwd(userDto.getPassword());
            if(hashedPwd.equals(dbUser.getPassword())){
                return dbUser;
            }else{
                return null;
            }
        }
        return null;
    }

    /** pwd 암호화 진행 */
    private String shaPwd (String pwd){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(pwd.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
