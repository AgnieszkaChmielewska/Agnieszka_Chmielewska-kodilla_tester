package com.kodilla.bank.homework;

import static java.lang.Math.abs;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int balance;
    private int withdrawTransactionsQuantity;
    private int depositTransactionsQuantity;
    private int depositSum;
    private int withDrawSum;

    public CashMachine(int balance) {
        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;

    }

    public void addTransition(int transitionAmount) {
        if (transitionAmount == 0){
        System.out.println("Transition 0 is not allowed.");
            return;
        } else if (transitionAmount < 0) {
            if (this.balance >= abs(transitionAmount)) {
                   this.size++;
                    int[] newTab = new int[this.size];
                    System.arraycopy(transactions, 0, newTab, 0, transactions.length);
                    newTab[this.size - 1] = transitionAmount;
                    this.transactions = newTab;
                    balance = this.balance + transitionAmount;
                    withdrawTransactionsQuantity++;
                    System.out.println("ATM balance reduced by: " + transitionAmount + ". Current balance: " + balance);
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
            depositTransactionsQuantity++;
            System.out.println("ATM balance increased by: " + transitionAmount + ". Current balance: " + balance);
        }
    }

    public int[] getTransitions() {
        return transactions;
    }

    public int getSize() {
        return size;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getWithdrawTransactionsQuantity() {
        return withdrawTransactionsQuantity;
    }

    public int getDepositTransactionsQuantity() {
        return depositTransactionsQuantity;
    }

    public int getWithdrawSum() {
        if (this.withdrawTransactionsQuantity == 0) {
            return 0;
        }
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] < 0) {
                withDrawSum += transactions[i];
            }
        return withDrawSum;
    }

    public int getDepositSum() {
        if (this.depositTransactionsQuantity == 0) {
            return 0;
        }
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                depositSum += transactions[i];
            }
        }
        return depositSum;
    }

}
