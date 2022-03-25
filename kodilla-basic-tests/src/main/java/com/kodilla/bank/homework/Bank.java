package com.kodilla.bank.homework;

public class Bank {
    private final int regionId;
    private final CashMachine cashMachine1;
    private final CashMachine cashMachine2;
    private final CashMachine cashMachine3;


    public Bank(int regionId) {
        this.regionId = regionId;
        this.cashMachine1 = new CashMachine(20000);
        this.cashMachine2 = new CashMachine(20000);
        this.cashMachine3 = new CashMachine(20000);
    }

    public void addCashMachine1Transition(int transitionAmount) {
        this.cashMachine1.addTransition(transitionAmount);
    }

    public void addCashMachine2Transition(int transitionAmount) {
        this.cashMachine2.addTransition(transitionAmount);
    }

    public void addCashMachine3Transition(int transitionAmount) {
        this.cashMachine3.addTransition(transitionAmount);
    }

    public int getCashMachinesBalance() {
        return cashMachine1.getBalance() + cashMachine2.getBalance() + cashMachine3.getBalance();
    }

    public int getCashMachinesDepositTransitionsNumber() {
        return cashMachine1.getDepositTransactionsNumber() + cashMachine2.getDepositTransactionsNumber() + cashMachine3.getDepositTransactionsNumber();
    }

    public int getCashMachinesWithdrawTransitionsNumber() {
        return cashMachine1.getWithdrawTransactionsNumber() + cashMachine2.getWithdrawTransactionsNumber() + cashMachine3.getWithdrawTransactionsNumber();
    }

    public double getCashMachinesAverageDeposit() {
        if (cashMachine1.getAverageDeposit() + cashMachine2.getAverageDeposit() + cashMachine3.getAverageDeposit() < 0)
            return 0;
        else {
            double averageDeposit = cashMachine1.getAverageDeposit() + cashMachine2.getAverageDeposit() + cashMachine3.getAverageDeposit();
            return averageDeposit;
        }
    }

    public double getCashMachinesAverageWithdraw() {
        if (cashMachine1.getWithdrawTransactionsNumber() + cashMachine2.getWithdrawTransactionsNumber() + cashMachine3.getWithdrawTransactionsNumber() < 0)
            return 0;
        else {
            double averageWithdraw = cashMachine1.getAverageWithdraw() + cashMachine2.getAverageWithdraw() + cashMachine3.getAverageWithdraw();
            return averageWithdraw;
        }
    }


    public static void main(String[] args) {
//        CashMachine cashMachine = new CashMachine(0);
//        cashMachine.addTransition(210);
//        cashMachine.addTransition(50);
//        System.out.println("D: " + cashMachine.getDepositTransactionsNumber());
//        System.out.println("W: " + cashMachine.getWithdrawTransactionsNumber());
//        cashMachine.addTransition(-20);
//        System.out.println("D: " + cashMachine.getDepositTransactionsNumber());
//        System.out.println("W: " + cashMachine.getWithdrawTransactionsNumber());
//        cashMachine.addTransition(-180);
//        System.out.println("W: " + cashMachine.getWithdrawTransactionsNumber());
//        System.out.println("D: " + cashMachine.getDepositTransactionsNumber());
//        System.out.println(cashMachine.getSize());
//        System.out.println(cashMachine.getAverageWithdraw());

        Bank bank = new Bank(1);
        bank.addCashMachine1Transition(12);
        bank.addCashMachine2Transition(120);
        System.out.println("Total balance " + bank.getCashMachinesBalance());
        System.out.println("Total D: " + bank.getCashMachinesDepositTransitionsNumber());
        System.out.println("AD: " + bank.getCashMachinesWithdrawTransitionsNumber());
    }
}
