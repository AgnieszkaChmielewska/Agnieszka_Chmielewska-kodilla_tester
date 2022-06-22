package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    String LISTNAME = "Test: Learn Hibernate";
    String DESCRIPTION = "One";

    @Test
    void testTaskListRepositoryFindByDuration() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(listName);
        String foundListName = readTasksList.get(0).getListName();
        String description = taskList.getDescription();

        //Then
        Assertions.assertEquals("Test: Learn Hibernate", foundListName);
        Assertions.assertEquals(1, readTasksList.size());
        Assertions.assertEquals(description, DESCRIPTION);

        //CleanUp
        taskListRepository.deleteAll();
   }
}