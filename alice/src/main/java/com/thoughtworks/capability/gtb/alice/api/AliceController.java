package com.thoughtworks.capability.gtb.alice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class AliceController {
    private final WebClient webClient;

    public AliceController() {
        String bobServiceHelloUrl = "http://localhost:8081/hello";
        this.webClient = WebClient.builder()
                .baseUrl(bobServiceHelloUrl)
                .build();
    }

    @GetMapping("/hello")
    public String sayHello() {
        return webClient.get().retrieve().bodyToMono(String.class).block();
    }
}
