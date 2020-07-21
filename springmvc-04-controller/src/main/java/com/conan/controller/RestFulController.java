package com.conan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestFulController {
    @PostMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "post结果为" + res);
        return "test";
    }
    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "get结果为" + res);
        return "test";
    }

}
