package JavaOOP.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = getCoordinates(scanner);

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);
        Point topRight = new Point(coordinates[2], coordinates[3]);

        Rectangle rect = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] pointCoordinates = getCoordinates(scanner);

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            boolean contains = rect.contains(point);


            System.out.println(contains);
        }
    }

    private static int[] getCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
