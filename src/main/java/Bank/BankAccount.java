package Bank;

import Client.Client;

import java.util.Random;

public final class BankAccount {
    private String pinCode = "5465";
    private final int bankAccountNumber;
    private String firstName;
    private String secondName;
    private int amount = 34567;
    private final Client client;

    public BankAccount(Client client, int bankAccountNumber){
        this.firstName = client.getFirstName();
        this.secondName = client.getSecondName();
        this.client = client;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAmount() {
        return amount;
    }
}
