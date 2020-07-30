package ATM;

import Bank.Bank;
import Client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {

    private Bank bank;
    private Client client;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public ATM() {
    }

    public boolean enterPinCode() throws IOException {
        BufferedReader pinCode = new BufferedReader(new InputStreamReader(System.in));
        int tries = 0;
        boolean result = false;

        System.out.println("Please enter your pin code");
        while (tries < 4) {
            if (client.getAccount().getPinCode().equals(pinCode.readLine())) {
                result = true;
                System.out.println("Successfully!");
                break;
            }
            System.out.println("Incorrect! Please try again");
            tries++;
        }
        pinCode.close();
        return result;

    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public int getBalance() {
        bank.setClient(client);
        return bank.getClient().getAccount().getAmount();
    }
}
