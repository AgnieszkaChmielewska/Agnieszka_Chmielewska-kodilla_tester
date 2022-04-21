package com.kodilla.mockito.homework;


import com.kodilla.mockito.Notification;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<Subscriber,Set<Localization>> subscribers = new HashMap<>();

    public void addSubscriber(Subscriber subscriber, Localization localization) {
    }

    public void sendNotification (Notification notification) {
        for (Map.Entry<Subscriber,Set<Localization>> subscriber : this.subscribers.entrySet()) {
            subscriber.getKey().receiveNotification(notification);
        }
    }

    public void sendWeatherAlert (WeatherNotification weatherNotification, Localization localization) {
        for (Map.Entry<Subscriber,Set<Localization>> subscriber : this.subscribers.entrySet()) {
            if (subscriber.getValue().contains(localization)){
                    subscriber.getKey().receiveWeatherNotification(weatherNotification);
        }
    }
}}