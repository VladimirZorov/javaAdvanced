package JavaAdvanced.Bank;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double balance;

    BankAccount() {
        this.id = bankAccountCount++;
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    void deposit(double amount) {
        this.balance += balance;
    }
    double getInterest(int years) {
        return BankAccount.interestRate + years + this.balance;
    }
    public void addAccount() {
        id = getId();
    }
}
