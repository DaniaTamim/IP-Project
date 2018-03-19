import java.util.*;
import java.util.ArrayList;

/**
 * This Class is to make tasks
 */
public class ToDoList {

    private String name;
    private ArrayList<Task> tasks;

    public ToDoList(String name) {
        this.setName(name);
        tasks = new ArrayList<Task>();
    }

    public ToDoList(String name, ArrayList<Task> tasks) {
        this.setName(name);
        this.setTasks(tasks);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    // to read all the arraylist
    public void readArrayList() {

    }

    // Print arraylist
    public void printArrayList(ArrayList<Task> tasks) {
        for (Task t : tasks) {
            t.toString();

        }
    }

    // Get list of all the tasks
    public void showTaskList() {
        printArrayList(tasks);

        for (Task task : tasks) {
            task.toString();

        }

    }

    public ArrayList searchTaskList_byProject(String project, ArrayList<Task> tasks) {

        ArrayList<Task> filteredByProjectTasks = new ArrayList<Task>();

        for (Task task : tasks) {
            if (task.getProject().equals("project")) {
                filteredByProjectTasks.add(task);
            }

        }
        return filteredByProjectTasks;
    }


    public ArrayList searchTaskList_byDueDate(Date dueDate, ArrayList<Task> tasks) {

        ArrayList<Task> filteredByDueDateTasks = new ArrayList<Task>();

        for (Task task : tasks) {
            if (task.getDueDate()== dueDate) {
                filteredByDueDateTasks.add(task);
            }

        }
        return filteredByDueDateTasks;
    }
    public void addNewTask(Task task) {
        tasks.add(task);

    }


    public void editTask(Task task) {


    }

    public void setTaskDone(Task task) {


    }


    public void removeTask(Task task) {
        tasks.remove(task);


    }

    public void saveTask(Task task) {


    }


}