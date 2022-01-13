package com.bridgelabz.addressbook;

public class ContactPerson {
    //creating instance variables
    private String firstName, lastName, state, city, email;
    private long phoneNumber, zip;

    // creating constructor
    public ContactPerson(String firstName, String lastName, String state, String city, String email, long phoneNumber, long zip) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }
}
