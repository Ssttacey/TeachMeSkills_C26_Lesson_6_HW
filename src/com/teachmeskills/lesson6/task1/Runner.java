package com.teachmeskills.lesson6.task1;

import com.teachmeskills.lesson6.task1.CreditCard;

public class Runner {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(45720849, 100);
        CreditCard card2 = new CreditCard(64920874, 22);
        CreditCard card3 = new CreditCard(75835635, 34);

        card1.moneyOperations(0);
        card2.moneyOperations(0);

        card3.withdrawMoney(0);

    }
}
