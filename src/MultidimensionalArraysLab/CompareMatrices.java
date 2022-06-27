package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimFirst = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firsMatRow = dimFirst[0];
        int firsMatColl = dimFirst[1];

        int[][] firsMat = new int[firsMatRow][firsMatColl];

        for (int i = 0; i < firsMatRow; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firsMat[i] = arr;
        }

        int[] dimSecond = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondMatRow = dimSecond[0];
        int secondMatColl = dimSecond[1];

        int[][] secondMat = new int[secondMatRow][secondMatColl];

        for (int i = 0; i < secondMatRow; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMat[i] = arr;
        }
        boolean isEqual = true;
        if (dimFirst.length != dimSecond.length
                || dimFirst[0] != dimSecond[0] || dimFirst[1] != dimSecond[1]){
            isEqual = false;

        }
if (isEqual) {
    for (int row = 0; row < dimFirst[0]; row++) {
        for (int coll = 0; coll < dimFirst[1]; coll++) {
            if (firsMat[row][coll] != secondMat[row][coll]) {
                isEqual = false;
                break;
            }
        }
    }
}
        if ( !isEqual) {
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }
    }

}
