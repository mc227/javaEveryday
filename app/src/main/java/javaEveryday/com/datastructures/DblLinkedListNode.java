package javaEveryday.com.datastructures;

import java.util.Optional;

public class DblLinkedListNode<V> {
    private V value;
    private DblLinkedListNode<V> next;
    private DblLinkedListNode<V> previous;

    public DblLinkedListNode(V value,
                             DblLinkedListNode<V> next,
                             DblLinkedListNode<V> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public Optional<DblLinkedListNode<V>> getNext() {
        return Optional.ofNullable(next);
    }

    public Optional<DblLinkedListNode<V>> getPrevious() {
        return Optional.ofNullable(previous);
    }

    public V getValue() {
        return value;
    }

    public DblLinkedListNode<V> setValue(V value) {
        this.value = value;
        return this;
    }


    public DblLinkedListNode<V> setNext(DblLinkedListNode<V> next) {
        this.next = next;
        return this;
    }


    public DblLinkedListNode setPrevious(DblLinkedListNode<V> previous) {
        this.previous = previous;
        return this;
    }

    public static void main(String[] args) {
        DblLinkedListNode<Integer> four = new DblLinkedListNode<>(4,null,null);
        four.setNext(new DblLinkedListNode<>(2,null,null));
        System.out.println(four.toString());
    }
}
