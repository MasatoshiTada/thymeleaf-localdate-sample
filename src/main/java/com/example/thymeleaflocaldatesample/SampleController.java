package com.example.thymeleaflocaldatesample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class SampleController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("sampleForm", new SampleForm("John Smith", LocalDate.of(2001, 1, 1)));
        return "index";
    }
}
