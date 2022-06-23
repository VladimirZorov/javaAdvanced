package RetakeExam19August2020;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();
        }

        System.out.println(field);
    }
}
