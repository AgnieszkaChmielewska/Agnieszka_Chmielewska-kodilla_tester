package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<Integer> deadlinesDates = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getDeadlinesDates)
                .map(u -> u.getDayOfMonth())
                .collect(Collectors.toList());
        System.out.println(deadlinesDates);
    }
    public static LocalDate getDeadlinesDates(Task task) {
        return task.deadline;
    }
}
