package ExamPreparation20June22;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liliesStack = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(rosesQueue::push);
//        int sum = 0;
        int wreaths = 0;
        int restFlowers = 0;

        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {
            int lastLilies = liliesStack.pop();
             int sum = rosesQueue.poll() + lastLilies;

            if (sum > 15) {
                while (sum > 15) {
                    sum = sum -2;
                }
            }

            if (sum == 15) {
                wreaths++;
            } else if (sum < 15) {
                restFlowers += sum;
            }

            sum = 0;

        }
        int wreaths1 = restFlowers/15;
        wreaths += wreaths1;


        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }
    }
}
