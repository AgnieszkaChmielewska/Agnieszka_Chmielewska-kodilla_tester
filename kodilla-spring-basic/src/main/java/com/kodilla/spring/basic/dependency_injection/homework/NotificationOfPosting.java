package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationOfPosting implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address);

    }

    @Override
    public void fail(String address) {
        System.out.println("Package can not be send to:" + address);
    }
}
