package RetakeExam19August2020;

import java.util.Scanner;

public class Bee {

    public static int row = 0;
    public static int coll = 0;
    public static int pollinatedFlowers = 0;
    public static boolean isBeeInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            if (line.contains("B")) {
                row = i;
                coll = line.indexOf("B");
            }
        }
        int pollination = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.equals("up")) {
                moveBee(field, -1, 0);
            } else if (command.equals("down")) {
                moveBee(field, +1, 0);
            } else if (command.equals("left")) {
                moveBee(field, 0, -1);
            } else if (command.equals("right")) {
                moveBee(field, 0, +1);
            }

            if (!isBeeInField) {
                break;
            }
                command = scanner.nextLine();
            }

            if (!isBeeInField) {
                System.out.println("The bee got lost");
            }
            if (pollinatedFlowers >= 5) {
                System.out.printf("Great job, the bee manage to pollinate %d flowers!", pollinatedFlowers);
                System.out.println();
            } else {
                System.out.printf("The bee couldn't pollinate the flowers, she needed {needed} flowers more"
                        , (5 - pollinatedFlowers));
                System.out.println();
            }


            Print2ndArray(field);
        }


    private static void moveBee(char[][] field, int rowMut, int collMut) {
        int nextRow = row + rowMut;
        int nextColl = coll + collMut;

        boolean isBonusHit = false;

        if (!isInBounds(field, nextRow, nextColl)) {
            field[row][coll] = '-';
            isBeeInField = false;
            return;
        }

        if (field[nextRow][nextColl] == 'c') {
            pollinatedFlowers++;
        } else if (field[nextRow][nextColl] == 'B') {
            isBonusHit = true;
        }

        field[row][coll] = '.';
        field[nextRow][nextColl] = 'M';
        row = nextRow;
        coll = nextColl;

        if (isBonusHit) {
            moveBee(field, rowMut, collMut);
        }
    }
    private static boolean isInBounds( char[][] field, int r, int c) {
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







