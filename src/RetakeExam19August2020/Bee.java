package RetakeExam19August2020;

import java.util.Scanner;

public class Bee {

    public static int row = 0;
    public static int coll = 0;
    public static  int pollinatedFlowers = 0;
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

            } else if (command.equals("down")) {

            } else if (command.equals("left")) {

            } else if (command.equals("right")) {

            }

            if (!isBeeInField) {
                break;

                command = scanner.nextLine();
            }
            if (!isBeeInField) {
                System.out.println("Where is the mouse?");
            }


            System.out.println(field);
        }
    }
    }

