package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarConfiguration {

    @Bean
    public Car carType() {
        Car car;
        int month = LocalDateTime.now().getMonthValue();
        int dayOfMonth = LocalDateTime.now().getDayOfMonth();

        if ((month == 3 && dayOfMonth >= 20) || month == 4 || month == 5 || (month == 6 && dayOfMonth < 21)) {
            car = new Sedan();
            car.hasHeadlightsTurnedOn();
        } else if (month == 6 || month == 7 || month == 8 || (month == 9 && dayOfMonth < 22)) {
            car = new Cabrio();
            car.hasHeadlightsTurnedOn();
        } else if (month == 9 || month == 10 || month == 11 || (month == 12 && dayOfMonth < 21)) {
            car = new Sedan();
            car.hasHeadlightsTurnedOn();
        } else {
            car = new SUV();
            car.hasHeadlightsTurnedOn();
        }
        return car;
    }

}
