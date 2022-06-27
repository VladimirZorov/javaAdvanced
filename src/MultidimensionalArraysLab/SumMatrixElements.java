package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = input[0];
        int coll = input[1];

        int [] [] matrix = new int[row][coll];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix [i] = arr;
        }
int sumOfElements = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {
                sumOfElements += matrix[i][j];
            }
        }

        System.out.println(row);
        System.out.println(coll);
        System.out.println(sumOfElements);
    }
}
