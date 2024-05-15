package com.wikibooks.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String view() {
        System.out.println(1111);
        return "front1";
    }

}