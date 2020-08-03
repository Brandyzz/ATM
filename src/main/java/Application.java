import ATM.ATM;
import Bank.Bank;
import Client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

        Bank bank = new Bank("Sberbank");
        Client client = new Client("John", "Snow", bank);
        ATM atm = new ATM();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        atm.setClient(client);
        atm.greetings();
        String options = reader.readLine();
        reader.close();
        while (true) {
            if (options.equals("exit")) {
                System.out.println("Thank you for your visit!");
                break;
            }
            else if (options.equals("1")) {
                System.out.println("Your balance: " + atm.getBalance());
                break;
            }
            else
                System.out.println("No such option!");
        }
    }
}
