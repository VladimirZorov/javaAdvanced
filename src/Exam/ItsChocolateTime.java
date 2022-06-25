package Exam;

import java.util.*;
import java.util.stream.Collectors;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milk = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Double> cacao = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(cacao::push);

        Map<String, Integer> chocolateTypes = new TreeMap<>();

        chocolateTypes.put("Milk Chocolate", 0);
        chocolateTypes.put("Dark Chocolate", 0);
        chocolateTypes.put("Baking Chocolate", 0);

        double sum = 0.0;
        double divide = 0.0;
        while (!milk.isEmpty() && !cacao.isEmpty()) {
            double lastMilk = milk.poll();
            double lastCacao = cacao.pop();
            sum = lastCacao + lastMilk;
            divide = (lastCacao / sum) * 100;

            String coocedChoco = null;
            switch ((int) divide) {
                case 30:
                    coocedChoco = "Milk Chocolate";
                    break;
                case 50:
                    coocedChoco = "Dark Chocolate";
                    break;
                case 100:
                    coocedChoco = "Baking Chocolate";
                    break;
            }


            if (coocedChoco != null) {
                int newVal = chocolateTypes.get(coocedChoco) + 1;
                chocolateTypes.put(coocedChoco, newVal);
            } else {

//                milk.push(lastMilk + 10);
            }
        }
        boolean allFoodsAreCooked = chocolateTypes.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (allFoodsAreCooked) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
//        chocolateTypes.entrySet()
//                .forEach(e -> System.out.println( "# " + e.getKey() + " --> " + e.getValue()));

//        for (int i = 0; i < chocolateTypes.size(); i++) {
//            if (chocolateTypes.entrySet().forEach(e -> e.getValue());
//        }

        chocolateTypes.entrySet()
                .forEach(e -> System.out.println("# " + e.getKey() + " --> " +  e.getValue()));
    }
}
