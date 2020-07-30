package Client;

import Bank.Bank.*;
import Bank.BankAccount;

public class Client {

    private String firstName;
    private String secondName;
    private final BankAccount account = new BankAccount(this);

    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
