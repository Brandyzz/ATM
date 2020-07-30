package Bank;

import Client.Client;

import java.util.Random;

public class BankAccount {
    private String pinCode = "5465";
    private int bankAccountNumber;
    private String firstName;
    private String secondName;
    private int amount;
    private final static Random rand = new Random();

    public BankAccount(String firstName, String secondName, String pinCode) {
        this.bankAccountNumber = rand.nextInt();
        this.firstName = firstName;
        this.secondName = secondName;
        this.pinCode = pinCode;
    }

    public BankAccount(Client client){
        this.firstName = client.getFirstName();
        this.secondName = client.getSecondName();
        this.bankAccountNumber = rand.nextInt();
        if (this.bankAccountNumber < 0)
            this.bankAccountNumber *= -1;

    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public BankAccount() {
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
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
