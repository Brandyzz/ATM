import ATM.ATM;
import Bank.Bank;
import Client.Client;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        Bank bank = new Bank();
        Client client = new Client("John", "Snow", bank);
        ATM atm = new ATM();
        atm.setClient(client);
        if(atm.enterPinCode())
            System.out.println("Your balance: "+atm.getBalance());
    }
}
