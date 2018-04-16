package com.sweeneyb.listBackend.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ListItem {

    private boolean isDone = false;
    @Id
    private LocalDateTime id = LocalDateTime.now();
    private String task = "";

    private String owner = "";

    public ListItem() {}

    public ListItem(String task) {
        this.task = task;

    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public LocalDateTime getId() {
        return id;
    }

    public void setId(LocalDateTime id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}


