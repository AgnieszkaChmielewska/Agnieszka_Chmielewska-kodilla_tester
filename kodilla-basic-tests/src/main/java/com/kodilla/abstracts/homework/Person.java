package com.kodilla.abstracts.homework;

public class Person {
    String name;
    int age;
    Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities (){
        System.out.println("Responsibilities: " + this.job.getResponsibilities());
    }
}
