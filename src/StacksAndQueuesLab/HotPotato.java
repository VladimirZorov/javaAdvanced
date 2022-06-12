package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] children = scanner.nextLine().split("\\s+");
        int toss = Integer.parseInt(scanner.nextLine());

        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < toss; i++) {
                queue.offer(queue.poll());
                System.out.println("Removed" + " " + queue.poll());
            }
            System.out.println("Last is" + " " + queue.poll());
        }

    }
}
