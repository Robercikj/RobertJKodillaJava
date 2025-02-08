package com.kodilla.kodilla.spring.web.hibernate.tasklist;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SpringBootApplication
@Repository
public interface TaskListRepo extends JpaRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);

}
