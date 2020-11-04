
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class UserInterface {
    private TodoList myTodoList;
    private Scanner myScanner;

    public UserInterface(TodoList myTodoList, Scanner myScanner) {
        this.myTodoList = myTodoList;
        this.myScanner = myScanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = myScanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String task = myScanner.nextLine();
                
                myTodoList.add(task);
            } else if (command.equals("list")) {
                myTodoList.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removedIndex = Integer.valueOf(myScanner.nextLine());
                myTodoList.remove(removedIndex);
            }
        }
    }
    
}
