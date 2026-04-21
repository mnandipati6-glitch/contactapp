package com.example.contactapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    private List<Contact> contacts = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "Contact Manager Running 🚀";
    }

    @PostMapping("/add")
    public String addContact(@RequestBody Contact contact) {
        contacts.add(contact);
        return "Contact Added";
    }

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return contacts;
    }
}