package com.kodilla.hibernate.tasklist;


import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class TaskListRepoTestSuite {

    @Autowired
    private TaskListRepo taskListRepo;

    @Test
    void testFindByListName(){
        TaskList task1 = new TaskList("Ucz się", "Regularnie");

        taskListRepo.save(task1);

        List<TaskList> savedTask = taskListRepo.findByListName("Ucz się");

        assertEquals(1,savedTask.size());
        assertEquals("Ucz się",savedTask.get(0).getListName());

        taskListRepo.delete(savedTask.get(0));


    }
}
