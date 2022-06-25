package Exam;

import java.util.Scanner;

public class StickyFingers {

    private static int row = 0;
    private static int coll = 0;
    private static int eatenCheese = 0;
    private static boolean mouseIsInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        String[] command = scanner.nextLine().split(",");

        char[][] field = new char[size][size];

        for (int i = 0; i < field.length; i++) {
            String[] line = scanner.nextLine().split("\\s+");
//            field[i] = line;
//
//            if (line.contains("D")) {
//                row = i;
//                coll = line.indexOf("D");
//            }
//        }

//        for (int i = 0; i < command.length; i++) {
//            if (command[i].equals("up")) {
//                moveBee(field, -1, 0);
//            } else if (command[i].equals("down")) {
//                moveBee(field, +1, 0);
//            } else if (command[i].equals("left")) {
//                moveBee(field, 0, -1);
//            } else if (command[i].equals("right")) {
//                moveBee(field, 0, +1);
//            }
//        }

            System.out.println();
        }
    }
}
