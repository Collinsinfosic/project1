package com.example.controller;

import com.example.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.Bean.Student;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.Bean.User;

@Tag(name = "User控制器",description = "描述：测试User API")
@RestController
public class UserController {

    private final UserMapper usermapper;

    public UserController(UserMapper usermapper) {
        this.usermapper = usermapper;
    }
    @GetMapping("/select/{username}")
    @Operation(description = "根据ID查询信息")
    public User selectall(@PathVariable("username") String username){
        User user = null;
        user = usermapper.selectall(username);
        return user;
    }
}
