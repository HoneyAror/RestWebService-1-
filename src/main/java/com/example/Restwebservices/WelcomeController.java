package com.example.Restwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller=handling http request
@RestController
public class WelcomeController {
    //we want get method to return welcome with uri=/welcome
    //map get request with uri
    @RequestMapping(method = RequestMethod.GET,path = "/welcome")
    public String welcome(){
        return "WELCOME TO SPRING BOOT";
    }
}
