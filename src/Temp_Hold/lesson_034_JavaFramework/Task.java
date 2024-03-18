package Temp_Hold.lesson_034_JavaFramework;

import java.util.Objects;

public class Task {

    private static int counter = 0;

    private static final int ID_BASE = 8456;

    private final int id;

    private final String title;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Task.counter = counter;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "ID ["+id+"] , title "+title+".";
    }
}
