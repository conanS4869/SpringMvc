package com.conan.controller;

import com.conan.bean.User;
import com.conan.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        User user = new User("王1号", 30, "男");
        return JsonUtils.getJson(user);
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        List<User>userList = new ArrayList<>();
        User user1 = new User("王1号", 30, "男");
        User user2 = new User("王2号", 30, "男");
        User user3 = new User("王3号", 30, "男");
        User user4 = new User("王4号", 30, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    public String json3()  {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
}
