package com.teachmeskills.lesson_10.resources.creditcard;

import java.util.Objects;

public class CreditCard {

    private int cvv;
    private int cardNumber;
    private double amountOnTheCard;

    private CreditCard[] cards;

    public CreditCard(int cardNumber, int cvv, double amountOnTheCard) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amountOnTheCard = amountOnTheCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(cvv, that.cvv) == 0 && Double.compare(cardNumber, that.cardNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", amountOnTheCard=" + amountOnTheCard +
                '}';
    }

    public double getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmountOnTheCard() {
        return amountOnTheCard;
    }

    public void setAmountOnTheCard(double amountOnTheCard) {
        this.amountOnTheCard = amountOnTheCard;
    }

    public CreditCard[] getCards() {
        return cards;
    }

    public void setCards(CreditCard[] cards) {
        this.cards = cards;
    }
}
