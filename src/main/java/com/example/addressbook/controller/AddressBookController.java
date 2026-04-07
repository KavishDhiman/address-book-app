package com.example.addressbook.controller;

import com.example.addressbook.model.AddressBook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private List<AddressBook> list = new ArrayList<>();

    // GET ALL
    @GetMapping("/get")
    public ResponseEntity<List<AddressBook>> getAll() {
        return ResponseEntity.ok(list);
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBook> getById(@PathVariable int id) {
        return list.stream()
                .filter(data -> data.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST
    @PostMapping("/create")
    public ResponseEntity<AddressBook> create(@RequestBody AddressBook data) {
        list.add(data);
        return ResponseEntity.ok(data);
    }

    // PUT
    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBook> update(@PathVariable int id,
                                              @RequestBody AddressBook updatedData) {

        for (AddressBook data : list) {
            if (data.getId() == id) {
                data.setName(updatedData.getName());
                data.setCity(updatedData.getCity());
                return ResponseEntity.ok(data);
            }
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        boolean removed = list.removeIf(data -> data.getId() == id);

        if (removed)
            return ResponseEntity.ok("Deleted Successfully");
        else
            return ResponseEntity.notFound().build();
    }
}