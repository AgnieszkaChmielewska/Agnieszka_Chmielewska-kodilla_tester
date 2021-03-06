package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
@Scope("prototype")
public class Clock {
    LocalDateTime localDateTime;

    public int getLocalDateTime() {
        System.out.println(localDateTime.getHour());
        return localDateTime.getHour();
    }
}
