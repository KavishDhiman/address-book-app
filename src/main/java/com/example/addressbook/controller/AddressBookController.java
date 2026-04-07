package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // Test API
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Address Book App!";
    }

    // Dummy GET
    @GetMapping("/get")
    public String getData() {
        return "GET Request Successful";
    }

    // Dummy POST
    @PostMapping("/create")
    public String createData() {
        return "POST Request Successful";
    }

    // Dummy PUT
    @PutMapping("/update")
    public String updateData() {
        return "PUT Request Successful";
    }

    // Dummy DELETE
    @DeleteMapping("/delete")
    public String deleteData() {
        return "DELETE Request Successful";
    }
}