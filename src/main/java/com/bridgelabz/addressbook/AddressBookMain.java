package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {


    //Declaring method to get inputs from a user
    public List<ContactPerson> addContact() {

        List<ContactPerson> contact = new ArrayList<ContactPerson>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.next();
        System.out.println("Enter your last name");
        String lastName = sc.next();
        System.out.println("Enter your state");
        String state = sc.next();
        System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Enter your email");
        String email = sc.next();
        System.out.println("Enter your phone number");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter your zip");
        long zip = sc.nextLong();
        contact.add(new ContactPerson(firstName, lastName, state, city, email, phoneNumber, zip));

        return contact;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to address book management system!!");
        //addContact();
    }
}
