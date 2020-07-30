package Bank;

import Client.Client;

import java.util.Random;

public final class BankAccount {
    private String pinCode = "5465";
    private final int bankAccountNumber = rand.nextInt();
    private String firstName;
    private String secondName;
    private int amount;
    private final static Random rand = new Random();

    public BankAccount(String firstName, String secondName, String pinCode) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.pinCode = pinCode;
    }

    public BankAccount(Client client){
        this.firstName = client.getFirstName();
        this.secondName = client.getSecondName();
    }

    public BankAccount() {
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
