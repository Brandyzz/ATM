package Client;

public class Client {

    private String bankAccountNumber;
    private String firstName;
    private String secondName;

    public Client(String bankAccountNumber, String firstName, String secondName) {
        this.bankAccountNumber = bankAccountNumber;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
