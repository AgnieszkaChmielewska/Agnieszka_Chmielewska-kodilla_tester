package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryOfSmallPackageService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering a small package in progress...");
        return true;
    }
}
