package lesson1;


public class MyOrderedArray {

    private long array[];
    private int nEllem;
    private int capacity;

    public MyOrderedArray() {
        capacity = 12;
        array = new long[capacity];
        nEllem = 0;
    }

    public MyOrderedArray(long[] arr) {
        this.nEllem = arr.length;
        capacity = arr.length * 5;
        array = new long[capacity];

        for (int i = 0; i < nEllem; i++)
            array[i] = arr[i];
    }

    public void printAll() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < nEllem; i++) {
            stringBuilder.append(" " + array[i] + " ");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

    public void insert(long value) {
        System.out.println("value: " + value);
        int currentIndex = 0;
        for (int i = 0; i < nEllem; i++)
            if (value < array[i]) {
                System.out.println("curent index " + i + " nElem = " + nEllem + " arr[i] = " + array[i]);
                currentIndex = i;
            }
        if (currentIndex == 0) {
            array[nEllem] = value;
            nEllem++;
        } else {
            for (int i = currentIndex; i < nEllem + 1; i++) {
                array[i + 1] = array[i];
            }
            array[currentIndex] = value;
            nEllem++;
        }
    }

    public int binSearchItt(long value) {
        int lowerBound = 0;
        int upperBound = nEllem - 1;
        int curIndex = (lowerBound + upperBound) / 2;

        if (value < array[0] || value > array[nEllem - 1])
            return -1;
        while (true) {
            if (curIndex == nEllem || curIndex == -1) {
                System.out.printf("V: %d not found", value);
                return -1;
            } else if (array[curIndex] == value) {
                System.out.printf("found value: %d by index: %d \n", value, curIndex);
                return curIndex;
            } else if (array[curIndex] > value) {
                System.out.println(value + " is lower then " + array[curIndex]);
                curIndex--;
                upperBound = curIndex;
                curIndex = (lowerBound + upperBound) / 2;
            } else if (array[curIndex] < value) {
                System.out.println(value + " is higher then " + array[curIndex]);
                curIndex++;
                lowerBound = curIndex;
                curIndex = (lowerBound + upperBound) / 2;
            }
            System.out.printf("new bounds %d %d \n", lowerBound, upperBound);
        }
    }

    public void delete(long value) {
        int index = binSearchItt(value);
        for (int i = index; i < nEllem; i++) {
            array[i] = array[i + 1];
        }
        nEllem--;
    }

    public void merge(long arr[]) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public int size() {
        return nEllem;
    }

    public long get(int i) {
        if (i < 0 || i > nEllem - 1) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        return array[i];
    }


}
