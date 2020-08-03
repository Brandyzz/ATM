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

    public ATM(Bank bank, Client client) {
        this.bank = bank;
        this.client = client;
    }

    public ATM() {
    }

    public void greetings() {
        try {
            if (enterPinCode()) {
                System.out.println("Welcome to " + bank.getTitle());
                System.out.println('\n' + "Options: " + '\n' + "1: Get balance" + '\n'+"exit: for finish the job"+'\n');
                System.out.println("Enter the option number:");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean enterPinCode() throws IOException {
        if (findClient(client) == null) {
            System.out.println("Client not found!");
            return false;
        }
        BufferedReader pinCode = new BufferedReader(new InputStreamReader(System.in));
        int tries = 0;
        boolean result = false;

        System.out.println("Please enter your pin code");
        while (tries < 4) {
            if (client.getBank().getClientsInformation().get(client).getPinCode().equals(pinCode.readLine())) {
                result = true;
                System.out.println("Successfully!"+'\n');
                break;
            }
            System.out.println("Incorrect! Please try again");
            tries++;
        }
        return result;
    }

    private Client findClient(Client client){
        if (client.getBank()==null)
            return null;
        for (Map.Entry<Client, BankAccount> pair : bank.getClientsInformation().entrySet()) {
            if (pair.getKey().equals(client))
                return pair.getKey();
        }
        return null;
    }

    public int getBalance() {
        Client client = findClient(this.client);
        if (client == null)
            System.out.println("Client not found!");
        return bank.getClientsInformation().get(client).getAmount();
    }

    public void setClient(Client client) {
        this.client = client;
        this.bank = client.getBank();
    }

    public Bank getBank() {
        return bank;
    }

    public Client getClient() {
        return client;
    }
}
