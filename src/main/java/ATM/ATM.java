package ATM;

import Bank.*;
import Client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

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
            if (client.getBank().getClientsInformation().get(client).getPinCode().equals(pinCode.readLine())) {
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

    private int findClientAndReturnAmount(Client client){
        for (Map.Entry<Client, BankAccount> pair : bank.getClientsInformation().entrySet()) {
            if (pair.getKey().equals(client))
                return pair.getKey().getBank().getClientsInformation().get(pair.getKey()).getAmount();
        }
        return 0;
    }

    public int getBalance() {
        int result = findClientAndReturnAmount(client);
        if (result == 0)
            System.out.println("Client not found!");
        return result;
    }
}
