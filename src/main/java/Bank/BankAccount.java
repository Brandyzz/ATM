package Bank;

import Client.Client;

import java.util.HashSet;
import java.util.Set;

public final class BankAccount {
    private final String bankAccountNumber;
    private final Client client;
    private final Set<DebitCard> cards = new HashSet<DebitCard>();

    public BankAccount(Client client, Integer bankAccountNumber){
        this.client = client;
        this.bankAccountNumber = bankAccountNumber.toString();
    }

    public Set<DebitCard> getCards() {
        return cards;
    }

    public void setCard(DebitCard card){
        this.cards.add(card);
    }

    public DebitCard findCard(final DebitCard card){
        for (DebitCard finder : cards) {
            if(finder.equals(card))
                return finder;
        }
        return null;
    }

    public Client getClient() {
        return client;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
