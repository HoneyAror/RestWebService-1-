package com.example.Restwebservices.internalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;


@RestController
public class AddressBookResources {

    @Autowired
    private ContactService contactService;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/users")
    public List<Contact> getAllContacts(){
        return contactService.findAll();
    }

    @GetMapping("users/{id}")
    public Contact getContact(@PathVariable int id){
        Contact one = contactService.findOne(id);
        return one;
    }


    @PostMapping("/users")
    public void addContact(@RequestBody Contact contact){
        Contact c = contactService.saveContacts(contact);
    }
    @GetMapping(path = "/hello_world")
    public String helloworldBean(@RequestHeader(name = "Accept-Language",required = false) Locale locale){
        return messageSource.getMessage("good.morning.message" ,null ,locale);
    }
}