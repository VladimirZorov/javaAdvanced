package ExamPreparation17June22;

import java.util.Scanner;

public class MouseandCheese {

    private static int row = 0;
    private static int coll = 0;
    private static int eatenCheese = 0;
    private static boolean mouseIsInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            if (line.contains("M")) {
                row = i;
                coll = line.indexOf("M");
            }
        }

        String command = scanner.nextLine();


        while (!command.equals("end") && mouseIsInField) {

            if (command.equals("up")) {
                moveMouse(field, row - 1, coll);
            } else if (command.equals("down")) {
                moveMouse(field, row + 1, coll);
            } else if (command.contains("left")) {
                moveMouse(field, row, coll - 1);
            } else if (command.contains("right")) {
                moveMouse(field, row, coll + 1);
            }


            command = scanner.nextLine();
        }

        if (eatenCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!", eatenCheese);
        }else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.", (5- eatenCheese));
        }


        Print2ndArray(field);
    }

    private static void moveMouse(char[][] field, int nextRow, int nextColl) {

        if (!isInBounds(field, nextRow, nextColl)){
            mouseIsInField = false;
            return;
        }

        if (field[nextRow][nextColl] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextColl] == 'B') {

        }

        field[row][coll] = '-';
        field[nextRow][nextColl] = '-';
        row = nextRow;
        coll = nextColl;

    }

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r <= field.length && c >= 0 && c <= field[r].length;
    }

    private static void Print2ndArray(char[][] field) {
        for (char[] arr : field) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
