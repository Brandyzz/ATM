package Bank;

import Client.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Random;

public class BankAccountCreator {
    private Bank bank;
    private static final Logger LOG = LogManager.getLogger(DebitCard.class);


    public BankAccountCreator(Bank bank) {
        this.bank = bank;
    }

    public void createAccount(Client client){
        Random random = new Random();
        BankAccount account = new BankAccount(client, random.nextInt());
        bank.setClientsInformation(client,account);
    }

    public void createCard(Client client) throws IOException{
            new DebitCard(bank, client);
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
