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
        int opt = -1;
        while (opt != 0) {
            opt = Integer.parseInt(reader.readLine());
             if (opt == 1) {
                System.out.println("Your balance: " + atm.getBalance());
            }
            else if (opt > 1)
                System.out.println("No such option!");
        }
        System.out.println("Finishing... Thanks for visit!");
        reader.close();
    }
}
