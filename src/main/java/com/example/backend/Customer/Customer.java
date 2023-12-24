package com.example.backend.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Customer {
    private String name;
    private Account[] accounts;
}
