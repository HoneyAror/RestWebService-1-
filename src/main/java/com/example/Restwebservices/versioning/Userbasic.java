package com.example.Restwebservices.versioning;

public class Userbasic {
    private String name;
    private  String address;

    public Userbasic() {
    }

    public Userbasic(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
