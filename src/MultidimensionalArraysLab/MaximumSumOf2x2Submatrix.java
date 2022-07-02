package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = input[0];
        int coll = input[1];

        int[][] matrix = new int[row][coll];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        int tempSum = 0;
        int max = Integer.MIN_VALUE;
        int[][] maxMat = new int[2][2];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {
                for (int k =0; k <= 1; k++) {
                    for (int l = 0; l <= 1; l++) {
                        maxMat[k][l] = matrix[k][l];
                        tempSum += matrix[k][l];
                        if (tempSum>max) {
                            max = tempSum;
                        }
                    }
                }
            }
        }

        System.out.println();
    }
}
