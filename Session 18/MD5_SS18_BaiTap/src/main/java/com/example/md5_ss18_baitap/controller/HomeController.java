package com.example.md5_ss18_baitap.controller;

import com.example.md5_ss18_baitap.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class HomeController {
    @Autowired
    ILocationService locationService;
    @GetMapping("/register")
    public ResponseEntity<?> formRegister() {
        return ResponseEntity.ok(locationService.findAll());
    }
}
