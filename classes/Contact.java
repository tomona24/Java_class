package classes;

import com.sun.xml.internal.ws.spi.db.FieldSetter;

public class Contact {
    // fields
    String name;
    String phone;
    String mail;


    // constructor
    Contact(String name, String phone, String mail){
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
