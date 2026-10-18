package org.example;

import java.time.LocalDate;

public class Loan extends Account {
    private double initialAmount;

    public Loan(double initialAmount, LocalDate initialDate) {
        this.initialAmount = initialAmount;

    }

    @Override
    public void deposit(double amount, LocalDate date) {
        super.deposit(amount, date);
    }
}
