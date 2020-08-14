package Bank;

import Client.Client;

public final class BankAccount {
    private String pinCode;
    private final String bankAccountNumber;
    private int amount = 34567;
    private final Client client;

    public BankAccount(Client client, Integer bankAccountNumber){
        this.client = client;
        this.bankAccountNumber = bankAccountNumber.toString();
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

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getAmount() {
        return amount;
    }
}
