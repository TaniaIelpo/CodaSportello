package it.devehope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    private static List<User> coda= new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    int choice;
    do{
            System.out.println("Se vuoi inserire un cliente privato in coda digita 1\n" +
                "Se vuoi inserire un cliente business in coda digita 2\n" +
                "Se vuoi servire un cliente in coda digita 3\n" +
                "Per uscire digita 0");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    insertNewPrivateUser();
                    break;
                case 2:
                    insertNewBusinessUser();
                    break;
                case 3:
                    serviUser();
                    break;
                default:
                    System.out.println("scelta non valida");

            }
        }while(choice!=0);
    }

    private static void serviUser() {
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

    private static void insertNewPrivateUser() {
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

    private static void insertNewBusinessUser(){
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
}
