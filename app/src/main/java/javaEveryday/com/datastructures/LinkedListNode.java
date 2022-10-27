package javaEveryday.com.datastructures;

public class LinkedListNode<V>{
    private V value;
    private LinkedListNode<V> next;
    public LinkedListNode(V value, LinkedListNode<V> next) {
        this.value = value;
        this.next = next;
    }
}
