package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> milk = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        List<Double> cacao = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int MilkChocolate = 0;
        int DarkChocolate = 0;
        int BakingChocolate = 0;
        while(!milk.isEmpty() && !cacao.isEmpty())
        {
            int indexMilk = milk.get(0).intValue();
            double cacaoMixValue = indexMilk + cacao.get(cacao.size() - 1);
            double cacaoPolderValue = cacao.get(cacao.size() - 1);
            double sum = (cacaoPolderValue / cacaoMixValue) * 100;
            if (sum == 30)
            {
                MilkChocolate++;
                milk.remove(0);
                cacao.remove(cacao.size() - 1);
            } else if (sum == 50) {
                DarkChocolate++;
                milk.remove(0);
                cacao.remove(cacao.size() - 1);
            } else if (sum == 100) {
                BakingChocolate++;
                milk.remove(0);
                cacao.remove(cacao.size() - 1);
            } else {
                cacao.remove(cacao.size() - 1);
                //milk.set(indexMilk, indexMilk + 10.0);
                double upgraded = milk.get(0) + 10;
                milk.remove(0);
                milk.add(upgraded);
            }

        }

        if (MilkChocolate > 0 && DarkChocolate > 0 && BakingChocolate > 0)
        {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        if (BakingChocolate > 0) {
            System.out.println("# Baking Chocolate --> " + BakingChocolate);
        }
        if (DarkChocolate > 0) {
            System.out.println("# Dark Chocolate --> " + DarkChocolate);
        }
        if (MilkChocolate > 0) {
            System.out.println("# Milk Chocolate --> " + MilkChocolate);
        }


    }
}
