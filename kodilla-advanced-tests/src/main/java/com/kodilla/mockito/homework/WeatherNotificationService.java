package com.kodilla.mockito.homework;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<Subscriber, Set<Localization>> subscribers = new HashMap<>();

    public void addSubscriber(Subscriber subscriber, Localization localization) {
        Set<Localization> localizations = subscribers.getOrDefault(subscriber, new HashSet<>());
        localizations.add(localization);
        subscribers.put(subscriber, localizations);

    }

    public void sendServiceNotification(ServiceNotification serviceNotification) {
        for (Map.Entry<Subscriber, Set<Localization>> subscriber : this.subscribers.entrySet()) {
            subscriber.getKey().receiveNotification(serviceNotification);
        }
    }

    public void sendWeatherAlert(WeatherNotification weatherNotification, Localization localization) {
        for (Map.Entry<Subscriber, Set<Localization>> subscriber : this.subscribers.entrySet()) {
            if (subscriber.getValue().contains(localization)) {
                subscriber.getKey().receiveWeatherNotification(weatherNotification);
            }
        }
    }

    public void removeSubscription(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void removeSubscriptionForLocalization(Subscriber subscriber, Localization localization) {
        for (Map.Entry<Subscriber, Set<Localization>> subscriberSetEntry : this.subscribers.entrySet()) {
            if (subscriberSetEntry.getKey().equals(subscriber)) {
                if(subscriberSetEntry.getValue().contains(localization)){
                    subscriberSetEntry.getValue().remove(localization);
                };
            }
        }
    }

    public void removeLocalization(Localization localization){
        for (Map.Entry<Subscriber, Set<Localization>> subscriber : this.subscribers.entrySet()) {
            if (subscriber.getValue().contains(localization)) {
                subscriber.getValue().remove(localization);
            }
    }
}
}