package com.example.addressbook.model;

public class AddressBook {

    private int id;
    private String name;
    private String city;

    // Constructors
    public AddressBook() {}

    public AddressBook(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}