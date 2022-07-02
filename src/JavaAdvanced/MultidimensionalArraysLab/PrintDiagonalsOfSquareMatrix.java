package JavaAdvanced.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int matrix [][] = new int[n][n];
        for (int i = 0; i < n; i++) {

            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix [i] = input;
        }

        for (int r = 0, c= 0 ; r < n && c < n; r++, c ++) {
            System.out.print(matrix[r][c] + " ");
        }
        System.out.println();

        for (int r = n-1, c= 0 ; r >= 0 && c < n; r--, c ++) {
            System.out.print(matrix[r][c] + " ");
        }

    }
}
