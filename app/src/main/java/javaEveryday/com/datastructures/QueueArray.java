package javaEveryday.com.datastructures;


import java.util.Arrays;
import java.util.Optional;

public class QueueArray<V> {
    private V[] array;
    private int headPtr = 0;
    private int tailPtr = 0;
    private boolean full = false;

    public QueueArray(int capacity) {
        array = (V[]) new Object[capacity];
    }

    public void enqueue(V item) {
        array[tailPtr] = item;
        tailPtr = (tailPtr + 1) % array.length;
    }

    public Optional<V> dequeue() {
        if (headPtr != tailPtr) {
            Optional<V> item = Optional.of(array[headPtr]);
            headPtr = (headPtr + 1) % array.length;
            return item;
        } else return Optional.empty();
    }


    public static void main(String[] args) {
        QueueArray<String> q = new QueueArray<>(5);

        q.enqueue("one");
        System.out.println(q.toString());
        q.enqueue("two");
        System.out.println(q.toString());
        q.enqueue("three");
        System.out.println(q.toString());
        q.enqueue("four");
        System.out.println(q.toString());
        q.enqueue("five");
        System.out.println(q.toString());
        q.enqueue("six");
        System.out.println(q.toString());

        System.out.println(q.dequeue());
        System.out.println(q.toString());
        System.out.println(q.dequeue());
        System.out.println(q.toString());
        System.out.println(q.dequeue());
        System.out.println(q.toString());
        System.out.println(q.dequeue());
        System.out.println(q.toString());
        System.out.println(q.dequeue());
        System.out.println(q.toString());
        System.out.println(q.dequeue());
        System.out.println(q.toString());


    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "array=" + Arrays.toString(array) +
                ", headPtr=" + headPtr +
                ", tailPtr=" + tailPtr +
                ", full=" + full +
                '}';
    }
}