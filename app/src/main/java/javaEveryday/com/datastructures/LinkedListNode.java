package javaEveryday.com.datastructures;

import java.util.Optional;

public class LinkedListNode<V> {
    private V value;
    private LinkedListNode<V> next;
    public LinkedListNode(V value, LinkedListNode<V> next) {
        this.value = value;
        this.next = next;
    }

    public Optional<LinkedListNode<V>> getNext() {
        return Optional.ofNullable(next);
    }
    public V getValue() {
        return value;
    }

    public LinkedListNode setValue(V value) {
        this.value = value;
        return this;
    }

    public LinkedListNode setNext(LinkedListNode<V> next) {
        this.next = next;
        return this;
    }

    public static void main(String[] args) {
        /*
        Figure 2-5
        */
        LinkedListNode<Integer> nine = new LinkedListNode<>(9, null);
        LinkedListNode<Integer> three = new LinkedListNode<>(3, nine);
        LinkedListNode<Integer> seven = new LinkedListNode<>(7, three);
        LinkedListNode<Integer> two = new LinkedListNode<>(2, seven);
        LinkedListNode<Integer> four = new LinkedListNode<>(4, two);
    }
}
