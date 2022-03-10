package com.example.Restwebservices.versioning;


public class Address {

    private String City;
    private String State;

    public Address() {
    }

    public Address(String city, String state) {
        this.City = city;
        this.State = state;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }
}
