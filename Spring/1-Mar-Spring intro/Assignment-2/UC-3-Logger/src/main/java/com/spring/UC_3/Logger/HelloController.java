package com.spring.UC_3.Logger;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(Model model) {
        logger.info("Received request for /hello");

        Message message = new Message("Hello from Nomicy");
        model.addAttribute("message", message);

        logger.debug("Message object added to model: {}", message.getContent());

        return "hello"; // Maps to hello.html
    }
}
