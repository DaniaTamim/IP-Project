

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.lang.String;



public class Main {
    private ToDoList myToDoList= new ToDoList("Dania");

    public static void main(String[] args) throws ParseException {
        // write your code here
        Main main = new Main();
         //ToDoList myToDoList= new ToDoList("Dania");

        main.printWelcome();

        int res = main.parseChoice(main.readChoice());
        do {
            res = main.parseChoice(main.readChoice());

            //System.out.println(res);

        }
        while (res != 4);


    }


    public void printWelcome() {
        System.out.println(">> Welcome to ToDoly \n " +
                ">> You have X tasks todo and Y tasks are done! \n " +
                ">> Pick an option: \n " +
                ">> (1) Show Task List (by date or project) \n " +
                ">> (2) Add New Task \n " +
                ">> (3) Edit Task (update, mark as done, remove) \n " +
                ">> (4) Save and Quit  \n " +
                ">> \n " +
                ">>  Enter your choice : \n");


    }

    // Read Choise num from user :
    public int readChoice() {

        int userInput = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return userInput;
    }


    // Read text from user :
    public String readText() {

        String userInput = "";
        try {
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return userInput;
    }

    // Parse input from user :
    public int parseChoice(int input) throws ParseException {
        int result;

        switch (input) {
            case 1: {
                result = 1;
                showShowTaskmenu();
                break;
            }
            case 2: {
                result = 2;
                showAddmenu();
                break;
            }
            case 3: {
                result = 3;
                showUpdatemenu();
                break;
            }
            case 4: {
                result = 4;
                showSaveExitmenu();
                break;
            }



            default: {
                result = 0;
                System.out.println("Enter a valid number from the list please !");

            }
        }

        return result;
    }




    public void showShowTaskmenu() {
        System.out.println(" \n " +
                ">> (1) Show Task List by date  \n " +
                ">> (2) Show Task List by project \n " +
                ">> \n " +
                ">>  Enter your choice : \n");
        int choice= readChoice();
        if(choice == 1){
           // searchTaskList_byDueDate

        }
        else if (choice==2){
            //searchTaskList_byProject
        }
    }

    public void showAddmenu() throws ParseException {

        System.out.println(" \n  >> (2) Add New Task \n ");
        System.out.println("Enter Title :\n ");
        String title= readText();

        System.out.println("Enter Project :\n ");
        String project= readText();

        System.out.println("Enter Due Date :\n ");

        Date dueDate = stringToDate(readText());


        Task newtask= new Task(title,dueDate,project);
        myToDoList.addNewTask(newtask);
        System.out.println("Task Added \n ");




    }


    public Date stringToDate(String dateString) throws ParseException {
        //String string = "January 2, 2010";
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse(dateString);


        return date;

    }

    public void showUpdatemenu() {
        System.out.println(" \n Edit Task :" +
                "(Update Task " +
                " Mark Task as Done" +
                " Remove Task) \n " +
                ">> \n " +
                ">>  Enter your choice : \n");

    }

    public void showSaveExitmenu()  {
        //MyFileHandler myfileHandler=new MyFileHandler();
        System.out.println(">> \n " +
                ">> Good Bye .. Have A Nice Day " +
                " Saving . . . and Exit  \n " +
                ">> \n " );

        // myfileHandler.saveFile();
        // exit program

    }

}