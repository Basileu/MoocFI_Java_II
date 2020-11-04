
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class TodoList {

    private final ArrayList<String> myTaskList = new ArrayList<>();

    public TodoList() {
    }

    //- add the task passed as a parameter to the todo list
    public void add(String task) {
        myTaskList.add(task);
    }

    public void print() {
        for (int i = 0; i < myTaskList.size(); i++) {
            System.out.println(i + 1 + ": " + myTaskList.get(i));
        }
    }
    public void remove(int number) {
        myTaskList.remove(number - 1);
    }
}
