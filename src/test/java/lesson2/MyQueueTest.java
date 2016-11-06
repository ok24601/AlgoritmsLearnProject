package lesson2;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class MyQueueTest {

    MyQueue queue;

    @Before
    public void init() {
        queue = new MyQueue();
        System.out.println("----------------------------");
    }

    @Test
    public void insertRemoveTest() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.printAll();

        assert queue.remove() == 1;
        assert queue.remove() == 2;
        assert queue.remove() == 3;
        assert queue.size() == 0;
        assert queue.isEmpty();
        queue.printAll();
    }
    @Test
    public void cyclicStoreTest() {
        IntStream.range(0, 10).forEach(i -> queue.insert(i));
        queue.printAll();
        IntStream.range(0,5).forEach(i -> queue.remove());
        queue.printAll();
        IntStream.range(20, 25).forEach(i -> queue.insert(i));
        queue.printAll();
    }

    @Test
    public void isEmptyTest() {
        assert queue.isEmpty();
        queue.insert(21);
        assert !queue.isEmpty();
    }
    @Test
    public void isFullTest() {
        // default size is 11
        IntStream.rangeClosed(0, 10).forEach(i -> queue.insert(i));
        assert queue.isFull();
    }

}
