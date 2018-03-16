
import java.util.*;


/**
 * This class model a task with a task title, due date, status and project
 */
public class Task {
    private String title;
    private Date dueDate;
    private boolean done;
    private String project;

public Task(String title,Date dueDate,String project){
    this.setTitle(title);
    this.setDueDate(dueDate);
    this.done=false;
    this.setProject(project);
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(){
        this.done=true;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


    public void printTask(){
    System.out.println("This is printing task");
    System.out.println("-----------------------------");
    System.out.println("The title is :"+ this.getTitle());
    System.out.println("The due date is :"+ this.getDueDate());
    System.out.println("The project is :"+ this.getProject());
    System.out.println("-----------------------------");

    }



}
