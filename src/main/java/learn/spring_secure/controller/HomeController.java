package learn.spring_secure.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello Friend !";
    }

    @GetMapping("/secure")
    public String login() {
        return "Secured api !";
    }
}
