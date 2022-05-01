package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework"); // [1]
    ShippingCenter bean = context.getBean (ShippingCenter.class);

    @Test
    public void shouldSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 30);
        Assertions.assertEquals("Package delivered to: Warsaw", message);
    }

    @Test
    public void shouldNotSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 30.01);
        Assertions.assertEquals("Package not delivered to: Warsaw", message);
    }

    @Test
    public void shouldReturnMessage() {
        String message = bean.sendPackage("Warsaw", 5.2);
        Assertions.assertNotNull(message);
    }

}
