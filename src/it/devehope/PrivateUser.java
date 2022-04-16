package it.devehope;

public class PrivateUser extends User{

    private String cf;



    public PrivateUser( String cf, String name, String surname) {
        super(name, surname);
        this.cf=cf;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
}
