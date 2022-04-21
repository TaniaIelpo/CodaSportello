package it.devehope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaUtenti {

    private List<User> coda= new ArrayList<>();

    public ListaUtenti(){

    }
    public void insertNewPrivateUser(Scanner input){
        String nome, cognome, cf;
        System.out.println("Inserisci nome:");
        nome=input.nextLine();
        input.nextLine();
        System.out.println("Inserisci cognome:");
        cognome=input.nextLine();
        System.out.println("Inserisci codice fiscale:");
        cf=input.nextLine();
        input.nextLine();
        PrivateUser user= new PrivateUser(cf, nome, cognome );
        coda.add(user);
    }

    public void insertNewBusinessUser(Scanner input){
        String nome, cognome, azienda;
        System.out.println("Inserisci nome:");
        nome=input.nextLine();
        input.nextLine();
        System.out.println("Inserisci cognome:");
        cognome=input.nextLine();
        System.out.println("Inserisci nome azienda:");
        azienda=input.nextLine();
        BusinessUser user= new BusinessUser(azienda, nome, cognome );
        coda.add(user);
    }
    public void serviUser() {
        if(!coda.isEmpty()) {
            User user = coda.get(0);
            coda.remove(0);
            if (user instanceof BusinessUser) {
                System.out.println("Ho servito un cliente Business");
            }
            else {
                System.out.println("Ho servito un cliente Privato");
            }
        }
        else{
            System.out.println("Nessuno in coda");
        }
    }
}
