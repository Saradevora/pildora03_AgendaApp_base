package org.ulpgc.is1.model;

import java.util.List;

public abstract class Contact {
    public String telephone;
    public String email;
    public Address address;


    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

    public void setEmail(String email) { //cambia el mail
        this.email = email;
    }

    public void setTelephone(String telephone) {  //cambia el teléfono
        this.telephone = telephone;
    }

    public abstract String getName();
}