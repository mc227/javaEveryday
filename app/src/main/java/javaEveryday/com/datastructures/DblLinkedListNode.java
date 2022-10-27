package javaEveryday.com.datastructures;

public class DblLinkedListNode<V> {
    private V value;
    private DblLinkedListNode<V> next;
    private DblLinkedListNode<V> previous;

    public DblLinkedListNode(V value, DblLinkedListNode<V> next, DblLinkedListNode<V> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
