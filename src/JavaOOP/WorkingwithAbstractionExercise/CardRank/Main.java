package JavaOOP.WorkingwithAbstractionExercise.CardRank;

import JavaOOP.WorkingwithAbstractionExercise.CardSuit.CardSuits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        Arrays.stream(CardRank.values())
                .forEach(cardRank -> System.out.printf
                        ("Ordinal value: %d; Name value: %s%n",
                                cardRank.ordinal(), cardRank.name()));
    }
}

