package javaEveryday.com.datastructures;

import java.util.Optional;

public class QueueArray<V> {
    private int headPtr = 0;
    private int tailPtr = 0;
    private V[] array;

    public QueueArray(int capacity) {
        array = (V[]) new Object[capacity];
    }

    /**
     * Notice that when we enqueue an item,
     * we place it at the tail position and
     * increment the tail pointer using the
     * mod operator. When the pointer is
     * larger or equal to the size of the
     * array, it wraps around and starts
     * again from zero. The same happens
     * on the dequeue method, where we
     * access and increment the head
     * pointer in a similar fashion.
     */
    public void enqueue(V item){
        array[tailPtr] = item;
        tailPtr = (tailPtr + 1) % array.length;
    }

    public Optional<V> dequeue(){
        if(headPtr != tailPtr) {
            Optional<V> item = Optional.of(array[headPtr]);
            headPtr = (headPtr+1) % array.length;
            return item;
        } else {
            return Optional.empty();
        }
    }
}
