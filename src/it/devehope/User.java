package it.devehope;

public abstract class User {

    private String name;
    private String Surname;

    public User(String name, String surname) {
        this.name = name;
        Surname = surname;
    }


    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
