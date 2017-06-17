package com.jiayen.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiayen.model.User;
import com.jiayen.model.dao.UserMapper;

@Controller
public class HelloController {
    @Autowired
	private UserMapper  userDao;
    
    @RequestMapping("/hello")
    public @ResponseBody String test() {
    User user = new User();
    user.setName("jiayen");
    user.setAge(20);
    userDao.insert(user);
        return "hello, world! This com from spring!";
    }

}