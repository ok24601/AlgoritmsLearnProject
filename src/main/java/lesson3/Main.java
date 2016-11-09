package lesson3;

/**
 * Created by ok on 09.11.16.
 */
public class Main {

    public static void main(String[] args) {
        MySortedList list = new MySortedList();

        list.insert(6);
        list.insert(3);
        list.insert(61);
        list.insert(8);
        list.insert(1);

        list.printAll();
    }
}
