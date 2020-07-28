package Bank;

import ATM.ATM;
import Client.Client;

import java.util.HashMap;
import java.util.Map;

public class Bank{
    private Client client;
    private static Map<String, Client> clientsInformation = new HashMap<String, Client>();
    private int courseEUR;
    private int courseUSD;
    private int courseGBP;
    private int balance = 3423;

    public Bank(){}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public int getCourseEUR() {
        return courseEUR;
    }

    public int getCourseUSD() {
        return courseUSD;
    }

    public int getCourseGBP() {
        return courseGBP;
    }
}
