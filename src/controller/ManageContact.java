package controller;

import view.Menu;
import common.Library;
import model.Contact;
import model.ContactList;

public class ManageContact extends Menu<String> {

    Library lib = new Library();
    ContactList list = new ContactList();
    static String[] menu = {"Add a contact",
        "Display all contacts",
        "Delete a contact",
        "Exit"
    };

    public ManageContact() {
        super("========== PROGRAMMING CONTACT SYSTEM ==========", menu);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addNewContact();
                break;
            case 2:
                list.display();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                System.exit(0);
            default:
                return;
        }
    }


    public void addNewContact () {
        int id = list.autoCreaslistContactingID();
        String fname = lib.getString("Enter first name");
        String lname = lib.getString("Enter last name");
        String group = lib.getString("Enter group");
        String addres = lib.getString("Enter address");
        String phone = lib.getPhone("Enter phone");
        System.out.println("Successful");
        list.addContact(new Contact(id,group,addres,phone,lname,fname));
    }

    public void deleteContact() {
        list.display();
        int id = lib.getInt("Enter ID you want to delete: ",1,10000);
        list.deleteContact(id);
    }

}
