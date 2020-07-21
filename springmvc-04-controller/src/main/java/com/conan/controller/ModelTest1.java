package com.conan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test(Model model) {
        model.addAttribute("msg", "ModelTest1");
//转发
//        return "/WEB-INF/jsp/test.jsp";
//        return "forward:/WEB-INF/jsp/test.jsp";

        //重定向
        return "redirect:/index.jsp";
    }
}
