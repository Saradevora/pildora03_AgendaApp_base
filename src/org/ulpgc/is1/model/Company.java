package org.ulpgc.is1.model;

public class Company extends Contact {
    public String Name;
    public String description;

    public Company(String name, String description, String telephone, String email) {
        super(telephone, email); //llama a la clase padre
        this.name = name;
        this.description = description;
    }

    @Override  //sobreescribe la clase padre(Contact)
    public String getName() {
        return name;
    }
}
