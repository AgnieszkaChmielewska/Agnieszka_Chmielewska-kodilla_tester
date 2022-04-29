package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        SimpleApplication application = new SimpleApplication(new FacebookMessageService());  /*przy uruchamianiu za każdym razem tworzony jest nowy obiekt typu MassageService?*/
        application.processMessage("Test message", "receiver@mail.com");
    }
}
