package it.devehope;

import java.util.LinkedList;

public class OperatoreSportello {

    public OperatoreSportello(){}


    public void serviUser(ListaUtenti lista) {
        LinkedList<User> coda= lista.getCoda();
        if(!coda.isEmpty()) {
            User user = coda.getFirst();
            coda.removeFirst();
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
