package ATM;

import Bank.Bank;
import Client.Client;

public class ATM {

    private Bank bank;
    private Client client;

    public ATM(Bank bank){
        this.bank = bank;
    }

    public ATM() {
    }

    public void enterPinCode(String pinCode){

    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public int getBalance(){
        bank.setClient(client);
       return bank.getClient().getAccount().getAmount();
    }
}
