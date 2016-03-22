package com.thoughtworks.shoppingweb.service;

import com.thoughtworks.shoppingweb.domain.User;
import com.thoughtworks.shoppingweb.persistence.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public boolean validateUser(User user) {
        System.out.println("+============"+user.getPassword()+user.getUsername());
        User exitUser = userMapper.findUserByName(user.getUsername());
        if(exitUser != null && exitUser.getPassword().equals(user.getPassword())){
            return true;
        }
        return false;
    }
}
