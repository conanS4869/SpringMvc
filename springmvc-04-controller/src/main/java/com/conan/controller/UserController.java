package com.conan.controller;

import com.conan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
//    前端参数 username
    public String test1(@RequestParam("name") String name, Model model) {
        model.addAttribute("msg", name);
        return "test";
    }

    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }
}
