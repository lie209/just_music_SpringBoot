package com.whut.controller;

import com.whut.domain.User;
import com.whut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserService userService;
    @Value("${server.port}")
    private Integer port;
    @GetMapping("/{username}")
    public User getByUsername(@PathVariable String username)
    {
//        System.out.println("getByUsername:"+username);
        User user=userService.getByUsername(username);

        return user;
    }

    @PostMapping ("/login")
    public Result signInOrUp(@RequestBody User user)
    {
        User user1=userService.getByUsername(user.getUsername());
        System.out.println(user1);
        String msg;
        if(user1==null)
        {
            Boolean registry=userService.insertUser(user);
            msg="注册成功！";
            return new Result(Code.REGISTER_OK,msg);
        }
        else
        {
            if(!user.getPassword().equals(user1.getPassword()))
            {
                msg="密码错误!";
                return new Result(Code.PASSWORD_ERR,msg);
            }
            if(user.getPassword().equals(user1.getPassword()))
            {
                msg="登陆成功!";
                return new Result(Code.REGISTER_OK,msg);
            }
        }
        return null;
    }
}
