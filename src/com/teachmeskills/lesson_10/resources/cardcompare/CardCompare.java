package com.teachmeskills.lesson_10.resources.cardcompare;

import com.teachmeskills.lesson_10.resources.creditcard.CreditCard;

public class CardCompare {

    public static int CardComparison(CreditCard[] cards) {

        int numberOfMatches = 0;

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                System.out.println("Compare card = " + cards[i] + " with card = " + cards[j]);
                if (cards[i].equals(cards[j])) {
                    System.out.println("The cards are equal");
                    numberOfMatches++;
                    System.out.println("We already have duplicates = " + numberOfMatches);
                } else {
                    System.out.println("The cards are not equal");
                }
                System.out.println("---------------------");
            }

            if (numberOfMatches > 0) {
                break;
            }
        }

        System.out.println("Total number of duplicates: ");
        return numberOfMatches;
    }

}
