package com.example.Mapper;

import com.example.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    User selectall(@Param("username") String username);
}
