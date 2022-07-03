package JavaOOP.WorkingWithAbstractionLab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int starCount = 1; starCount <= n; starCount++) {
            printRow(n, starCount);
        }
        for (int starCount  = n-1; starCount  >=1 ; starCount --) {
            printRow(n,starCount);
        }
    }

    private static void printRow(int n, int startCount) {

        for (int i = 0; i < n - startCount; i++) {
            System.out.print(" ");
        }
        for (int col = 1; col < startCount; col++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
