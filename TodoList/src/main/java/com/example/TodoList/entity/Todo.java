package com.example.TodoList.entity;

import jakarta.persistence.*;


@Entity //Indicates that the class is an entity and is mapped to a database table.
@Table(name = "todos") //Specifies the primary table for the annotated entity.
public class Todo {

    @Id //Specifies the primary key of an entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Provides for the specification of generation strategies for the values of primary keys.
    private long id;
    private String name;
    private String description;
    private boolean done;
    private int priority;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
