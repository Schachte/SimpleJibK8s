package com.schachte.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Blog {
    @GetMapping("/test")
    public String greeting() {
        return "hi";
    }

    @GetMapping("/newendpoint")
    public String greeting2() {
        return "This is another endpoint";
    }
}
