package Bank;

import Client.Client;

import java.util.HashSet;
import java.util.Set;

public final class BankAccount {
    private final String bankAccountNumber;
    private final Client client;
    private final Set<DebitCard> cards;

    public BankAccount(Client client, Integer bankAccountNumber){
        this.client = client;
        cards = new HashSet<DebitCard>();
        if (bankAccountNumber < 0)
            bankAccountNumber *= -1;
        this.bankAccountNumber = bankAccountNumber.toString();
    }

    public Set<DebitCard> getCards() {
        return cards;
    }

    public void setCard(DebitCard card){
        cards.add(card);
    }

    public DebitCard findCard(DebitCard card){
        return cards.stream()
                .filter(cards -> cards.equals(card))
                .findFirst().orElseThrow(NullPointerException::new);
    }

    public Client getClient() {
        return client;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
