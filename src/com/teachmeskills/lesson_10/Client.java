package com.teachmeskills.lesson_10;

import java.util.Scanner;

/**
 * There is a client.
 * The client can have any number of cards.
 * The card has three fields - cvv code, card number and amount on the card.
 * Display a message on the screen about how many identical cards the client has.
 * The field with the amount on the card should not be included in the comparison.
 * That is, two cards with the same cvv codes and numbers, but different amounts are considered the same.
 * Provide for different options for the output message - for example, the client does not have any cards at all, the client does not have any identical cards and other possible situations.
 */

public class Client {
    public static void main(String[] args) {

        System.out.println("Enter the number of client cards: ");

        Scanner scanner = new Scanner(System.in);
        int numberOfCards = scanner.nextInt();

        CreditCard[] arrayOfCards = new CreditCard[numberOfCards];

        if (numberOfCards == 0) {

            System.out.println("The client has no cards.");

        } else if (numberOfCards == 1){

            System.out.println("The client has only 1 card.");

        } else {

            for (int i = 0; i < numberOfCards; i++) {
                System.out.println("Enter cvv code, card number, and amount for card " + (i + 1) + ": ");

                double cvv = scanner.nextDouble();
                double cardNumber = scanner.nextDouble();
                double amountOnTheCard = scanner.nextDouble();

                arrayOfCards[i] = new CreditCard(amountOnTheCard, cvv, cardNumber);
            }

            int countingMatches = 1;

            for (int i = 0; i < arrayOfCards.length; i++) {
                for (int j = i + 1; j < arrayOfCards.length; j++) {
                    if (arrayOfCards[i].equals(arrayOfCards[j])) {
                        countingMatches++;
                    }
                }
            }

            if (countingMatches > 1) {
                System.out.println("The client has matching cards.");
            } else {
                System.out.println("The client does not have any matching cards.");
            }
        }
    }
}
