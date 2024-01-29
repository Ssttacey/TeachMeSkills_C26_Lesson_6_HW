package com.teachmeskills.lesson6.task1;

import com.teachmeskills.lesson6.task1.CreditCard;

public class Runner2 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(45720849, 100);
        CreditCard card2 = new CreditCard(64920874, 22);
        CreditCard card3 = new CreditCard(75835635, 34);

        card1.information(0);
        card2.information(0);
        card3.information(0);
    }
}
