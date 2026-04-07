package com.example.addressbook.model;

import com.example.addressbook.dto.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook {

    private int id;
    private String name;
    private String city;

    public AddressBook(int id, AddressBookDTO dto) {
        this.id = id;
        this.name = dto.getName();
        this.city = dto.getCity();
    }
}