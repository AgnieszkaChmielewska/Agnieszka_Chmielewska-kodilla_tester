package com.kodilla.inheritance.homework;

public class BusinessLicense extends OperatingSystem {
    public void exportDocument() {
        System.out.println("Exporting Document...");
    }

    public BusinessLicense() {
        super(2000, 10);
        System.out.println("Business License constructor");
    }

    @Override
    public void displayLicenseInfo() {
        System.out.println("This License is for 10 users");
    }
}
