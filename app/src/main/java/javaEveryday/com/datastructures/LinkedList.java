package javaEveryday.com.datastructures;

import java.util.Optional;

/*
You set the head pointer to point to the next pointer of the node at the old head.
For completeness, you can set this next pointer to point to nothing
* */
public class LinkedList<V> {
    private LinkedListNode<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item) {
        this.head = new LinkedListNode<V>(item, head);
    }

    public void deleteFront() {
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(head);
        this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
        firstNode.ifPresent(n->n.setNext(null));
    }

}
