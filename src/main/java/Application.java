import ATM.ATM;
import Bank.Bank;
import Client.Client;
import Bank.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    private static final Logger LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args) throws IOException, NoSuchClientException {

        Bank bank = new Bank("Sberbank");
        Client client = new Client("John", "Snow", bank);
        bank.createCard(client);
        ATM atm = new ATM();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        atm.setClient(client.getCard());
        atm.greetings();
        reader.close();
    }
}
