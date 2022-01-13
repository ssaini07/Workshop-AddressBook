package com.bridgelabz.addressbooktest;

import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.ContactPerson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMainTest {
    static AddressBookMain addressBookMain = new AddressBookMain();

    @Test
    public void setUp() {
        List<AddressBookMain> addressBookMains = new ArrayList<AddressBookMain>();
        ContactPerson contactPerson = new ContactPerson("Shubham", "Saini", "Haryana",
                "Ambala", "shubham123", 45545454, 34344);

         addressBookMain.addContact();
         Assert.assertEquals(contactPerson, addressBookMain.addContact());

    }
}
