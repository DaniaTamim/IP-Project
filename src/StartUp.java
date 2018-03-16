import java.util.Scanner;

public class StartUp {


public static void main(String args){

    ToDoList mylist= new ToDoList("Dania");

}


public void printWelcome(){

    System.out.println(">> Welcome to ToDoly " +
                       ">> You have X tasks todo and Y tasks are done! " +
                        ">> Pick an option: " +
                        ">> (1) Show Task List (by date or project) " +
                        ">> (2) Add New Task " +
                        ">> (3) Edit Task (update, mark as done, remove) " +
                        ">> (4) Save and Quit " +
                        ">>)");

}
}
