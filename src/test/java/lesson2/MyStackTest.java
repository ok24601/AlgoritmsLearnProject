package lesson2;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class MyStackTest {

    MyStack stack;

    @Before
    public void init() {
        stack = new MyStack();
    }

    @Test
    public void pushPopTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assert stack.pop() == 3;
        assert stack.pop() == 2;
        assert stack.pop() == 1;
    }
    @Test
    public void isEmptyTest() {
        assert stack.isEmpty();
    }
    @Test
    public void isFullTest() {
        // Default stack size is 10
        IntStream.rangeClosed(0, 9).forEach(i -> stack.push(i));
        assert stack.isFull();
    }
    @Test
    public void peekTest() {
        stack.push(10);
        assert stack.peek() == 10;
        assert !stack.isEmpty();
    }
    @Test(expected = RuntimeException.class)
    public void popEmptyStackTest() {
        stack.pop();
    }

    @Test(expected = RuntimeException.class)
    public void pushFullStackTest() {
        IntStream.rangeClosed(0, 10).forEach(i -> stack.push(i));
    }
}
