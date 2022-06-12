package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print")) {
            queue.offer(input);
            if (input.equals("cancel")) {
                if (queue.size()==1) {
                    System.out.println("Printer is on standby");
                    queue.poll();
                } else {
                    System.out.println("Canceled" + " " + queue.poll());
                    if (queue.size()==1) {
                        queue.poll();
                    }else {
                        queue.pollLast();
                    }
                }
            }

            input = scanner.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
