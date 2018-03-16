import java.io.*;
import java.io.Serializable;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    private String fileName;

    public FileHandler() {


    }

    public void readFile(String fileName) {
        File file = new File(fileName);

    }

    public void writeTaskToFile(String fileName,Task task) {
        File file = new File(fileName);
        PrintWriter out;
        try {
            out = new PrintWriter(file);
            out.println(task.getTitle()+"/n"+ task.getDueDate()+"/n"+ task.getProject()+"/n"+ task.isDone()+"/n");
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }


    }
}
