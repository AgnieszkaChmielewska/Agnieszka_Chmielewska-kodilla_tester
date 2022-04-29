package com.kodilla.basic_assertion.homework;

public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999, 1);
        operatingSystem.turnOn();
        System.out.println("Allowed number od users: " + operatingSystem.getAmountOfUsers()+", Issue Year: "+ operatingSystem.getIssueYear());

        PersonalLicense personalLicense = new PersonalLicense();
        personalLicense.openDocument();
        personalLicense.displayLicenseInfo();

        BusinessLicense businessLicense = new BusinessLicense();
        System.out.println("Number of users: " + businessLicense.getAmountOfUsers());
        businessLicense.displayLicenseInfo();
        businessLicense.exportDocument();
        businessLicense.turnOff();
    }

}
