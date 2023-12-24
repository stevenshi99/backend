package com.example.backend.Controller;

import com.example.backend.Customer.Customer;
import com.example.backend.Service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/")
    public String index() {
        return "Hello";
    }

    @GetMapping("/customer")
    @ResponseBody
    public Customer getCustomerById(@RequestParam int id) {
        return CustomerService.getCustomerById(id);
    }

}
