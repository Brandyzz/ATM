package Bank;

import Client.Client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bank{
    private String title;
    private Map<Client, BankAccount> clientsInformation;
    private int courseEUR;
    private int courseUSD;
    private int courseGBP;
    private final BankAccountCreator bankAccountCreator;

    public Bank(String title) {
        clientsInformation = new HashMap<Client, BankAccount>();
        this.title = title;
        bankAccountCreator = new BankAccountCreator(this);
    }

    public Bank(){
        bankAccountCreator = new BankAccountCreator(this);
    }

    public void setClient(Client client) {
            bankAccountCreator.createAccount(client);
    }

    public void createCard(Client client) throws IOException {
        bankAccountCreator.createCard(client);
    }

    protected void setCourseEUR(int courseEUR) {
        this.courseEUR = courseEUR;
    }

    protected void setCourseUSD(int courseUSD) {
        this.courseUSD = courseUSD;
    }

    protected void setCourseGBP(int courseGBP) {
        this.courseGBP = courseGBP;
    }

    public void setClientsInformation(Client client,BankAccount bankAccount) {
        clientsInformation.put(client, bankAccount);
    }

    public Map<Client, BankAccount> getClientsInformation() {
        return clientsInformation;
    }

    public int getCourseEUR() {
        return courseEUR;
    }

    public int getCourseUSD() {
        return courseUSD;
    }

    public int getCourseGBP() {
        return courseGBP;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
