package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] children = scanner.nextLine().split("\\s+");
        int toss = Integer.parseInt(scanner.nextLine());

        for (String child : children) {
            queue.offer(child);
        }

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < toss; i++) {
                queue.offer(queue.poll());

            if (isPrime(cycle)) {
                System.out.println("Prime" + " " + queue.peek());
            } else {
                System.out.println("Removed" + " " + queue.poll());
            }
            cycle++;
        }
    }
        System.out.println("Last is" + " " + queue.poll());
    }

    private static boolean isPrime(int cycle) {
        boolean isPrime = true;
        if (cycle == 1) {
            return true;
        } else {
            return false;
        }
    }

}