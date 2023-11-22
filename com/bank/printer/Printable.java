package com.bank.printer;

import com.bank.human.Human;

public interface Printable {
    void printBalances(Human human, String message);

    void drawLine(char fillCharacter, int times, boolean tablulation);
}
