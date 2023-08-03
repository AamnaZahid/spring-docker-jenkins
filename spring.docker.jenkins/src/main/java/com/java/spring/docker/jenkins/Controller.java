package com.java.spring.docker.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/message")
    public String getMessage()
    {
        return "Ya ALLAH! Please Ease My Tasks For Me. Ameen!";
    }
}
