package workingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());


        Card card = new Card(cardSuits, cardRanks);

        System.out.printf("Card name: %s of %s; Card power: %d"
                , card.getCardRanks(), card.getCardSuits(), card.getPower());
    }
}
