package Bank;

import Client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DebitCard {
    private final Bank bank;
    private final Client client;
    private final BankAccount bankAccount;
    private int balance = 43214;
    private int pinCode;

    public DebitCard(Bank bank, Client client) throws IOException {
        this.bank = bank;
        this.client = client;
        this.bankAccount = bank.getClientsInformation().get(client);
        System.out.println("Creating new Card.");
        System.out.println("Enter new pin code.");
        BufferedReader pinCodeCreate = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while (true) {
            if (!builder.toString().equals(""))
                builder.delete(0, builder.length());
                builder.append(pinCodeCreate.readLine());
            if (!builder.toString().matches("\\d+")) {
                System.out.println("The pin code must contain only numbers! Try again.");
                continue;
            }
            if (builder.length() != 4) {
                System.out.println("The pin code must consist of 4 numbers! Try again.");
                continue;
            }
            pinCode = Integer.parseInt(builder.toString());
            break;
        }
        client.setCard(this);
        bankAccount.setCard(this);
    }


    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setPinCode() throws IOException {
        System.out.println("Enter new pin code");
        BufferedReader pinCodeCreate = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while (true) {
            if (!builder.toString().equals(""))
                builder.delete(0, builder.length());
            builder.append(pinCodeCreate.readLine());
            if (!builder.toString().matches("\\d+")) {
                System.out.println("The pin code must contain only numbers! Try again.");
                continue;
            }
            if (builder.length() != 4) {
                System.out.println("The pin code must consist of 4 numbers! Try again.");
                continue;
            }
            pinCode = Integer.parseInt(builder.toString());
            break;
        }
    }

    public int getBalance() {
        return balance;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public Bank getBank(){
        return bank;
    }

    public Client getClient(){
        return client;
    }
}
