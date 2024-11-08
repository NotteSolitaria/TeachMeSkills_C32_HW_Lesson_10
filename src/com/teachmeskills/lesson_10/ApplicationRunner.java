package com.teachmeskills.lesson_10;

import com.teachmeskills.lesson_10.resources.cardcompare.CardCompare;
import com.teachmeskills.lesson_10.resources.client.Client;

/**
 * There is a client.
 * The client can have any number of cards.
 * The card has three fields - cvv code, card number and amount on the card.
 * Display a message on the screen about how many identical cards the client has.
 * The field with the amount on the card should not be included in the comparison.
 * That is, two cards with the same cvv codes and numbers, but different amounts are considered the same.
 * Provide for different options for the output message - for example, the client does not have any cards at all, the client does not have any identical cards and other possible situations.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Client client = new Client();

        client.setClientName("Daniil");

        int resultOfComparison = CardCompare.CardComparison(client.CreatingClientCards());

        System.out.println(resultOfComparison);
    }
}
