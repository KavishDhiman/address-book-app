package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService implements IAddressBookService {

    private final List<AddressBook> list = new ArrayList<>();
    private int counter = 1;

    // GET ALL
    @Override
    public List<AddressBook> getAll() {
        return list;
    }

    // GET BY ID
    @Override
    public AddressBook getById(int id) {
        return list.stream()
                .filter(data -> data.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("ID not found: " + id));
    }

    // CREATE
    @Override
    public AddressBook create(AddressBookDTO dto) {
        AddressBook data = new AddressBook(counter++, dto);
        list.add(data);
        return data;
    }

    // UPDATE
    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook data = getById(id); // reuse logic
        data.setName(dto.getName());
        data.setCity(dto.getCity());
        return data;
    }

    // DELETE
    @Override
    public String delete(int id) {
        AddressBook data = getById(id);
        list.remove(data);
        return "Deleted Successfully";
    }
}