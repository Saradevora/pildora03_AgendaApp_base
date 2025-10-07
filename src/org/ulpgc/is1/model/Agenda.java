package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Contact> contactList;
    public List<Group> groupList;

    public Agenda() {
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        contactList.add(person);
    }

    public void addCompany(Company company) {
        contactList.add(company);
    }

    public void addGroup(Group group) {
        groupList.add(group);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void addContact2Group(Contact contact, Group group) {
        group.addContact(contact);
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, Address address) {
        Person person = new Person(firstName, lastName, telephone, email, address);
        contactList.add(person);
    }

    public void addCompany(String name, String description, String telephone, String email, Address address) {
        Company company = new Company(name, description, telephone, email, address);
        contactList.add(company);
    }

    public void removeContact(Contact contact) {
        contactList.remove(contact);
    }

    public void removeGroup(Group group) {
        groupList.remove(group);
    }


}