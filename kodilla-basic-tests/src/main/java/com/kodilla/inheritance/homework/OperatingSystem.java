package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int issueYear;
    private int amountOfUsers;

    public OperatingSystem(int issueYear, int amountOfUsers) {
        this.issueYear = issueYear;
        this.amountOfUsers = amountOfUsers;
        System.out.println("Operating system constructor");

    }


    public void turnOn() {
        System.out.println("System is on");
    }

    public void turnOff() {
        System.out.println("System is off");
    }

    public int getIssueYear() {
        return issueYear;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public void displayLicenseInfo(){
        System.out.println("This License is for 1 user, Issue Year: "+this.issueYear);
    }
}
