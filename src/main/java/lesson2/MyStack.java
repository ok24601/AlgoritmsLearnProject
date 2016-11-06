package lesson2;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyStack {

    private long data[];
    private int top;
    private int capacity;

    public MyStack() {
        capacity = 10;
        data = new long[capacity];
        top = -1;
    }

    public MyStack(long arr[]) {
        capacity = arr.length * 5;
        data = new long[capacity];
        top = -1;
    }

    public void push(long elem) {
        if (top == data.length - 1)
            throw new RuntimeException("Stack is full");
        data[++top] = elem;
    }

    public long pop() {
        if (top == -1) throw new RuntimeException("Stack is empty");
        return data[top--];
    }

    public long peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == data.length - 1);
    }

}
