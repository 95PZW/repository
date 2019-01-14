package com.light.controller;


import com.light.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("fastjson")
public class FastjsonController {/*创建控制器类*/
    @RequestMapping("/test")
    @ResponseBody
    public User test(){
        User user = new User();
        user.setId(1);
        user.setUserName("JAVA");
        user.setPassword("javaSE");
        user.setBirthday(new Date());
        return user;
    }
}
