package com.kodilla.basic_assertion.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalLicenseTestSuite {
    PersonalLicense personalLicense = new PersonalLicense();

    @Test
    public void shouldOpenDocument(){
        personalLicense.openDocument();
    }

    @Test
    public void shouldDisplayLicenseInfo(){
        personalLicense.displayLicenseInfo();
    }

}