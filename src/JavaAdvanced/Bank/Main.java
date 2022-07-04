package JavaAdvanced.Bank;
import JavaAdvanced.Bank.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");

        Map<String, Double> accounts = new HashMap<>();

        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Create":
                    BankAccount account = new BankAccount();
                    account.addAccount();
                    System.out.println("Account ID" +  account.getId() +  " created");
                    break;
                case "Deposit":
                    accounts.put(command[1], Double.parseDouble(command[2]));
                    System.out.println("Deposited " + command[2] + " to " );

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
