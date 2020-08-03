package Bank;

import Client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank{
    private String title;
    private final static Map<Client, BankAccount> clientsInformation = new HashMap<Client, BankAccount>();
    private int courseEUR;
    private int courseUSD;
    private int courseGBP;

    public Bank(String title) {
        this.title = title;
    }

    public Bank(){}

    public void setClient(Client client) {
        try {
            createAccount(client);
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public void createAccount(Client client) throws IOException {
        Random random = new Random();
        BankAccount account = new BankAccount(client, random.nextInt());
        System.out.println("Enter your new pin code");
        BufferedReader pinCodeCreate = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String builder = pinCodeCreate.readLine();
            if (!builder.matches("\\d+")) {
                System.out.println("The pin code must contain only numbers! Try again.");
                continue;
            }
            if(builder.length() != 4) {
                System.out.println("The pin code must consist of 4 numbers! Try again.");
                continue;
            }
            account.setPinCode(builder);
            setClientsInformation(client,account);
            return;
        }
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
