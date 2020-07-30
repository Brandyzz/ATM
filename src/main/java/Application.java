import ATM.ATM;
import Bank.Bank;
import Client.Client;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        Bank bank = new Bank();
        Client client = new Client("John", "Snow");
        ATM atm = new ATM(bank);
        atm.setClient(client);
        client.getAccount().setAmount(23456);
        if(atm.enterPinCode())
            System.out.println("Your balance: "+atm.getBalance());
        else
            System.out.println("Too many tries! Exit...");
    }
}
