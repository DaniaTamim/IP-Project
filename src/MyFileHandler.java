import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class MyFileHandler {
    private String fileName;

    public MyFileHandler() {


    }

    public void readFile(String fileName) {
        File file = new File(fileName);

    }

    public void writeTaskToFile(String fileName, Task task) {
        File file = new File(fileName);
        PrintWriter out;
        try {
            out = new PrintWriter(file);
            out.println(task.toString());
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

    public void saveFile() {

    }
}
