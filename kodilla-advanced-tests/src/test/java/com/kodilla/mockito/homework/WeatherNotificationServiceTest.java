package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherNotificationServiceTest {

    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
//    Notification notification = Mockito.


    @Test
    void addSubscriber() {
    }

    @Test
    void sendNotification() {
    }

    @Test
    void sendWeatherAlert() {
    }
}