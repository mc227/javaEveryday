package javaEveryday.com.datastructures;

import java.util.Optional;

public class StackArray<V> {
    /**
     * Implementing a stack using
     * an array involves first
     * initializing an empty
     * array with a fixed size.
     * Then, it's a matter of
     * keeping an index pointer
     * to the top of the stack,
     * initially pointing to zero.
     * As we push items on the stack,
     * we place the item at this index
     * and increment the pointer by one.
     * When we need to pop an element,
     * we reduce this pointer by one and read the value.
     */
    private V[] array;
    private int headPtr = 0;

    public StackArray(int capacity) {
        array = (V[]) new Object[capacity];
    }
    public void push(V item) {
        array[headPtr++] = item;
    }
    public Optional<V> pop(){
        if(headPtr>0) return Optional.of(array[--headPtr]);
        else return Optional.empty();
    }
}
