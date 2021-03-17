package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;

    }

    public double deposit(int sum) {
        return amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) ;
        throw new LimitException("У вас не хватает денег.\nCчитала с карты:"+amount,amount);
    }
}
