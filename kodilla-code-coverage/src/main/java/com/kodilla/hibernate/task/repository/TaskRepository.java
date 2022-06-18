package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);

}
