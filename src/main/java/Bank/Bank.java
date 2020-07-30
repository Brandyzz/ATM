package Bank;

import ATM.ATM;
import Client.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank{
    private final static Map<Client, BankAccount> clientsInformation = new HashMap<Client, BankAccount>();
    private int courseEUR;
    private int courseUSD;
    private int courseGBP;

    public Bank(){}

    public void setClient(Client client) {
        createAccount(client);
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

    public BankAccount createAccount(Client client){
        Random random = new Random();
        int accountNum = random.nextInt();
        BankAccount account = new BankAccount(client, accountNum);
        setClientsInformation(client,account);
        return account;
    }

    public static void setClientsInformation(Client client,BankAccount bankAccount) {
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
}
