package com.teachmeskills.lesson_10;

import java.util.Objects;

public class CreditCard {

    double cvv;
    double cardNumber;
    double amountOnTheCard;

    public CreditCard(double amountOnTheCard, double cvv, double cardNumber) {
        this.amountOnTheCard = amountOnTheCard;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
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
}
