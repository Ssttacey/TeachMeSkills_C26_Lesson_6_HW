package com.teachmeskills.lesson6.task1;

import java.util.Scanner;

public class CreditCard {

    public int accountNumber;
    public double amountOnAccount;

    public CreditCard(int accountNumber, double amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public void moneyOperations(double creditCard) {
        System.out.println("Введите сумму для пополнения текущего счета");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextInt();
        if (sum > 0) {
            sum += amountOnAccount;
            System.out.println("Ваш текущий счет пополнен успешно. Сумма на счету " + accountNumber + " составляет " + sum);
        } else {
            System.out.println("Указано некорректное число");
        }
    }

    public void withdrawMoney(double creditCard) {
        System.out.println("Введите необходимую сумму для снятия");
        Scanner scanner = new Scanner(System.in);
        double sum2 = scanner.nextInt();
        if (sum2 < amountOnAccount) {
            sum2 = amountOnAccount - sum2;
            System.out.println("Операция выполнена успешно. Оставшая сумма на счету " + accountNumber + " составляет " + sum2);
        } else {
            System.out.println("Недостаточно средств");
        }
        scanner.close();
    }


    public void information (double creditCard) {
        System.out.println( " Вот информация о доступных Вам денежных счетах " + accountNumber + " " + amountOnAccount);
    }
}