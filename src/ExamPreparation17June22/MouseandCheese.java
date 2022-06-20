package ExamPreparation17June22;

import java.util.Scanner;

public class MouseandCheese {

    private static int row = 0;
    private static int coll = 0;
    private static int eatenCheese = 0;

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


        while (!command.equals("end")) {

            if (command.equals("up")) {
                moveMouseUp(field);
            } else if (command.equals("down")) {
                MoveMouseDown(field);
            } else if (command.contains("left")) {
                MoveMouseLeft(field);
            } else if (command.contains("right")) {
                MoveMouseRight(field);
            }


            command = scanner.nextLine();
        }


        Print2ndArray(field);
    }

    private static void MoveMouseRight(char[][] field) {
        int nextRow = row;
        int nextColl = coll + 1;
    }

    private static void MoveMouseLeft(char[][] field) {
        int nextRow = row;
        int nextColl = coll - 1;
    }

    private static void MoveMouseDown(char[][] field) {
        int nextRow = row + 1;
        int nextColl = coll;
    }

    private static void moveMouseUp(char[][] field) {
        int nextRow = row - 1;
        int nextColl = coll;

        if (field[nextRow][nextColl] == 'c') {
            eatenCheese ++;
        } else if (field[nextRow][nextColl] == 'B'){

        }

        field[row][coll] = '-';
        field[nextRow][nextColl] = '-';
        row = nextRow;
        coll = nextColl;

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
