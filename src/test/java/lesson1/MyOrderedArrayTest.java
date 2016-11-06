package lesson1;

import org.junit.Before;
import org.junit.Test;

public class MyOrderedArrayTest {

    public static final int SIZE = 5;
    MyOrderedArray array;

    @Before
    public void init() {
        long[] arr = new long[SIZE];
        for(int i = 0; i < SIZE; i++)
            arr[i] = i;

        array = new MyOrderedArray(arr);
    }

    @Test
    public void insertTest() {
        array.printAll();
        array.insert(50);
        array.printAll();
        array.insert(20);
        array.printAll();
        array.insert(30);
        array.printAll();
        array.insert(60);

        array.printAll();

    }
    @Test
    public void binSearchIttTest() {
        array.insert(122);
        assert array.binSearchItt(122) != -1;
    }

    @Test
    public void getTest() {
        assert array.get(0) == 0;
    }

    @Test
    public void deleteTest() {
        int size = array.size();
        array.printAll();
        array.delete(0);
        array.printAll();

        assert size - 1 == array.size();

    }

}
