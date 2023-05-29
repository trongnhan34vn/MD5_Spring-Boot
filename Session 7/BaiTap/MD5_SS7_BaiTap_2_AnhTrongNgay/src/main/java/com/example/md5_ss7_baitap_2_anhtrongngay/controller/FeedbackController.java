package com.example.md5_ss7_baitap_2_anhtrongngay.controller;

import com.example.md5_ss7_baitap_2_anhtrongngay.model.Feedback;
import com.example.md5_ss7_baitap_2_anhtrongngay.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FeedbackController {

    @Autowired
    private IFeedbackService feedbackService;
    @GetMapping
    public String show(Model model) {
        model.addAttribute("feedback", new Feedback());
        Pageable page = PageRequest.of(0, 2);
        
        return "/index";
    }
}
