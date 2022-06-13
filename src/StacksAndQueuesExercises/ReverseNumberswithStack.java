package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String [] nums = scanner.nextLine().split("\\s+");
        for (int i = 0; i < nums.length; i++) {
            stack.push(Integer.valueOf(nums[i]));
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(stack.pop() + " ");
        }

    }
}
