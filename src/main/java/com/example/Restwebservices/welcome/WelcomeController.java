package com.example.Restwebservices.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

//controller=handling http request
@RestController
public class WelcomeController {

    //we want get method to return welcome with uri=/welcome
    //map get request with uri
    @GetMapping(path = "/welcome")
    public String welcome(){
        return "WELCOME TO SPRING BOOT";
    }
}
