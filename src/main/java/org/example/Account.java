package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private String accountNumber;

    ArrayList<Deposit>deposit = new ArrayList<Deposit>();

    public void deposit(double amount, LocalDate depositDate){
        deposit.add(new Deposit(amount,depositDate));
    }

    public ArrayList<Deposit> getDeposit() {
        return deposit;
    }

    public double calculateBalance(){
        double balance = 0;
        for (Deposit deposit : deposit) {
            balance += deposit.getAmount();
        }

        return balance;
    }

    public int numberOfDeposits(){
        return deposit.size();
    }
}
