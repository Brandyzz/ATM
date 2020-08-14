package Client;

import Bank.*;

public class Client {

    private String firstName;
    private String secondName;
    private Bank bank;
    private DebitCard card;

    public Client(String firstName, String secondName, Bank bank) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.bank = bank;
        this.bank.setClient(this);
    }

    public Client() {
    }

//    public BankAccount getAccount(){
//        return bank.getClientsInformation().get(this);
//    }

    public Bank getBank() {
        return bank;
    }

    public DebitCard getCard() {
        return card;
    }

    public void setCard(DebitCard card) {
        this.card = card;
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
