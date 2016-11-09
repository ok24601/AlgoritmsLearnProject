package lesson3;

/**
 * Created by ok on 09.11.16.
 */
public class Node {

    public long value;
    public Node next;

    public Node(long value) {
        this.value = value;
    }

    public void displayNode() {
        System.out.print(value + " ");
    }


}
