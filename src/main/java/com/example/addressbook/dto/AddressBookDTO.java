package com.example.addressbook.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AddressBookDTO {

    @NotBlank(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z ]{2,50}$",
            message = "Name must contain only alphabets and be 2-50 characters long")
    private String name;

    private String city;
}