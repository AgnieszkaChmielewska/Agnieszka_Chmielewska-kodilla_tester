package com.kodilla.bank.homework;

import static java.lang.Math.abs;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int balance;
    private int withdrawTransactionsNumber;
    private int depositTransactionsNumber;


    public CashMachine(int balance) {
        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;
    }

    public void addTransition(int transitionAmount) {
        if (transitionAmount == 0) {
            return;
        } else if (transitionAmount < 0) {
            if (this.balance >= abs(transitionAmount)) {
                this.size++;
                int[] newTab = new int[this.size];
                System.arraycopy(transactions, 0, newTab, 0, transactions.length);
                newTab[this.size - 1] = transitionAmount;
                this.transactions = newTab;
                balance = this.balance + transitionAmount;
                withdrawTransactionsNumber++;
                System.out.println("ATM balance reduced by: " + transitionAmount+ ". Current balance: " + balance);
             } else {
                System.out.println("Not enough money");
                return;
            }
        } else {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = transitionAmount;
            this.transactions = newTab;
            balance = this.balance + transitionAmount;
            depositTransactionsNumber++;
            System.out.println("ATM balance increased by: " + transitionAmount + ". Current balance: " + balance);
        }
    }

    public int[] getTransitions(){
        return transactions;
    }

    public int getSize() {
        return size;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getWithdrawTransactionsNumber() {
        return this.withdrawTransactionsNumber;
    }

    public int getDepositTransactionsNumber() {
        return this.depositTransactionsNumber;
    }

    public double getAverageDeposit() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double depositSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                depositSum += transactions[i];
            }
        }
        return depositSum / this.getDepositTransactionsNumber();
    }

    public double getAverageWithdraw() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double withdrawSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            System.out.println("Transition Amount: " + this.transactions[i]);
            if (transactions[i] < 0) {
                withdrawSum += transactions[i];
            }
        }
        return withdrawSum / this.getWithdrawTransactionsNumber();
    }
}
