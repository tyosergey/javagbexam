package org.example;

import java.util.*;

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

    public void showContacts() {
        List<Map.Entry<String, HashSet<String>>> list = new ArrayList<>(contacts.entrySet());
        list.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());

        for (Map.Entry<String, HashSet<String>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
