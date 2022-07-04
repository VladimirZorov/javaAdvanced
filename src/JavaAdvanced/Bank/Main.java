package JavaAdvanced.Bank;
import JavaAdvanced.Bank.BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Create":
                    BankAccount account = new BankAccount();
                    account.addAccount();
                    System.out.println("Account ID" +  account.getId() +  " created");
                    break;
                case "Deposit":
                    break;
                case "SetInterest":

                    break;
                case "GetInterest":
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        System.out.println();
    }
}
