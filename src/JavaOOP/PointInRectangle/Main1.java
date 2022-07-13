package JavaOOP.PointInRectangle;

import JavaOOP.person.Car;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());

        String Model = null;
        double fuelAmount = 0.0;
        double fuelForKilometer = 0.0;
        double drivingDistance = 0.0;

        List<Car> models = new ArrayList<>();
        TreeMap<Car, Double> drivingCar = new TreeMap<>();

        Car car = new Car();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split(" ");
            if (!command[0].equals("Drive")) {
                Model = command[0];
                fuelAmount = Double.parseDouble(command[1]);
                fuelForKilometer = Double.parseDouble(command[2]);
                car = new Car(Model, fuelAmount, fuelForKilometer);
                models.add(car);
            } else {
                Model = command[1];
                drivingDistance = Double.parseDouble(command[2]);
                if (car.hasEnoughFuel()) {
                    drivingDistance = Double.parseDouble(command[2]);
                    car.driving();
                }

            }

            input = scanner.nextLine();
        }

        System.out.println();
    }
}
