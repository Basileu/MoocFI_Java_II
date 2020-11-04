
import java.util.ArrayDeque;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Pipe<T> {
    private T element;
    Queue<T> myQueue = new ArrayDeque<>();

    public Pipe() {
    }
    
    public void putIntoPipe(T value) {
        myQueue.offer(value);
    }
    
    public T takeFromPipe() {
        return (myQueue.poll());
    }
    public boolean isInPipe() {
        return !(myQueue.isEmpty());
    }
}
