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
        int[][] tempMat = new int[2][2];
        int[][] maxMat = new int[2][2];

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < coll - 1; j++) {
                for (int k = i, m = 0; k <= i + 1 && m <= 1; k++, m++) {
                    for (int l = j, n = 0; l <= j + 1 && n <= 1; l++, n++) {
                        tempMat[m][n] = matrix[k][l];
                        tempSum += matrix[k][l];
                        if (tempSum > max) {
                            max = tempSum;
                            maxMat = tempMat;
                        }
                    }
                }
                tempSum = 0;

            }
        }
        printMatrix(maxMat);


        System.out.println(max);
    }

    private static void printMatrix(int[][] maxMat) {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(maxMat[i][j] + " ");
            }
            System.out.println();
        }
    }


}
