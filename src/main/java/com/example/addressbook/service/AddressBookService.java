package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService implements IAddressBookService {

    // In-memory storage
    private final List<AddressBook> list = new ArrayList<>();

    // Auto ID generator
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
                .orElseThrow(() -> new RuntimeException("Address not found with ID: " + id));
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
        AddressBook existing = getById(id); // reuse logic

        existing.setName(dto.getName());
        existing.setCity(dto.getCity());

        return existing;
    }

    // DELETE
    @Override
    public String delete(int id) {
        AddressBook existing = getById(id);
        list.remove(existing);
        return "Deleted Successfully";
    }
}