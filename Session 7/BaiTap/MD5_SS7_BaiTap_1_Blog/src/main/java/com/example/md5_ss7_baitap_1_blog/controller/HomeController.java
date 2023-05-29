package com.example.md5_ss7_baitap_1_blog.controller;

import com.example.md5_ss7_baitap_1_blog.service.IBlogService;
import com.example.md5_ss7_baitap_1_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IBlogService blogService;
    @GetMapping
    public String show(Model model) {
        model.addAttribute("listCategory", categoryService.findAll());
        model.addAttribute("listBlog", blogService.findAll());
        return "/index";
    }
}
