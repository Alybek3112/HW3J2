package com.company;

public class LimitException extends Exception  {

    private double reamingAmount;

    public LimitException(double reamingAmount) {
        this.reamingAmount = reamingAmount;
    }

    public LimitException(String message, double reamingAmount){

    }

    public double getReamingAmount() {
        return reamingAmount;
    }
}
