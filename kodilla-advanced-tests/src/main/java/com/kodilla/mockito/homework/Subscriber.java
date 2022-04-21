package com.kodilla.mockito.homework;

import com.kodilla.mockito.Notification;
public interface Subscriber {

    void receiveNotification (Notification notification);
    void receiveWeatherNotification (WeatherNotification weatherNotification);
}
