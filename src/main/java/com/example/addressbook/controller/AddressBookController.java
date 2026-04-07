package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import com.example.addressbook.service.IAddressBookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
        log.info("Fetching all address book entries");
        return ResponseEntity.ok(service.getAll());
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBook> getById(@PathVariable int id) {
        log.info("Fetching address with ID: {}", id);
        return ResponseEntity.ok(service.getById(id));
    }

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<AddressBook> create(@Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBook> update(@PathVariable int id,
                                              @Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }
    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        log.info("Deleting address with ID: {}", id);
        return ResponseEntity.ok(service.delete(id));
    }
}