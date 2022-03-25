package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Bank bank = new Bank(1);
        assertEquals(0, bank.getCashMachinesAverageDeposit());
        assertEquals(0, bank.getCashMachinesAverageWithdraw());
    }

    @Test
    public void shouldCalculateCorrectBalance() {
        Bank bank = new Bank(1);
        bank.addCashMachine1Transition(10000);
        bank.addCashMachine2Transition(5000);
        bank.addCashMachine3Transition(5000);

        int balance = bank.getCashMachinesBalance();
        assertEquals(80000, balance);
    }

    @Test
    public void shouldCalculateDepositTransitionsNumber() {
        Bank bank = new Bank(1);
        bank.addCashMachine1Transition(10000);
        bank.addCashMachine1Transition(-10000);

        bank.addCashMachine3Transition(5000);
        bank.addCashMachine3Transition(-5000);
        bank.addCashMachine3Transition(-5000);


        int depositTransitionsNumber = bank.getCashMachinesDepositTransitionsNumber();
        int balance = bank.getCashMachinesBalance();
        assertEquals(3, depositTransitionsNumber);
        assertEquals(45000, balance);
    }

    @Test
    public void shouldCalculateWithdrawTransitionsNumber() {
        Bank bank = new Bank(1);
        bank.addCashMachine1Transition(10000);
        bank.addCashMachine1Transition(-70001);

        bank.addCashMachine2Transition(5000);
        bank.addCashMachine2Transition(5000);

        bank.addCashMachine3Transition(5000);
        bank.addCashMachine3Transition(-5000);
        bank.addCashMachine3Transition(-5000);


        int withdrawTransitionsNumber = bank.getCashMachinesWithdrawTransitionsNumber();
        int balance = bank.getCashMachinesBalance();
        assertEquals(2, withdrawTransitionsNumber);
        assertEquals(75000, balance);
    }

    @Test
    public void shouldCountAverageWithdrawOnlyForNegativeAmounts() {
        Bank bank = new Bank(1);
        bank.addCashMachine1Transition(10000);
        bank.addCashMachine1Transition(-10000);

        bank.addCashMachine2Transition(-20000);

        bank.addCashMachine3Transition(5000);
        bank.addCashMachine3Transition(-5000);
        bank.addCashMachine3Transition(-5000);

        double averageWithdraw = bank.getCashMachinesAverageWithdraw();
        assertEquals(-35000, averageWithdraw,0.0001);
    }

    @Test
    public void shouldCountAverageDepositOnlyForPositiveAmounts() {
        Bank bank = new Bank(1);
        bank.addCashMachine1Transition(10000);
        bank.addCashMachine1Transition(-10000);

        bank.addCashMachine2Transition(5000);

        bank.addCashMachine3Transition(5000);
        bank.addCashMachine3Transition(-5000);
        bank.addCashMachine3Transition(-5000);

        double averageDeposit = bank.getCashMachinesAverageDeposit();
        assertEquals(-35000, averageDeposit,0.0001);
    }
}
