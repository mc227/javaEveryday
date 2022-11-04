package javaEveryday.com.datastructures;

import java.util.Optional;

public class Queue <V>{
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    /**
     dequeue(head)
        if(head != null)
            node = head
            head = head.next
            if(head != null) head.previous = null
            return node.value
        return null
     * */
    public Optional<V> dequeue(){
        Optional<DblLinkedListNode<V>> node = Optional.ofNullable(head);
        head = node.flatMap(DblLinkedListNode::getNext).orElse(null);
        Optional.ofNullable(head).ifPresent(n ->n.setPrevious(null));
        if(head==null) tail = null;
        return node.map(DblLinkedListNode::getValue);
    }
    /**
     enqueue(tail, item)
        node = new Node(item)
        node.previous = tail
        if(tail!=null) tail.next = node
        tail = node
        if(head == null) head = node
     * */
    public void enqueue(V item) {
        DblLinkedListNode<V> node = new DblLinkedListNode<>(item, null, tail);
        Optional.ofNullable(tail).ifPresent(n->n.setNext(node));
        tail = node;
        if(head==null) head = node;
    }
}
