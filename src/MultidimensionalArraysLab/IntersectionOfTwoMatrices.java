package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        String[][] matA = new String[r][c];
        String[][] matB = new String[r][c];
        String[][] matC = new String[r][c];

        for (int i = 0; i < r; i++) {
            String[] arr = scanner.nextLine().split(" ");
            matA[i] = arr;
        }

        for (int i = 0; i < r; i++) {
            String[] arr = scanner.nextLine().split(" ");
            matB[i] = arr;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matA[i][j].equals(matB[i][j])) {
                    matC[i][j] = matA[i][j];
                } else {
                    matC[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
    }
}

