package lesson2;

public class MyQueue {

    private long data[];
    private int capacity;
    private int front, back;

    private int nElem;

    public MyQueue() {
        capacity = 12;
        data = new long[capacity];
        nElem = 0;
        front = 0;
        back = -1;
    }

    public void insert(long value) {
        if(isFull()) {
            throw new RuntimeException("The Q is full!");
        }
        back++;
        if(back == data.length)
            back = 0;
        data[back] = value;
        nElem++;
    }

    public long remove() {
        if(isEmpty())
            throw new RuntimeException("The Q is empty!");
        long value = data[front];
        front++;
            if(front == data.length )
                front = 0;
        nElem--;
        return value;
    }

    public long peek() {
        if(isEmpty())
            throw new RuntimeException("The Q is empty!");
        return data[front];
    }

    public boolean isEmpty() {
        return nElem == 0;
    }

    public boolean isFull() {
        return nElem == data.length - 1;
    }

    public int size() {
        return nElem;
    }

    public void printAll() {
        System.out.print("{");
        if(isEmpty()) {
            System.out.printf(" }\n");
        }
        // Normal Q
        else if(front < back || front == back) {
            for(int i = front; i <= back; i++)
                System.out.print(" " + data[i] + " ");
            System.out.print("}\n");
        }
        // Cyclic Q
        else {
            for (int i = front; i < data.length; i++)
                System.out.print(" " + data[i] + " ");
            for(int i = 0; i <= back; i++ )
                System.out.print(" " + data[i] + " ");
            System.out.print("}\n");
        }

    }

}
