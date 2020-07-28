package ATM;

import Bank.Bank;
import Client.Client;

public class ATM {

    private Bank bank;
    private Client client;

    public ATM(Client client, Bank bank){
        this.client = client;
        this.bank = bank;
    }

    public ATM() {
    }

    public void enterPinCode(String pinCode){

    }

    public int getBalance(){
        bank.setClient(client);
       return bank.getBalance();
    }

}
