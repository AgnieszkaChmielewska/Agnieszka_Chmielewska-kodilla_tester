package com.kodilla.basic_assertion.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLicenseTestSuite {
    BusinessLicense businessLicense = new BusinessLicense();

    @Test
    public void shouldExportDocument(){
        businessLicense.exportDocument();
    }

    @Test
    public void shouldDisplayLicenseInfo(){
        businessLicense.displayLicenseInfo();
    }

}