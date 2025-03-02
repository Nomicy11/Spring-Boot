package com.spring.UC_3;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Default Greeting
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }



    // Greeting with Path Parameter
    @GetMapping("/{name}")
    public String sayHelloWithNamePath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}


//http://localhost:8080/hello/Nomicy
