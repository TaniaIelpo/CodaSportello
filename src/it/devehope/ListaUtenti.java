package it.devehope;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaUtenti {

    private LinkedList<User> coda= new LinkedList<>();

    public ListaUtenti(){

    }

    public LinkedList<User> getCoda() {
        return coda;
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
        PrivateUser user= new PrivateUser(cf, nome, cognome );
        coda.addLast(user);
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
        coda.addLast(user);
    }

}
