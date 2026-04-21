package com.example.contactapp;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class ContactController {

    private List<Contact> contacts = new ArrayList<>();

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    @PostMapping("/contacts")
    public Contact addContact(@RequestBody Contact contact) {
        contacts.add(contact);
        return contact;
    }
}
