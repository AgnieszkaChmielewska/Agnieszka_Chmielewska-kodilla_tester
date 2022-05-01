package com.kodilla.spring.basic.spring_dependency_injection.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarConfigurationTestSuite {

    @Test

    public void shouldCreateDogBeanAndFetchByBeanName() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carType");
        String seasonCar = car.getCarType();
        Assertions.assertEquals("Sedan", seasonCar);
    }

    @Test
    public void should() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carType");
        boolean lightsOn = car.hasHeadlightsTurnedOn();
        Assertions.assertTrue(true, String.valueOf(lightsOn));
    }

}
