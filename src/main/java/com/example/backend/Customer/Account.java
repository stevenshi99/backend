package com.example.backend.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Account {
    private int id;
    private String name;
    private double amount;
}
