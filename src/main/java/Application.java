import ATM.ATM;
import Bank.Bank;
import Client.Client;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client("John", "Snow");
        ATM atm = new ATM(bank);
        atm.setClient(client);
        client.getAccount().setAmount(23456);
        System.out.println(atm.getBalance());
        System.out.println(client.getAccount().getBankAccountNumber());
    }
}
