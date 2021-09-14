package com.coueus.echoeus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/resource")
public class ExampleController {

    @GetMapping
    public Mono<Map<String, String>> getString() {
        return Mono.just(Map.of("id", UUID.randomUUID().toString(), "content", "Hello World!"));
    }
}
