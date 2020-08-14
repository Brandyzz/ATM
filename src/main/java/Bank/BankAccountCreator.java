package Bank;

import Client.Client;

import java.io.IOException;
import java.util.Random;

public class BankAccountCreator {
    private Bank bank;

    public BankAccountCreator(Bank bank) {
        this.bank = bank;
    }

    public void createAccount(Client client){
        Random random = new Random();
        BankAccount account = new BankAccount(client, random.nextInt());
        bank.setClientsInformation(client,account);
    }

    public void createCard(Client client){
        try {
            new DebitCard(client.getBank(), client);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
