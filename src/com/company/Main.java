package com.company;

import java.util.*;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        main.printWelcome();

        int res = main.parseChoice(main.readChoice());
        do {
            res = main.parseChoice(main.readChoice());

            //System.out.println(res);

        }
        while (res == 0);


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

    // Read input from user :
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

    // Parse input from user :
    public int parseChoice(int input) {
        int result;

        switch (input) {
            case 1: {
                result = 1;
                showSubmenu1();
                break;
            }
            case 2: {
                result = 2;
                showSubmenu2();
                break;
            }
            case 3: {
                result = 3;
                showSubmenu3();
                break;
            }
            case 4: {
                result = 4;
                showSubmenu4();
                break;
            }


            default: {
                result = 0;
                System.out.println("Enter a valid number from the list please !");

            }
        }

        return result;
    }

    public void showSubmenu1() {
        System.out.println(" \n " +
                ">> (1) Show Task List by date  \n " +
                ">> (2) Show Task List by project \n " +
                ">> \n " +
                ">>  Enter your choice : \n");
    }

    public void showSubmenu2() {
        System.out.println(" \n  >> (2) Add New Task \n ");
    }

    public void showSubmenu3() {
        System.out.println(" \n Edit Task :" +
                "(Update Task " +
                " Mark Task as Done" +
                " Remove Task) \n " +
                ">> \n " +
                ">>  Enter your choice : \n");

    }

    public void showSubmenu4() {
        System.out.println(">> \n " +
                ">> Good Bye .. Have A Nice Day " +
                " Saving . . . and Exit  \n " +
                ">> \n " );

    }

}
