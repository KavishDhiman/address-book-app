package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;

import java.util.List;

public interface IAddressBookService {

    List<AddressBook> getAll();

    AddressBook getById(int id);

    AddressBook create(AddressBookDTO dto);

    AddressBook update(int id, AddressBookDTO dto);

    String delete(int id);
}