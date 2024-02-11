package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContacts("Sergey", "123456789");
        phoneBook.addContacts("Sergey", "987654321");
        phoneBook.addContacts("Sergey", "987321654");
        phoneBook.addContacts("Victoria", "456789123");
        phoneBook.addContacts("Ivan", "654231897");
        phoneBook.addContacts("Victoria", "789123456");

        phoneBook.showContacts();
    }
}
