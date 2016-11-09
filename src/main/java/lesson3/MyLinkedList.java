package lesson3;

/**
 * Created by ok on 09.11.16.
 */
public class MyLinkedList {

    private Node first;

    public MyLinkedList() {
    }

    public void insert(long value) {
        Node cur = new Node(value);
        cur.next = first;
        first = cur;
    }

    public void delete() {
        first = first.next;
    }

    public void printAll() {
        Node cur = first;
        while (cur != null) {
            cur.displayNode();
            cur = cur.next;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
}
