package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class WeatherNotificationServiceTest {

    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
    ServiceNotification serviceNotification = Mockito.mock(ServiceNotification.class);
    Subscriber subscriber = Mockito.mock((Subscriber.class));
    Localization localization = Mockito.mock(Localization.class);
    Localization localization1 = Mockito.mock(Localization.class);

    @Test
    void ifSubscriberShouldReceiveServiceNotification() {
        weatherNotificationService.addSubscriber(subscriber,localization);
        weatherNotificationService.sendServiceNotification(serviceNotification);
        Mockito.verify(subscriber,Mockito.times(1)).receiveNotification(serviceNotification);
    }

    @Test
    void ifNotSubscriberShouldNotReceiveServiceNotification() {
        weatherNotificationService.sendServiceNotification(serviceNotification);
        Mockito.verify(subscriber,Mockito.never()).receiveNotification(serviceNotification);
    }

    @Test
    void ifNotSubscriberShouldNotReceiveWeatherNotification() {
        weatherNotificationService.sendWeatherAlert(weatherNotification, localization);
        Mockito.verify(subscriber,Mockito.never()).receiveWeatherNotification(weatherNotification);
    }

    @Test
    void ifSubscriberShouldReceiveWeatherNotificationForAddedLocalisation() {
        weatherNotificationService.addSubscriber(subscriber,localization);
        weatherNotificationService.sendWeatherAlert(weatherNotification, localization);
        Mockito.verify(subscriber,Mockito.times(1)).receiveWeatherNotification(weatherNotification);
    }

    @Test
    void ifSubscriberShouldNotReceiveWeatherNotificationForNotAddedLocalisation() {
        weatherNotificationService.addSubscriber(subscriber,localization);
        weatherNotificationService.sendWeatherAlert(weatherNotification, localization1);
        Mockito.verify(subscriber,Mockito.never()).receiveWeatherNotification(weatherNotification);
    }

    @Test
    void ifSubscriptionRemovedShouldNotReceiveAnyNotification() {
        weatherNotificationService.addSubscriber(subscriber,localization);
        weatherNotificationService.removeSubscription(subscriber);
        weatherNotificationService.sendWeatherAlert(weatherNotification, localization1);
        weatherNotificationService.sendServiceNotification(serviceNotification);
        Mockito.verify(subscriber,Mockito.never()).receiveWeatherNotification(weatherNotification);
        Mockito.verify(subscriber,Mockito.never()).receiveNotification(serviceNotification);
    }

    @Test
    void ifSubscriberShouldNotReceiveWeatherNotificationForRemovedLocalization() {
        weatherNotificationService.addSubscriber(subscriber,localization);
        weatherNotificationService.removeSubscriptionForLocalization(subscriber,localization);
        weatherNotificationService.sendWeatherAlert(weatherNotification, localization);
        Mockito.verify(subscriber,Mockito.never()).receiveWeatherNotification(weatherNotification);
    }
    @Test
    void ifLSubscriberShouldNotReceiveWeatherNotificationForRemovedLocalization() {
        weatherNotificationService.addSubscriber(subscriber,localization);
        weatherNotificationService.removeLocalization(localization);
        weatherNotificationService.sendWeatherAlert(weatherNotification, localization);
        Mockito.verify(subscriber,Mockito.never()).receiveWeatherNotification(weatherNotification);
    }
}