package lesson3;

/**
 * Created by ok on 09.11.16.
 */
public class MySortedList {

    private Node first;

    public void insert(long val) {
    // TODO!!!

    }


    public void printAll() {
        Node cur = first;
        while (cur != null) {
            cur.displayNode();
            cur = cur.next;
        }
    }
}
