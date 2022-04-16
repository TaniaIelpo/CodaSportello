package it.devehope;

public class BusinessUser extends User{

    private String nomeAzienda;

    public BusinessUser(String azienda, String name, String surname) {
        super(name,surname);

        this.nomeAzienda =azienda;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }
}
