package com.kodilla.inheritance.homework;

public class PersonalLicense extends OperatingSystem{
    public void openDocument(){
        System.out.println("Opening document...");
    }

    public PersonalLicense(){
        super(2022, 2);
        System.out.println("Personal License constructor");
    };

    @Override
    public void displayLicenseInfo() {
        System.out.println("This License is for 2 users, Issue Year: " + this.getIssueYear());
    }

}
