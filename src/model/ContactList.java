package model;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ContactList {
    ArrayList<Contact> listContact = new ArrayList<>();
    public int autoCreaslistContactingID() {
        int id = 0;
        if (listContact.size() == 0) {
            return 1;
        } else {
            for (Contact c : listContact) {
                if (c.getID() == listContact.size()) {
                    id = c.getID() + 1;
                }
            }
        }
        return id;
    }
    
    public void addContact(Contact c) {
        listContact.add(c);
    }
    
    public void deleteContact(int id) {
        int deleted = 0;
        for (Contact contact : listContact) {
            if (contact.getID() == id) listContact.remove(contact);
            deleted = 1;
            break;
        }
        if (deleted == 0) System.out.println("That ID doee not exist"); else System.out.println("Deleted Sucessful");
        
    }
    
    public void display() {
        System.out.println("ID 	Name	 	 First Name	Last Name	Group	 Address  	Phone");
        for (Contact contact : listContact) {
            System.out.println(contact);
        }
    }



}
