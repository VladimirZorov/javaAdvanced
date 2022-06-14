package Exam1;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> steel = new ArrayDeque<>();
        ArrayDeque<Integer> carbon = new ArrayDeque<>();

        String[] metal1 = scanner.nextLine().split(" ");
        String[] metal2 = scanner.nextLine().split(" ");

        for (int i = 0; i < metal1.length; i++) {
            steel.offer(Integer.valueOf(metal1[i]));
            carbon.push(Integer.valueOf(metal2[i]));
        }
        Map<String, Integer> sword = new TreeMap<>();
        sword.put("Sabre", 0);
        sword.put("Katana", 0);
        sword.put("Shamshir", 0);
        sword.put("Gladius", 0);

        while (!steel.isEmpty() && !carbon.isEmpty()) {

            int firstSt = steel.poll();
            int firstCarb = carbon.pop();
            if (firstCarb + firstSt == 70) {
                sword.put("Gladius", sword.get("Gladius") + 1);
            } else if (firstCarb + firstSt == 80) {
                sword.put("Shamshir", sword.get("Shamshir") + 1);
            } else if (firstCarb + firstSt == 90) {
                sword.put("Katana", sword.get("Katana") + 1);
            } else if (firstCarb + firstSt == 110) {
                sword.put("Sabre", sword.get("Sabre") + 1);
            } else {
                carbon.push(firstCarb + 5);
            }
        }
        int sum = sword.values().stream().mapToInt(Integer::intValue).sum();
        if (sum != 0) {
            System.out.printf("You have forged %d swords.%n", sum);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }
        if (steel.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            String collect = steel.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Steel left: " + collect);
        }
        if (carbon.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            List<String> collect = carbon.stream().map(String::valueOf).collect(Collectors.toList());
            Collections.reverse(collect);
            System.out.println("Carbon left: " + String.join(", ", collect));
        }
        sword.entrySet().stream()
                .filter(e -> e.getValue() != 0)
                .forEach(el -> System.out.println(el.getKey() + ": " + el.getValue()));
    }
}