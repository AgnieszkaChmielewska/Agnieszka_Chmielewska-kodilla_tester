package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private final Bank bank = new Bank(1);
    private final CashMachine cashMachineOne = new CashMachine(5000);
    private final CashMachine cashMachineTwo = new CashMachine(5000);
    private final CashMachine cashMachineThree = new CashMachine(5000);


    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        assertEquals(0, bank.getAverageDeposit());
        assertEquals(0, bank.getAverageWithdraw());
    }

    @Test
    public void shouldReturnMachinesEqualsZeroIsArrayIsEmpty() {
        assertEquals(0, bank.getSizes());
        assertEquals(0, bank.getAllBalances());
    }

    @Test
    public void shouldAddCashMachine() {
        bank.addCashMachine(cashMachineOne);

        assertEquals(1, bank.getSizes());
    }

    @Test
    public void shouldCalculateCorrectAllBalances() {

        bank.addCashMachine(cashMachineOne);
        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);

        cashMachineOne.addTransition(0);
        cashMachineOne.addTransition(100);
        cashMachineTwo.addTransition(1000);
        cashMachineThree.addTransition(-(cashMachineThree.getBalance() + 1));

        int balance = bank.getAllBalances();
        assertEquals(16100, balance);
    }

    @Test
    public void shouldCountDepositTransitionsQuantity() {

        bank.addCashMachine(cashMachineOne);
        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);

        cashMachineOne.addTransition(-1000);
        cashMachineOne.addTransition(1000);
        cashMachineOne.addTransition(0);
        cashMachineTwo.addTransition(1000);
        cashMachineTwo.addTransition(-2);
        cashMachineThree.addTransition(-(cashMachineThree.getBalance() + 1));


        int allDeposits = bank.getAllDeposits();
        int balance = bank.getAllBalances();
        assertEquals(2, allDeposits);
        assertEquals(15998, balance);
    }

    @Test
    public void shouldReturnZeroWhenZeroDepositTransitionsQuantity() {

        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);

        cashMachineThree.addTransition(-(cashMachineThree.getBalance() + 1));

        int allDeposits = bank.getAllDeposits();
        assertEquals(0, allDeposits);
    }

    @Test
    public void shouldCalculateWithdrawTransitionsQuantity() {

        bank.addCashMachine(cashMachineOne);
        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);

//        cashMachineTwo.addTransition(1000);
//        cashMachineTwo.addTransition(-5999);

        cashMachineThree.addTransition(-5000);
        cashMachineThree.addTransition(-5000);

        cashMachineOne.addTransition(0);
        cashMachineOne.addTransition(-5000);
        cashMachineOne.addTransition(-5000);

        int withdrawTransitionsQuantity = bank.getAllWithdrawals();
        assertEquals(2, withdrawTransitionsQuantity);
    }

    @Test
    public void shouldCalculateAverageWithdrawOnlyForNegativeAmounts() {

        bank.addCashMachine(cashMachineOne);
        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);

        cashMachineTwo.addTransition(1000);
        cashMachineTwo.addTransition(-6001);

        cashMachineThree.addTransition(5000);

        cashMachineOne.addTransition(5000);
        cashMachineOne.addTransition(-5000);
        cashMachineOne.addTransition(-5000);

        double averageWithdraw = bank.getAverageWithdraw();
        assertEquals(-5000, averageWithdraw, 0.1);
    }

    @Test
    public void shouldCountAverageDepositOnlyForPositiveAmounts() {

        bank.addCashMachine(cashMachineOne);
        bank.addCashMachine(cashMachineTwo);
        bank.addCashMachine(cashMachineThree);

        cashMachineTwo.addTransition(1000);
        cashMachineTwo.addTransition(0);
        cashMachineThree.addTransition(5000);

        double averageDeposit = bank.getAverageDeposit();
        assertEquals(3000,averageDeposit,0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroWhenArrayIsEmpty() {
        double averageWithdraw = bank.getAverageWithdraw();
        double averageDeposit = bank.getAverageDeposit();
        assertEquals(0, averageWithdraw);
        assertEquals(0, averageDeposit);
    }

}
