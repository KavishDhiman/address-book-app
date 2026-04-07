package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBook> list = new ArrayList<>();
    private int counter = 1;

    @Override
    public List<AddressBook> getAll() {
        return list;
    }

    @Override
    public AddressBook getById(int id) {
        return list.stream()
                .filter(data -> data.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressBook create(AddressBookDTO dto) {
        AddressBook data = new AddressBook(counter++, dto);
        list.add(data);
        return data;
    }

    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        for (AddressBook data : list) {
            if (data.getId() == id) {
                data.setName(dto.getName());
                data.setCity(dto.getCity());
                return data;
            }
        }
        return null;
    }

    @Override
    public String delete(int id) {
        boolean removed = list.removeIf(data -> data.getId() == id);
        return removed ? "Deleted Successfully" : "ID Not Found";
    }
}