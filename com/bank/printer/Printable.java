package com.bank.printer;

import com.bank.human.Human;

public interface Printable {

    void printBalancesBeforePurchase(Human human);

    void printBalancesAfterPurchase(Human human);

    void printBalances(Human human, String message);

    void drawLine(char fillCharacter, int times, boolean tablulation);
}
