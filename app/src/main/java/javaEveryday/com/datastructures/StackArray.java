package javaEveryday.com.datastructures;

public class StackArray<V> {
    private V[] array;
    private int headPtr = 0;

    public StackArray(int capacity) {
        array = (V[]) new Object[capacity];
    }

}
