package it.devehope;


import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        ListaUtenti coda=new ListaUtenti();
        OperatoreSportello operatoreSportello=new OperatoreSportello();
        Scanner input = new Scanner(System.in);
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
                    coda.insertNewPrivateUser(input);
                    break;
                case 2:
                    coda.insertNewBusinessUser(input);
                    break;
                case 3:
                    operatoreSportello.serviUser(coda);
                    break;
                default:
                    System.out.println("scelta non valida");

            }
        }while(choice!=0);
        input.close();
    }




}
