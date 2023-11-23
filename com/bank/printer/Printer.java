package com.bank.printer;

import com.bank.human.Human;

public class Printer implements Printable {

    @Override
    public void printBalancesBeforePurchase(Human human) {
        drawLine('#', 100, false);
        printBalances(human, "Балансы до покупки");
    }

    @Override
    public void printBalancesAfterPurchase(Human human) {
        printBalances(human, "Балансы после покупки");
        drawLine('#', 100, false);
    }

    @Override
    public void printBalances(Human human, String message) {
        drawLine('-', 50, true);
        System.out.println("\t\t" + message + "\n");
        System.out.println("баланс кредитки: " + human.getCreditCardBalance());
        System.out.println("баланс лимита по кредитке: " + human.getCreditCardLimit());
        System.out.println("баланс банковской карты: " + human.getBankCardBalance());
        System.out.println("баланс лимита по банковской карте: " + human.getBankCardLimit());
        System.out.println("Наличные: " + human.getCashBalance());
        drawLine('-', 50, true);
    }

    @Override
    public void drawLine(char fillCharacter, int times, boolean tablulation) {
        if (tablulation) {
            System.out.print("\n\t\t");
        }
        for (int i = 0; i < times; i++) {
            System.out.print(fillCharacter);
        }
        System.out.println("\n");
    }

}
