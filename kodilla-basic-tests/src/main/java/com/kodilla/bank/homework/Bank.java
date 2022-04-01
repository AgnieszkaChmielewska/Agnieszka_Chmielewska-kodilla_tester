package com.kodilla.bank.homework;

public class Bank {
    private final int regionId;
    private CashMachine[] cashMachines;
    private int size;
    private int allBalances;
    private int allWithdrawals;
    private int allDeposits;


    public Bank(int regionId, CashMachine... cas) {
        this.regionId = regionId;
//        this.cashMachines = new CashMachine[0];
        this.cashMachines = cas;
//        cashMachines[0] = new CashMachine(10);
//        cashMachines[1] = new CashMachine(10);
//        cashMachines[2] = new CashMachine(10);
        this.size = this.cashMachines.length;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getSizes() {
        return size;
    }

    public int getAllBalances() {
        if (cashMachines.length == 0) {
            return 0;
        }
        for (int i = 0; i < cashMachines.length; i++) {
            allBalances = allBalances + cashMachines[i].getBalance();
        }
        return allBalances;
    }

    /*liczbę transakcji związaną z wpłatą pieniędzy,*/
    public int getAllWithdrawals() {
        for (CashMachine cashMachine : cashMachines) {
//        for (int i = 0; i < cashMachines.length; i++) {
            allWithdrawals += cashMachine.getWithdrawTransactionsQuantity();
        }
        return allWithdrawals;
    }

    /*liczbę transakcji związanych z wypłatą*/
    public int getAllDeposits() {
        for (CashMachine cashMachine : cashMachines) {
//        for (int i = 0; i < cashMachines.length; i++) {
            allDeposits = allDeposits + cashMachine.getDepositTransactionsQuantity();
        }
        return allDeposits;
    }

    public double getAverageDeposit() {
        double depositSum;
        if (getAllDeposits() == 0) {
            return 0;
        } else {
            depositSum = 0;
            for (CashMachine cashMachine : cashMachines) {
//            for (int i = 0; cashMachines.length > i; i++) {
//                depositSum += cashMachines[i].getDepositSum();
                depositSum += cashMachine.getDepositSum();
            }
        }
        return depositSum / allDeposits;
    }

    public double getAverageWithdraw() {
        double withdrawSum;
        if (getAllWithdrawals() == 0) {
            return 0;
        } else {
            withdrawSum = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                withdrawSum += cashMachines[i].getWithdrawSum();
            }
        }
        return withdrawSum / allWithdrawals;
    }
}


