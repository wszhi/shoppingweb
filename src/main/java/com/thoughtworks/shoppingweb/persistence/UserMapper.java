package com.thoughtworks.shoppingweb.persistence;

import com.thoughtworks.shoppingweb.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findUserByName(String username);
}
