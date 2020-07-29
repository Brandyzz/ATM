import ATM.ATM;
import Bank.Bank;
import Client.Client;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client("123456789", "kek", "kok");
        ATM atm = new ATM(bank);
        atm.setClient(client);
        System.out.println(atm.getBalance());
    }
}
