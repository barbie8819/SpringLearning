package com.Spring.SpringLearning;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

        @GetMapping
        public String sayHello() {
            return "Hello from BridgeLabz";
        }
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDto user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}


