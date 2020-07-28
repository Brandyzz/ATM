package ATM;

import Bank.Bank;
import Client.Client;

public class ATM extends Bank {

    private Client client;

    public ATM(Client client){
        this.client = client;
    }

    public ATM() {
    }

}
