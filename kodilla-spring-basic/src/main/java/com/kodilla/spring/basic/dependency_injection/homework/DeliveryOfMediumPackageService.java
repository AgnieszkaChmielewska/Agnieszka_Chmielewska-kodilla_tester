package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryOfMediumPackageService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 20) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering a medium package in progress...");
        return true;
    }
}
