package com.example.Restwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public UserBean retrieveUserBean(){
        return  new UserBean("HONEY",101,"v3");
    }
    @GetMapping("/filtering-list")
    public List<UserBean> retrieveListOfSomeBeans(){
        return Arrays.asList(new UserBean("RADHA",102,"v3"),new UserBean("RAM",103,"v24"));
    }

}
