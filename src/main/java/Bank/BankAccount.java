package Bank;

import Client.Client;

import java.util.Random;

public final class BankAccount {
    private String pinCode;
    private final int bankAccountNumber;
    private int amount = 34567;
    private final Client client;

    public BankAccount(Client client, int bankAccountNumber){
        this.client = client;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getAmount() {
        return amount;
    }
}
