package com.khanhdpdx.statistics_covid19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String statistic() {
        return "statistic_covid";
    }
}
