package com.bank.payment;

import java.math.BigDecimal;

public class Cash extends Card {

    protected Cash(BigDecimal balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean pay(BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
    
}
