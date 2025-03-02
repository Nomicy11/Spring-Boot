package com.spring.UC_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Default Greeting
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Greeting with Query Parameter
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name  + " from BridgeLabz";
    }
}


//http://localhost:8080/hello/query?name=Nomicy
