package com.spring.UC_5;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}


//curl.exe -X PUT "http://localhost:8080/hello/put/Nomicy?lastName=Gupta"

//http://localhost:8080/hello/put/Nomicy?lastName=Gupta (Postman)

