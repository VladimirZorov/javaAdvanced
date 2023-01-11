//package JavaAdvanced.CarConstructors;
//
//import JavaAdvanced.CarConstructors.Car;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < n; i++) {
//
//            String[] carInfo = scanner.nextLine().split(" ");
//
//            Car car;
//           String brand = carInfo[0];
//
//            if (carInfo.length == 1) {
//
//                car = new Car(brand);
//
//            } else {
//               String model = carInfo[1];
//                int horsePower = Integer.parseInt(carInfo[2]);
//                car = new Car(brand, model, horsePower);
//            }
//                System.out.println(String.format(
//                        "The car is: %s %s - %d HP.",
//                        car.getBrand(), car.getModel(),
//                        car.getHorsePower()));
//
//        }
//    }
//}
