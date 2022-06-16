package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        String[] elements = scanner.nextLine().split("\\s+");


        ArrayDeque<Integer> nums = new ArrayDeque<>();

        for (int i = 0; i < Integer.parseInt(nsx[0]); i++) {
         nums.push(Integer.parseInt(elements[i]));
        }
        for (int i = 0; i < Integer.parseInt(nsx[1]); i++) {
            nums.pop();
        }
        if (nums.contains(Integer.parseInt(nsx[2]))){
            System.out.println("true");
        } else {
            System.out.println(smallest);
        }
        System.out.println();
    }
}
