package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = input[0];
        int coll = input[1];

        int[][] matrix = new int[row][coll];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < coll; c++) {
                if (matrix[r][c] == n) {
                    System.out.println(r + " " + c);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("not found");
        }
    }
}
