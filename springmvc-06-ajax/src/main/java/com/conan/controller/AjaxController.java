package com.conan.controller;

import com.conan.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test() {
        return "ok";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("conan".equals(name)) {
            response.getWriter().print("true");
        }else
        {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<>();

        userList.add(new User("王室",1,"男"));
        userList.add(new User("蔡室",2,"女"));
        userList.add(new User("吕室",3,"男"));
        return userList;
    }
    @RequestMapping("/a3")
    public String a3(String name , String pwd) {
        String msg = "";
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "ok";
            } else {
                msg = "用户名错误";
            }
        }

        if (pwd != null) {
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "密码错误";
            }
        }
        return msg;
    }
}
