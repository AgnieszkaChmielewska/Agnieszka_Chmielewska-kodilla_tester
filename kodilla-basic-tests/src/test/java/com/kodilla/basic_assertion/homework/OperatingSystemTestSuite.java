package com.kodilla.basic_assertion.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTestSuite {

    OperatingSystem operatingSystem = new OperatingSystem(2000,2);

    @Test
    public void shouldTurnOn(){
    operatingSystem.turnOn();
    }

    @Test
    public void shouldTurnOff(){
    operatingSystem.turnOff();
    }

    @Test
    public void shouldDisplayLicenseInfo(){
    operatingSystem.displayLicenseInfo();
    }

    @Test
    public void shouldReturnIssueYear(){
    int issueYear = operatingSystem.getIssueYear();
        Assertions.assertEquals(2000, issueYear);
    }

    @Test
    public void shouldReturnAmountOfUsers(){
    int amountOfUsers = operatingSystem.getAmountOfUsers();
        Assertions.assertEquals(2, amountOfUsers);
    }


}