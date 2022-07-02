package JavaAdvanced.MultidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        char pattern = input[1].charAt(0);

        int i = 1;

        int[][] matrix = new int[n][n];
        switch (pattern) {
            case 'A':
                for (int c = 0; c < n; c++) {
                    for (int r = 0; r < n; r++) {
                        matrix[r][c] = i;
                        i++;
                    }
                }
                break;
            case 'B':
                for (int c = 0; c < n; c++) {
                    if (c % 2 == 0) {
                        for (int r = 0; r < n; r++) {
                            matrix[r][c] = i;
                            i++;
                        }
                    } else {
                        for (int r = n-1; r >= 0; r--) {
                            matrix[r][c] = i;
                            i++;
                        }
                    }
                }
                    break;
        }
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < n; c++) {
                        System.out.print(matrix[r][c] + " ");
                    }
                    System.out.println();
                }

    }
}
