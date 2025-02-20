package com.kodilla.hibernate.tasklist;


import jakarta.persistence.*;

@Entity
@Table(name="TASKLISTS")
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "listname")
    private String listName;
    @Column(name = "description")
    private String description;

    public TaskList() {}

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public String getListName() {

        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
