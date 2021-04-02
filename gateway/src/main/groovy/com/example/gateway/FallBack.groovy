package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;


// handle fallback
@RestController
class FallBack {

    @GetMapping("/api/fallback")
    Mono<String> getService1DownMsg() {
        return Mono.just("Service 1 is currently down")
    }

}