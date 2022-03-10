package com.example.Restwebservices.versioning;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

   @GetMapping("basic/User")
    public Userbasic userbasic(){
        return new Userbasic("Honey","Kichha");
    }
    @GetMapping("advance/User")
    public Useradvance useradvance(){
        return new Useradvance(new Name("Honey","Arora"));


    }
}