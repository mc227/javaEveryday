package javaEveryday.com.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class LinkedListNode<V> {
    private V value;
    private LinkedListNode<V> next;

    public LinkedListNode(V value, LinkedListNode<V> next) {
        this.value = value;
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public LinkedListNode setValue(V value) {
        this.value = value;
        return this;
    }

    public Optional<LinkedListNode<V>> getNext() {
        return Optional.ofNullable(next);
    }

    public LinkedListNode setNext(LinkedListNode<V> next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                '}';
    }
}
