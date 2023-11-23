package com.bank;

import java.math.BigDecimal;
import java.util.Random;

import com.bank.human.Human;
import com.bank.printer.Printer;

public class MainApplication {
    public static void main(String[] args) {
        Human human = new Human();
        Printer printer = new Printer();
        double price = new Random().nextDouble(20000);
        printer.printBalancesBeforePurchase(human);
        human.buyProduct(BigDecimal.valueOf(price));
        printer.printBalancesAfterPurchase(human);
    }
}
