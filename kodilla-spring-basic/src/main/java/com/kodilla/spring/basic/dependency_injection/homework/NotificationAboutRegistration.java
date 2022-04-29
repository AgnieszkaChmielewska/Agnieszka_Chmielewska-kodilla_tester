package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationAboutRegistration implements NotificationService {
    public void success(String address) {
        System.out.println("Package registered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package can not be registered to:" + address);
    }
}
