package Client;

import Bank.*;

public class Client {

    private String firstName;
    private String secondName;
    private DebitCard card;

    public Client(String firstName, String secondName, Bank bank) {
        this.firstName = firstName;
        this.secondName = secondName;
        bank.setClient(this);
    }

    public Client() {
    }

//    public BankAccount getAccount(){
//        return bank.getClientsInformation().get(this);
//    }


    public DebitCard getCard() throws NullPointerException {
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
