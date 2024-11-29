package edu.dp.sau.danmishchenko.lab4.model;

import java.util.List;
import java.util.Objects;

public abstract class Entity<T> {
    private Human head;
    private String name;
    private List<T> listOfContent;

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getListOfContent() {
        return listOfContent;
    }

    public void setListOfContent(List<T> listOfContent) {
        this.listOfContent = listOfContent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, name, listOfContent);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Entity<?> other = (Entity<?>) obj;
        if (head == null) {
            if (other.head != null) {
                return false;
            }
        } else if (!head.equals(other.head)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (listOfContent == null) {
            return other.listOfContent == null;
        } else return listOfContent.equals(other.listOfContent);
    }
}