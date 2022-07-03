package JavaAdvanced.CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String [] carInfo = scanner.nextLine().split(" ");

            String brand = null;
            Car car = new Car(brand);

            car.setBrand(carInfo[0]);
            car.setModel(carInfo[1]);
            car.setHorsePower(Integer.parseInt(carInfo[2]));


            System.out.println(String.format(
                    "The car is: %s %s - %d HP.",
                    car.getBrand(), car.getModel(),
                    car.getHorsePower()));
        }
    }
}
