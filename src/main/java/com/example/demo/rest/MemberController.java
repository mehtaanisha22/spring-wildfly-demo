package com.example.demo.rest;

import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @Autowired
    MemberRepository repository;

    @GetMapping("/viewMembers")
    public String viewMembers(Model model){
        model.addAttribute("members",repository.findAll());
        return "view-members";
    }
}
