package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    private final CashMachine cashMachine = new CashMachine(100);

    @Test
    public void shouldHaveZeroLength() {
        int[] transitions = cashMachine.getTransitions();
        assertEquals(0, transitions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        cashMachine.addTransition(10);
        cashMachine.addTransition(-10);

        int[] transitions = cashMachine.getTransitions();
        assertEquals(2, transitions.length);
        assertEquals(10, transitions[0]);
        assertEquals(-10, transitions[1]);
    }

    @Test
    public void shouldNotAddTransitionToArrayWhenTransitionAmountZero() {
        cashMachine.addTransition(-1);
        cashMachine.addTransition(0);
        cashMachine.addTransition(1);

        int[] transitions = cashMachine.getTransitions();
        assertEquals(2, transitions.length);
        assertEquals(-1, transitions[0]);
        assertEquals(1, transitions[1]);
    }

    @Test
    public void shouldCountWithdrawWhenTransitionAmountNegative() {
        cashMachine.addTransition(10);
        cashMachine.addTransition(-110);

        int transitions = cashMachine.getSize();
        int withdrawNumbers = cashMachine.getWithdrawTransactionsQuantity();
        assertEquals(1, withdrawNumbers);
        assertEquals(2, transitions);
    }

    @Test
    public void shouldCountDepositWhenTransitionAmountPositive() {
        cashMachine.addTransition(10);
        cashMachine.addTransition(-10);

        int transitions = cashMachine.getSize();
        int withdrawNumbers = cashMachine.getWithdrawTransactionsQuantity();
        assertEquals(1, withdrawNumbers);
        assertEquals(2, transitions);
    }

    @Test
    public void shouldReducedBalanceWhenWithdraw() {
        cashMachine.addTransition(10);
        cashMachine.addTransition(-110);

        int balance = cashMachine.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void shouldIncreaseBalanceWhenWithdraw() {
        cashMachine.addTransition(1);
        cashMachine.addTransition(101);

        int balance = cashMachine.getBalance();
        assertEquals(202, balance);
    }

    @Test
    public void shouldNotReducedBalanceWhenWithdrawAmountSurpassBalance() {
        cashMachine.addTransition(-10);
        cashMachine.addTransition(-40);
        cashMachine.addTransition(-60);

        int[] transitions = cashMachine.getTransitions();
        int balance = cashMachine.getBalance();
        assertEquals(50, balance);
        assertEquals(2, transitions.length);
    }

}