package ExamPreparation20June22;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lilies = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).toList();
        List<Integer> roses = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).toList();

        ArrayDeque <Integer> liliesQueue = new ArrayDeque<>(lilies);
        ArrayDeque <Integer> rosesQueue = new ArrayDeque<>(roses);



        System.out.println(liliesQueue);
        System.out.println(rosesQueue);
    }
}
