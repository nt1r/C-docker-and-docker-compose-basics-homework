package com.thoughtworks.capability.gtb.bob.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Bob!";
    }
}
