package com.blj.controller;


import com.blj.pojo.User;
import com.blj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by blj on 2018/3/12.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public String queryDoctor(Map<String,Object> map){
        List<User> list = userService.queryAll();
        map.put("list",list);
        return "userList";
    }

}
