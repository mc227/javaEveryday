package javaEveryday.com.datastructures;

import java.util.Optional;

public class StackArray<V> {
    private V[] array;
    private int headPtr = 0;

    // Implementing a Stack using an array involves first initializing an empty array
    // with a fixed size.
    public StackArray(int capacity) {
        array = (V[]) new Object[capacity];
    }
    //keep an index pointer at the top of the stack
    public void push(V item) {
        array[headPtr++] = item;
    }

    // we reduce this pointer by one and read the value
    public Optional<V> pop(){
        if(headPtr>0) return Optional.of(array[--headPtr]);
        else return Optional.empty();
    }
}
