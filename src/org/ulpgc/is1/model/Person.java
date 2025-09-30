package org.ulpgc.is1.model;

public class Person extends Contact {

    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        super(telephone, email);  //llama a la clase padre
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override  //sobreescribe la clase padre(Contact)
    public String getName() {
        return firstName + " " + lastName;
    }

}
