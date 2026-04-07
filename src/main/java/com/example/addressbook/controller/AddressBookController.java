package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import com.example.addressbook.service.IAddressBookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private final IAddressBookService service;

    public AddressBookController(IAddressBookService service) {
        this.service = service;
    }

    // GET ALL
    @GetMapping("/get")
    public ResponseEntity<List<AddressBook>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBook> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getById(id));
    }

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<AddressBook> create(@RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBook> update(@PathVariable int id,
                                              @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok(service.delete(id));
    }
}