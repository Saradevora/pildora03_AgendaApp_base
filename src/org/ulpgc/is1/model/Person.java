package org.ulpgc.is1.model;

public class Person extends Contact {

    public String firstName;
    public String lastName;

    public Person(String s, String name, String firstName, String lastName, Address address) {
        super(telephone, email);  //llama a la clase padre
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override  //sobreescribe la clase padre(Contact)
    public String getName() {
        return firstName + " " + lastName;
    }

}
