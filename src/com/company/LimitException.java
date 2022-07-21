package com.company;

public class LimitException extends Exception{

    private double remainingAmount;

    public LimitException(String message) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}