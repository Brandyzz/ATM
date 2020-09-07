package ATM;

import Bank.*;
import Client.Client;
import org.apache.logging.log4j.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ATM {
    private static final Logger LOG = LogManager.getLogger(ATM.class);
    private Bank bank;
    private Client client;

    public ATM() {
    }

    private void inWork() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opt = -1;
        while (opt != 0) {
            opt = Integer.parseInt(reader.readLine());
            if (opt == 1) {
                LOG.info("Your balance: " + getBalance());
            }
            else if (opt > 1)
                LOG.info("No such option!");
        }
    }

    public void greetings() throws IOException, NoSuchClientException {
            if (enterPinCode()) {
                LOG.info("Welcome to " + bank.getTitle());
                LOG.info('\n' + "Options: " + '\n' + "1: Get balance" + '\n'+"0: for exit"+'\n');
                LOG.info("Enter the option number:");
                inWork();
                LOG.info("Finishing... Thanks for visit!");
            }
    }

    public boolean enterPinCode() throws IOException, NoSuchClientException {
        if (!findClient(client)) {
           throw new NoSuchClientException("Client not found!");
        }
        BufferedReader pinCode = new BufferedReader(new InputStreamReader(System.in));
        int attempt = 0;

        LOG.info("Please enter your pin code");
        while (attempt < 4) {
                if (client.getCard().getPinCode().toString().equals(pinCode.readLine())) {
                    LOG.info("Successfully!"+'\n');
                    return true;
            }
            LOG.info("Incorrect! Please try again");
            attempt++;
        }
        LOG.info("Sorry! Too many tries!");
        return false;
    }

    private boolean findClient(Client client){
       return bank.getClientsInformation().containsKey(client);
    }

    public int getBalance() {
        return client.getCard().getBalance();
    }

    public void setClient(DebitCard card){
        client = card.getClient();
        bank = card.getBank();
    }

    public Bank getBank() {
        return bank;
    }

    public Client getClient() {
        return client;
    }
}
