package com.teachmeskills.lesson_10.resources.client;

import com.teachmeskills.lesson_10.resources.creditcard.CreditCard;

import java.util.Scanner;

public class Client {

    private String clientName;

    public CreditCard[] CreatingClientCards() {

        System.out.println("Enter the number of client cards:");

        Scanner scanner = new Scanner(System.in);
        int numberOfCards = scanner.nextInt();

        CreditCard[] cards = new CreditCard[numberOfCards];

        if (numberOfCards == 0) {

            System.out.println("The client has no cards.");

        } else if (numberOfCards == 1) {

            System.out.println("The client has only 1 card.");
            System.out.println("Enter cvv code, card number, and amount for card: ");

            cards[0] = new CreditCard(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());

        } else {
            for (int i = 0; i < numberOfCards; i++) {

                System.out.println("Enter cvv code, card number, and amount for card " + (i + 1) + ": ");

                cards[i] = new CreditCard(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
            }
        }

        return cards;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
