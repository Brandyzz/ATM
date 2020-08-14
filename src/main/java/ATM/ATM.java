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

    public ATM() {
    }

    private void inWork() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opt = -1;
        while (opt != 0) {
            opt = Integer.parseInt(reader.readLine());
            if (opt == 1) {
                System.out.println("Your balance: " + getBalance());
            }
            else if (opt > 1)
                System.out.println("No such option!");
        }
    }

    public void greetings() {
        try {
            if (enterPinCode()) {
                System.out.println("Welcome to " + bank.getTitle());
                System.out.println('\n' + "Options: " + '\n' + "1: Get balance" + '\n'+"0: for exit"+'\n');
                System.out.println("Enter the option number:");
                inWork();
                System.out.println("Finishing... Thanks for visit!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean enterPinCode() throws IOException{
        if (findClient(client) == null) {
            System.out.println("Client not found!");
            return false;
        }
        BufferedReader pinCode = new BufferedReader(new InputStreamReader(System.in));
        int attempt = 0;

        System.out.println("Please enter your pin code");
        while (attempt < 4) {
                if (client.getCard().getPinCode().toString().equals(pinCode.readLine())) {
                    System.out.println("Successfully!"+'\n');
                    return true;
            }
            System.out.println("Incorrect! Please try again");
            attempt++;
        }
        System.out.println("Sorry! Too many attempts!");
        return false;
    }

    private Client findClient(Client client){
        if (client.getCard().getBank() == null)
            return null;
        for (Map.Entry<Client, BankAccount> pair : bank.getClientsInformation().entrySet()) {
            if (pair.getKey().equals(client))
                return pair.getKey();
        }
        return null;
    }

    public int getBalance() {
        return client.getCard().getBalance();
    }

    public void setClient(DebitCard card) {
        this.client = card.getClient();
        if (card.getBank() == null)
            throw new NullPointerException();
        this.bank = card.getBank();
    }

    public Bank getBank() {
        return bank;
    }

    public Client getClient() {
        return client;
    }
}
