package org.example;

import java.time.LocalDate;

public class Deposit
{
    private double amount;
    private LocalDate depositDate;

    public Deposit(double amount, LocalDate depositDate)
    {
        this.amount = amount;

        if(amount < 0) {
            System.out.println("Withdrawed");
        }
    }

    public double getAmount()
    {
        return amount;
    }

    public LocalDate getDepositDate()
    {
        return depositDate;
    }
}
