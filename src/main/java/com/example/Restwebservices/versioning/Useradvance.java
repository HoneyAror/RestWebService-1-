package com.example.Restwebservices.versioning;

public class Useradvance {
            private Name name;
            private Address address;

    public Useradvance(Name name, Address address) {
    }

    public Useradvance(Name name) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
