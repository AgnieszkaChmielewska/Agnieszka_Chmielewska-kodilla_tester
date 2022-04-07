package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("call Ann", LocalDate.of(2022, 01, 10), LocalDate.of(2022, 03, 30)));
        tasks.add(new Task("do exercise", LocalDate.of(2022, 10, 10), LocalDate.of(2022, 12, 07)));
        tasks.add(new Task("write a letter", LocalDate.of(2022, 11, 12), LocalDate.of(2022, 12, 12)));
        tasks.add(new Task("visit mum", LocalDate.of(2022, 06, 12), LocalDate.of(2022, 12, 21)));
        return tasks;
    }
}
