package lesson3;

/**
 * Created by ok on 09.11.16.
 */
public class MyFirstLastList {

    private Node first, last;

    public MyFirstLastList() {
    }

    public void insertFirst(long value) {
        Node cur = new Node(value);
        if(first == null) {
            first = cur;
            last = cur;
        }
        else {
            cur.next = first;
            first = cur;
        }


    }

    public void insertLast(long value) {
        Node cur = new Node(value);
        if(last == null) {
            last = cur;
            first = cur;
        }
        else {
            last.next = cur;
            last = cur;
        }


    }
    public void printAll() {
        Node cur = first;
        while (cur != null) {
            cur.displayNode();
            cur = cur.next;
        }
    }

}
