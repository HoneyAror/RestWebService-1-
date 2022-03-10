package com.example.Restwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserBean {
    private String name;
    private int id;
    @JsonIgnore
    //supposethisfield is very secure(password) we dont want to pss
    private String password;

    public UserBean(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}

