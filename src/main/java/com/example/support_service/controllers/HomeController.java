package com.example.support_service.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @PreAuthorize("hasAnyAuthority('admin','employee','user')")
    @GetMapping("/index")
    public String indexIndex() {
        return "index";
    }

//    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
//    @GetMapping("/login")
//    public String loginIndex() {
//        return "login";
//    }

//    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
//    @GetMapping("/registration-index")
//    public String registrationIndex() {
//        return "registration";
//    }

}

