package com.spring.UC_4.controller;


import com.spring.UC_4.dto.UserDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @PostMapping("/post")
    public ResponseEntity<String> sayHello(@RequestBody UserDTO user) {
        String message = "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
        return ResponseEntity.ok(message);
    }
}
