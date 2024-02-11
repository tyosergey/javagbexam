package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContacts(String name, String phoneNumber) {
        HashSet<String> numbers = contacts.getOrDefault(name, new HashSet<>());
        numbers.add(phoneNumber);
        contacts.put(name, numbers);
    }
}
